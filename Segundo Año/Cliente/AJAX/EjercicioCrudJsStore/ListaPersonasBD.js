var jsStoreCon = new JsStore.Connection(new Worker("jsstore/jsstore.worker.min.js"));

function BD() {
    var tblPersonas = {
        name: "personas",
        columns: {
            id: { primaryKey: true, autoIncrement: true },
            dni: { notNull: true, dataType: "string" },
            nombre: { notNull: true, dataType: "string" },
            apellidos: { notNull: false, dataType: "string" },
            fnacimiento: { notNull: true, dataType: "string" },
            estatura: { notNull: false, dataType: "number" }
        }
    };

    var database = {
        name: "personas",
        tables: [tblPersonas]
    };

    const createDB = async (db) => {
        try {
            const isDbCreated = await jsStoreCon.initDb(db);
            if (isDbCreated) {
                console.log("DB created or opened");
                insertarDatos();
            } else {
                console.log("Database opened");
            }
        } catch (ex) {
            console.error(ex);
            alert(ex.message);
        }
    };
    createDB(database);

    const insertarDatos = async () => {
        console.log("Datos iniciales");
        let valores = [
            {
                dni: "63830263M",
                nombre: "Anakin",
                apellidos: "SkyWalker",
                fnacimiento: "1991-11-12",
                estatura: 1.83
            },
            {
                dni: "91026351P",
                nombre: "Naruto",
                apellidos: "Uzumaki",
                fnacimiento: "1999-05-10",
                estatura: 1.82
            },
        ];

        try {
            let insertCount = await jsStoreCon.insert({
                into: "personas",
                values: valores
            });
            console.log(`${insertCount} fila(s) insertada(s)`);
        } catch (error) {
            console.error("Error insertando los datos", error);
        }
    };

    async function agregarPersona(nuevaPersona) {
        try {
            await jsStoreCon.insert({
                into: "personas",
                values: [nuevaPersona]
            });
            console.log("Persona añadida:", nuevaPersona);
        } catch (error) {
            console.error("Error añadiendo persona", error);
        }
    }

    async function obtenerPersonas() {
        try {
            return await jsStoreCon.select({ from: "personas" });
        } catch (error) {
            console.error("Error obteniendo personas", error);
        }
    }

    async function actualizarPersona(id, datosActualizados) {
        try {
            let count = await jsStoreCon.update({
                in: "personas",
                set: datosActualizados,
                where: { id: id }
            });
            console.log(`${count} persona(s) actualizada(s)`);
        } catch (error) {
            console.error("Error actualizando persona", error);
        }
    }

    async function eliminarPersona(id) {
        try {
            let count = await jsStoreCon.remove({
                from: "personas",
                where: { id: id }
            });
            console.log(`${count} persona(s) eliminada(s)`);
        } catch (error) {
            console.error("Error eliminando persona", error);
        }
    }

    window.agregarPersona = agregarPersona;
    window.obtenerPersonas = obtenerPersonas;
    window.actualizarPersona = actualizarPersona;
    window.eliminarPersona = eliminarPersona;
}

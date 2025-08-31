var jsStoreCon = new JsStore.Connection(new Worker("jsstore/jsstore.worker.min.js"));

function BD(){
    var tblDepartamentos ={
        name:"departamentos",
        columns:{
            id:{autoIncrement:true , primaryKey:true},
            nombre:{notNull:true, dataType:"string"},
            descripcion:{notNull:true, dataType:"string"},
        }
    };

    var tblProfesores ={
        name:"profesores",
        columns:{
            id:{autoIncrement:true, primaryKey:true},
            id_departamento:{notNull:true, dataType:"number", enableSearch: true },
            dni:{notNull:true, dataType:"string"},
            nombre:{notNull:true, dataType:"string"},
            apellidos:{notNull:true, dataType:"string"}
        }
    };

    var database ={
        name:"departamentosProfesores",
        tables:[tblDepartamentos,tblProfesores]
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


    const insertarDatos= async() =>{
        console.log("Insercion de los datos iniciales");
        let departamentos =[
            {
                id: 1,
                nombre: "Informatica",
                descripcion: "Se encarga del romanticismo, es decir, del binario. Entre otras cosas."
            },

            {
                id: 2,
                nombre: "Matematicas",
                descripcion: "Para que no te engañen cuando vas a pagar la invitación a cubatas de los amigos."
            },

            {
                id: 3,
                nombre: "Fisica",
                descripcion: "Para entender mejor porqué te caes cuando no te agarras bien"
            },

            {
                id: 4,
                nombre: "Geografia e historia",
                descripcion: "En resumen. Que es lo que pasó y ande pasó"
            }
        ]

        try {
            let insertCount = await jsStoreCon.insert({
                into: "departamentos",
                values: departamentos
            });
            console.log(`${insertCount} fila(s) insertada(s)`);
        } catch (error) {
            console.error("Error insertando los datos", error);
        }



        let profesores =[
            {
                id: 1,
                id_departamento:1,
                dni:"27473339T",
                nombre:"Marco Elio",
                apellidos:"Garcia Gomariz"
            },

            {
                id: 3,
                id_departamento:4,
                dni:"11223344L",
                nombre:"Doctor",
                apellidos:"Livingstone"
            },

            {
                id: 4,
                id_departamento:4,
                dni:"11111111L",
                nombre:"Aurelio",
                apellidos:"Santos"
            },

            {
                id: 5,
                id_departamento:4,
                dni:"93475816H",
                nombre:"Carlos",
                apellidos:"Garcia Santos"
            },

            {
                id: 6,
                id_departamento:1,
                dni:"12893456I",
                nombre:"Pancracio",
                apellidos:"Romero"
            },

            {
                id: 7,
                id_departamento:2,
                dni:"21345678G",
                nombre:"Roberto",
                apellidos:"Tototototo"
            },

            {
                id: 8,
                id_departamento:2,
                dni:"23897346",
                nombre:"Agustin",
                apellidos:"51"
            },

            {
                id: 9,
                id_departamento:2,
                dni:"14894567R",
                nombre:"Cloud",
                apellidos:"Strife"
            },

            {
                id: 10,
                id_departamento:1,
                dni:"90023467",
                nombre:"Militec",
                apellidos:"Culiacan"
            },

            {
                id: 11,
                id_departamento:2,
                dni:"91453918D",
                nombre:"Ruben",
                apellidos:"Doblas"
            },

            {
                id: 12,
                id_departamento:3,
                dni:"89895643C",
                nombre:"Paqui",
                apellidos:"Bornes"
            },

            {
                id: 13,
                id_departamento:3,
                dni:"91919191T",
                nombre:"Juan Carlos",
                apellidos:"Calero"
            },

            {
                id: 14,
                id_departamento:3,
                dni:"67892382C",
                nombre:"Juan",
                apellidos:"Pineda"
            },

            {
                id: 15,
                id_departamento:3,
                dni:"12349876A",
                nombre:"Luis",
                apellidos:"Garcia"
            },

            {
                id: 16,
                id_departamento:3,
                dni:"88888888R",
                nombre:"Julian",
                apellidos:"Alvarez"
            },

            {
                id: 17,
                id_departamento:3,
                dni:"01297346U",
                nombre:"Pedro",
                apellidos:"Picapiedra"
            },

            {
                id: 18,
                id_departamento:3,
                dni:"78563412H",
                nombre:"Claudia",
                apellidos:"Bellido"
            },

            {
                id: 19,
                id_departamento:1,
                dni:"90909067V",
                nombre:"Messi",
                apellidos:"Pulga"
            },

            {
                id: 20,
                id_departamento:1,
                dni:"18375861N",
                nombre:"Pedro",
                apellidos:"Roldan"
            },

            {
                id: 21,
                id_departamento:1,
                dni:"92674532M",
                nombre:"Daniel",
                apellidos:"Cabeza"
            },

            {
                id: 22,
                id_departamento:1,
                dni:"09785689P",
                nombre:"Gustavo",
                apellidos:"Solomon"
            },

            {
                id: 221,
                id_departamento:4,
                dni:"10108228H",
                nombre:"Cristian",
                apellidos:"Gomez Moya"
            },

            {
                id: 227,
                id_departamento:4,
                dni:"12345623P",
                nombre:"Juan",
                apellidos:"Jimenez"
            },

            {
                id: 136,
                id_departamento:4,
                dni:"89895632C",
                nombre:"Alberto",
                apellidos:"Marin"
            },

            {
                id: 232,
                id_departamento:4,
                dni:"77788899B",
                nombre:"Mister",
                apellidos:"Jagger"
            },
        ]

        try {
            let insertCount = await jsStoreCon.insert({
                into: "profesores",
                values: profesores
            });
            console.log(`${insertCount} fila(s) insertada(s)`);
        } catch (error) {
            console.error("Error insertando los datos", error);
        }
    }



    async function obtenerDepartamentos() {
        try{
            return await jsStoreCon.select({from:"departamentos"});
        }catch(error){
            console.error("Error obteniendo los departamentos",error);
        }
    }

    async function anadirDepartamento(nuevoDepartamento) {
        try{
            return await jsStoreCon.insert({
                into: "departamentos",
                values:[nuevoDepartamento]
            });
        }catch(error){
            console.error("Error al agregar el nuevo departamento",error);
        }   
    }


    async function obtenerProfesores(idDep) {
        try{
            return await jsStoreCon.select({
                from:"profesores",
                where: { id_departamento: idDep }
            });
        }catch(error){
            console.error("Error obteniendo los profesores",error);
        }
    }


    async function agregarProfesores(profesor){
        try{
            return await jsStoreCon.insert({
                into: "profesores",
                values:[profesor]
            });
            
        }catch(error){
            console.error("Se ha producido un error al agregar un nuevo profesor")
        }
    }


    async function borrarPersona(idProfe) {
        try{
            return await jsStoreCon.remove({
                from:"profesores",
                where:{id: idProfe}
            })
        }catch(error){
            console.error("Error al borrar la persona", error)
        }
    }

    async function editarPersona(idProfe,personaEditada) {
        try{
            return await jsStoreCon.update({
                in:" profesores",
                set: personaEditada,
                where: {id:idProfe}
            });
        }catch(error){
            console.error("Error al editar la persona", error);
        }
    }


    window.obtenerDepartamentos = obtenerDepartamentos;
    window.anadirDepartamento = anadirDepartamento;
    window.obtenerProfesores = obtenerProfesores;
    window.agregarProfesores = agregarProfesores;
    window.borrarPersona = borrarPersona;
    window.editarPersona = editarPersona;
}    
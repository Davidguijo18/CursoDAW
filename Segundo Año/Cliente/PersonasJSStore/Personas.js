var jsStoreCon = new JsStore.Connection(new Worker("jsstore/jsstore.worker.min.js"));
function BD(){

    var tablaPersonas={
        name: "personas",
        columns:{
            id: {primaryKey: true, autoIncrement: true},
            dni: {notNull: true, dataType: "string"},
            nombre: {notNull: true, dataType: "string"},
            apellidos: {notNull: false, dataType: "string"},
            fnacimiento: {notNull: true, dataType: "date_time"},
            estatura: {notNull: false, dataType: "number"}
        }
    }




    var database ={
        name:"personasDatos",
        tables: [tablaPersonas]
    }




    const createDB = async (db)=>{
		try {
			const isDbCreated = await jsStoreCon.initDb(db);
			if(isDbCreated === true){
				console.log("db created");
				await insertarDatosIniciales();
			}
			else {
				console.log("db opened");
			}
		}
		catch (ex) {
			console.log(ex);
			console.log(ex.message);
			alert(ex.message);
		}
	}
	createDB(database);




    const insertarDatosIniciales = async() =>{
        console.log("Insercion de los datos iniciales");

        let valores = [
            {
                dni: "73928364L",
                nombre: "Sasuke",
                apellidos: "Uchiha",
                fnacimiento: "2002-10-10",
                estatura: 1.80
            },

            {
                dni: "93851274M",
                nombre: "Naruto",
                apellidos: "Uzumaki",
                fnacimiento: "2002-07-12",
                estatura: 1.85
            }
        ]

        let insertCount = await jsStoreCon.insert({
            into: "personas",
            values: valores
        });
        console.log(`${insertCount} filas insertadas (personas)`);
    }
}




const mostrarPersonas = async() =>{
    console.log("Vamos a mostrar las personas");
    try {
        return await jsStoreCon.select({from: "personas"});
    }catch(error){
        console.error("Error al obtener personas: ",error);
    }
}


const insertarPersona = async(persona) =>{
    try {
        await jsStoreCon.insert({
            into: "personas",
            values: [persona]
        })
        console.log("Una persona ha sido añadida: ",persona);

    }catch(error){
        console.error("Error al agregar una persona");
    }
}

window.mostrarPersonas = mostrarPersonas;
window.insertarPersona = insertarPersona;
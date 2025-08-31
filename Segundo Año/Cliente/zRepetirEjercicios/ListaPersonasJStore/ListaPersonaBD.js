var jsStoreCon = new JsStore.Connection(new Worker("jsstore/jsstore.worker.min.js"));
function BD(){

    var tablaPersonas= {
        name: "personas",
        columns: {
            id:{primaryKey:true,autoIncrement:true},
            dni:{notNull:true, dataType:"string"},
            nombre:{notNull:true, dataType:"string"},
            apellidos:{notNull:false, dataType:"string"},
            fechaNacimiento:{notNull:true, dataType:"string"},
            estatura:{dataType:"int"}
        }
    }

    var database ={
        name:"personaBaseDatos",
        tables:[tablaPersonas]
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

const anadirPersona= async(persona)=>{

}

const mostrarTodos= async()=>{
    console.log("Vamos a mostrar las personas");
    try {
        return await jsStoreCon.select({from: "personas"});
    }catch(error){
        console.error("Error al obtener personas: ",error);
    }
}

const eliminarPersona= async(id)=>{

}

const editarPersona= async(id,persona)=>{

}

window.mostrarTodos = mostrarTodos;
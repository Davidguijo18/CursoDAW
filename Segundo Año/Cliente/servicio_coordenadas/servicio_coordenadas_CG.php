<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8"/>
    <title>Examen Coordenadas</title>
    <style type="text/css">
        span { color: red; }
        .resultado { text-align: center; font-size: 1.5em; color: maroon; }
    </style>
    <script type="text/javascript" src="pAJAX.js"></script>
    <script type="text/javascript">
        // Instancia de pAJAX para hacer peticiones AJAX
        let peticion = new pAJAX();
        let url = 'servicio_coordenadas.php';
        let filaAleatoria, columnaAleatoria;

        window.onload = function() {
            obtenerRangos();
            document.getElementById("btValidar").onclick = validarEntrada;
        };

        function obtenerRangos() {
            // Obtener rango de filas
            peticion.peticion(url, "POST", function(filas) {
                const rangoFilas = filas.split(""); // Parse de respuesta en filas
                filaAleatoria = rangoFilas[Math.floor(Math.random() * rangoFilas.length)];
                
                // Obtener rango de columnas después de las filas
                peticion.peticion(url, "POST", function(columnas) {
                    const rangoColumnas = columnas.split("");
                    columnaAleatoria = rangoColumnas[Math.floor(Math.random() * rangoColumnas.length)];
                    mostrarCoordenadas();
                }, "servicio=rangoColumnas");
            }, "servicio=rangoFilas");
        }

        function mostrarCoordenadas() {
            // Mostrar coordenadas aleatorias al usuario
            document.getElementById("coordenadas").innerHTML = `${filaAleatoria}${columnaAleatoria}`;
        }

        function validarEntrada() {
            const valorUsuario = document.getElementById("valor").value.trim();
            if (valorUsuario === "") {
                alert("Por favor, introduce un valor.");
                return;
            }

            // Configurar la petición para validar la coordenada
            const parametros = JSON.stringify({
                servicio: "elemento",
                fila: filaAleatoria,
                columna: columnaAleatoria
            });

            peticion.peticion(url, "POST", function(respuesta) {
                mostrarResultado(valorUsuario == respuesta);
            }, parametros);
        }

        function mostrarResultado(correcto) {
            const mensaje = correcto ? "Correcto" : "Incorrecto";
            document.querySelector(".resultado").innerHTML = mensaje;
        }
    </script>
</head>
<body>
    <h1>Acceso al sistema</h1>
    <form>
        <p>
            <h3>Sistema de validación según tarjeta de coordenadas:</h3>
            <label for="valor">Introduzca el valor para las coordenadas: <span id="coordenadas"> </span></label><br>
            <input type="text" id="valor" maxlength="2" size="1" autofocus />
            <span id="info_valor"> </span>
            <br><br>
        </p>
        <p class="resultado"></p>
        <p><input type="button" id="btValidar" value="ACEPTAR"></p>
    </form>
</body>
</html>

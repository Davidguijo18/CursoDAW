const urlApi = 'msapi.php';

        document.addEventListener('DOMContentLoaded', cargarCartas);

        async function cargarCartas() {
            try {
                const respuesta = await fetch(urlApi);
                const cartas = await respuesta.json();
                const contenedor = document.getElementById('contenedor-cartas');
                contenedor.innerHTML = '';

                if (cartas.length > 0) {
                    cartas.forEach(carta => {
                        const cartaHTML = `
                            <div class="card mb-3" style="width: 18rem;">
                                <img src="Imagen/${carta.imagen}" class="card-img-top" alt="${carta.nombre}" style="height: 250px; object-fit: cover;">
                                <div class="card-body">
                                    <h5 class="card-title">${carta.nombre}</h5>
                                    <p class="card-text">Tipo: ${carta.tipo} - Rango: ${carta.rareza}</p>
                                    <p class="card-text">Coste de Elixir: ${carta.coste_elixir}</p>
                                    <p class="card-text">Vida: ${carta.vida} | Daño: ${carta.dano}</p>
                                    <p class="card-text">Alcance: ${carta.alcanze}</p>
                                    <button class="btn btn-warning btn-sm" onclick="abrirModalEditar(${carta.id})">Editar</button>
                                    <button class="btn btn-danger btn-sm" onclick="eliminarCarta(${carta.id})">Eliminar</button>
                                </div>
                            </div>
                        `;
                        contenedor.insertAdjacentHTML('beforeend', cartaHTML);
                    });
                } else {
                    contenedor.innerHTML = '<p class="text-white">No se encontraron cartas.</p>';
                }
            } catch (error) {
                console.error('Error al cargar las cartas:', error);
            }
        }

        function abrirModalAgregar() {
            document.getElementById('formAgregar').reset();
            new bootstrap.Modal(document.getElementById('modalAgregar')).show();
        }

        async function abrirModalEditar(id) {
            try {
                const respuesta = await fetch(`${urlApi}?id=${id}`);
                const carta = await respuesta.json();

                document.getElementById('idCarta').value = carta.id;
                document.getElementById('editNombre').value = carta.nombre;
                document.getElementById('editTipo').value = carta.tipo;
                document.getElementById('editRareza').value = carta.rareza;
                document.getElementById('editCosteElixir').value = carta.coste_elixir;
                document.getElementById('editVida').value = carta.vida;
                document.getElementById('editDano').value = carta.dano;
                document.getElementById('editAlcanze').value = carta.alcanze;

                new bootstrap.Modal(document.getElementById('modalEditar')).show();
            } catch (error) {
                console.error('Error al abrir el modal de edición:', error);
            }
        }

        if (typeof require !== 'undefined') {
            const { validarCarta } = require('./validaciones');
        }
        
        async function guardarCarta(accion) {
            try {
                const formulario = document.getElementById(accion === 'agregar' ? 'formAgregar' : 'formEditar');
                
                //Campos que voy a validar del formulario
                const carta = {
                    vida: parseInt(formulario.vida.value),
                    coste_elixir: parseInt(formulario.coste_elixir.value),
                    alcanze: parseInt(formulario.alcanze.value),
                    dano: parseInt(formulario.dano.value)
                };
                
                //Esta validación no tiene nada que ver con el jest
                const validacion = validarCarta(carta);
                if (validacion !== true) {
                    alert(validacion.join());
                    return;
                }
        
                const datos = new FormData(formulario);
                if (accion === 'editar') {
                    datos.append('id', document.getElementById('idCarta').value);
                    datos.append('_method', 'PUT');
                }
        
                const respuesta = await fetch(urlApi, {
                    method: 'POST',
                    body: datos
                });
        
                const resultado = await respuesta.json();
                console.log(resultado);
                cargarCartas();
        
                const modalId = accion === 'agregar' ? 'modalAgregar' : 'modalEditar';
                bootstrap.Modal.getInstance(document.getElementById(modalId)).hide();
            } catch (error) {
                console.error('Error al guardar la carta:', error);
            }
        }

        async function eliminarCarta(id) {
            if (confirm('¿Estás seguro de eliminar esta carta?')) {
                try {
                    const respuesta = await fetch(`${urlApi}?id=${id}`, {
                        method: 'DELETE'
                    });
                    const resultado = await respuesta.text();
                    console.log(resultado);
                    cargarCartas();
                } catch (error) {
                    console.error('Error al eliminar la carta:', error);
                }
            }
        }
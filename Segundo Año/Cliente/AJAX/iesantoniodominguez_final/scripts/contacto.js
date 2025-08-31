document.getElementById('formContacto').addEventListener('submit', function(e) {
  const nombre = document.getElementById('nombre').value.trim();
  const email = document.getElementById('email').value.trim();
  const asunto = document.getElementById('asunto').value.trim();
  const mensaje = document.getElementById('mensaje').value.trim();

  if (!nombre || !email || !asunto || !mensaje) {
    alert('Por favor, completa todos los campos.');
    e.preventDefault();
  }
});
  
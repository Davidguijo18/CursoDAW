<?php

include 'Conexion.php';
$codigo = $_GET['codigo'];

$consulta = "SELECT * FROM producto WHERE codigo = '$codigo'";
$resultado = $conexion->query($consulta);

while ($fila = $resultado->fetch_assoc()) {
   $producto[] = array_map('utf8_encode', $fila);
}

echo json_encode($producto);
$resultado->close();

?>
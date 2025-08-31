<?php

include 'Conexion.php';
$id = $_GET['codigo'];

$consulta = "SELECT * FROM mercado WHERE id = '$id'";
$resultado = $conexion->query($consulta);

while ($fila = $resultado->fetch_assoc()) {
   $producto[] = array_map('utf8_encode', $fila);
}

echo json_encode($producto);
$resultado->close();

?>
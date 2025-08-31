<?php

include 'Conexion.php';
$id=$_POST['id'];
$nombre=$_POST['nombre'];
$ubicacion=$_POST['ubicacion'];
$feinicio=$_POST['fecha_inicio'];
$fefin=$_POST['fecha_fin'];

$consulta="INSERT INTO mercado VALUES('".$id."', '".$nombre."','".$ubicacion."','".$feinicio."','".$fefin."')";
mysqli_query($conexion, $consulta) or die(mysqli_error());
mysqli_close($conexion);

?>
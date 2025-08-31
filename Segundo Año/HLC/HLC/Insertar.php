<?php

include 'Conexion.php';
$codigo=$_POST['codigo'];
$nombre=$_POST['nombre'];
$precio=$_POST['precio'];
$fabricante=$_POST['fabricante'];

$consulta="insert into producto values('".$codigo."', '".$nombre."','".$precio."','".$fabricante."')";
mysqli_query($conexion, $consulta) or die(mysqli_error());
mysqli_close($conexion);

?>
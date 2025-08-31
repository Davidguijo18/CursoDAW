<?php

include 'Conexion.php';
$codigo=$_POST['codigo'];
$nombre=$_POST['nombre'];
$precio=$_POST['precio'];
$fabricante=$_POST['fabricante'];

$consulta="update producto set nombre = '".$nombre."', precio='".$precio."', fabricante='".$fabricante."' where codigo = '".$codigo."'";
mysqli_query($conexion, $consulta) or die(mysqli_error());
mysqli_close($conexion);

?>
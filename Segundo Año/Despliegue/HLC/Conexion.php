<?php

$hostname= 'localhost';
$database= 'dwes_manana_mercado';
$username= 'root';
$password= '';

$conexion= new mysqli($hostname, $username, $password, $database);
if ($conexion->connect_errno) {
	echo "Lo sentimos, error al conectar";
}

?>
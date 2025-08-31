<?php
$servidor = "localhost";
$usuario = "root";
$contraseña = "";
$basedatos = "ClashRoyaleDB";

header("Access-Control-Allow-Origin:*");
header("Access-Control-Allow-Credentials:true");
header("Access-Control-Allow-Methods:GET,HEAD,OPTIONS,POST,PUT,DELETE");
header("Access-Control-Allow-Headers:Access-Control-Allow-Headers,Origin,X-Requested-With,Content-Type,Accept,Authorization");
header('Content-Type: application/json');

$conexion = new mysqli($servidor, $usuario, $contraseña, $basedatos);

if ($conexion->connect_error) {
    die("Error de conexión: " . $conexion->connect_error);
}

function subirImagen($archivoImagen) {
    $directorio = "Imagen/";
    $rutaArchivo = $directorio . basename($archivoImagen["name"]);
    $tipoArchivo = strtolower(pathinfo($rutaArchivo, PATHINFO_EXTENSION));

    $esImagen = getimagesize($archivoImagen["tmp_name"]);
    if ($esImagen !== false) {
        if (move_uploaded_file($archivoImagen["tmp_name"], $rutaArchivo)) {
            return basename($archivoImagen["name"]);
        }
    }
    return null;
}

if ($_SERVER['REQUEST_METHOD'] == 'POST' && !isset($_POST['_method'])) {
    $nombre = $_POST['nombre'];
    $tipo = $_POST['tipo'];
    $rareza = $_POST['rareza'];
    $costeElixir = intval($_POST['coste_elixir']);
    $vida = intval($_POST['vida']);
    $dano = intval($_POST['dano']);
    $alcanze = intval($_POST['alcanze']);
    $imagen = subirImagen($_FILES['imagen']);

    if ($imagen) {
        $consulta = $conexion->prepare("INSERT INTO Cartas (nombre, tipo, rareza, coste_elixir, vida, dano, alcanze, imagen) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
        $consulta->bind_param("sssiiiis", $nombre, $tipo, $rareza, $costeElixir, $vida, $dano, $alcanze, $imagen);

        if ($consulta->execute()) {
            echo json_encode(["mensaje" => "Carta creada correctamente"]);
        } else {
            echo json_encode(["error" => $consulta->error]);
        }
        $consulta->close();
    } else {
        echo json_encode(["error" => "Error al subir la imagen"]);
    }
} elseif ($_SERVER['REQUEST_METHOD'] == 'GET') {
    if (isset($_GET['id'])) {
        $id = intval($_GET['id']);
        $consulta = $conexion->prepare("SELECT * FROM Cartas WHERE id = ?");
        $consulta->bind_param("i", $id);
        $consulta->execute();
        $resultado = $consulta->get_result();
        $carta = $resultado->fetch_assoc();
        echo json_encode($carta);
        $consulta->close();
    } else {
        $sql = "SELECT * FROM Cartas";
        $resultado = $conexion->query($sql);
        $cartas = [];
        while ($fila = $resultado->fetch_assoc()) {
            $cartas[] = $fila;
        }
        echo json_encode($cartas);
    }
} elseif ($_SERVER['REQUEST_METHOD'] == 'POST' && isset($_POST['_method']) && $_POST['_method'] == 'PUT') {
    $id = intval($_POST['id']);
    $nombre = $_POST['nombre'];
    $tipo = $_POST['tipo'];
    $rareza = $_POST['rareza'];
    $costeElixir = intval($_POST['coste_elixir']);
    $vida = intval($_POST['vida']);
    $dano = intval($_POST['dano']);
    $alcanze = intval($_POST['alcanze']);

    if (!empty($_FILES['imagen']['name'])) {
        $imagen = subirImagen($_FILES['imagen']);
    } else {
        $consulta = $conexion->prepare("SELECT imagen FROM Cartas WHERE id = ?");
        $consulta->bind_param("i", $id);
        $consulta->execute();
        $consulta->bind_result($imagen);
        $consulta->fetch();
        $consulta->close();
    }

    $consulta = $conexion->prepare("UPDATE Cartas SET nombre=?, tipo=?, rareza=?, coste_elixir=?, vida=?, dano=?, alcanze=?, imagen=? WHERE id=?");
    $consulta->bind_param("sssiiiisi", $nombre, $tipo, $rareza, $costeElixir, $vida, $dano, $alcanze, $imagen, $id);

    if ($consulta->execute()) {
        echo json_encode(["mensaje" => "Carta actualizada correctamente"]);
    } else {
        echo json_encode(["error" => $consulta->error]);
    }
    $consulta->close();
} elseif ($_SERVER['REQUEST_METHOD'] == 'DELETE') {
    if (isset($_GET['id'])) {
        $id = intval($_GET['id']);
        $consulta = $conexion->prepare("DELETE FROM Cartas WHERE id=?");
        $consulta->bind_param("i", $id);

        if ($consulta->execute()) {
            echo json_encode(["mensaje" => "Carta eliminada correctamente"]);
        } else {
            echo json_encode(["error" => $consulta->error]);
        }
        $consulta->close();
    } else {
        echo json_encode(["error" => "ID no proporcionado"]);
    }
}

$conexion->close();
?>
<?php
$host = "db";
$dbname = 'biblioteca_db';
$user = 'biblioteca_user';
$password ='user_pass';
try {
// Conexión a la base de datos
$pdo = new PDO("pgsql:host=$host;dbname=$dbname", $user, $password);
echo "Conexión exitosa con la biblioteca.<br><br>";
$query = "SELECT student_id, name, major FROM student";
$stmt = $pdo->query($query);
if ($stmt) {
echo "<table border='1'>";
echo "<tr><th>ID</th><th>Título</th><th>Autor</th></tr>";
while ($row = $stmt->fetch(PDO::FETCH_ASSOC)) {
echo "<tr>";
echo "<td>" . htmlspecialchars($row['student_id']) . "</td>";
echo "<td>" . htmlspecialchars($row['name']) . "</td>";
echo "<td>" . htmlspecialchars($row['major']) . "</td>";
echo "</tr>";
}
echo "</table>";
} else {
echo "Error al obtener los libros.";
}
} catch (PDOException $e) {
echo "Error al conectar a la base de datos: " . $e->getMessage();
}
?>
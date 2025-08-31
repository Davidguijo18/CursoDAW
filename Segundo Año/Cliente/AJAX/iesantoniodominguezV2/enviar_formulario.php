
<?php
use PHPMailer\PHPMailer\PHPMailer;
use PHPMailer\PHPMailer\Exception;

require 'phpmailer/src/Exception.php';
require 'phpmailer/src/PHPMailer.php';
require 'phpmailer/src/SMTP.php';

if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $nombre = htmlspecialchars($_POST['nombre']);
    $email = filter_var($_POST['email'], FILTER_SANITIZE_EMAIL);
    $asunto = htmlspecialchars($_POST['asunto']);
    $mensaje = htmlspecialchars($_POST['mensaje']);

    $mail = new PHPMailer(true);
    try {
        $mail->isSMTP();
        $mail->Host       = 'smtp.gmail.com';
        $mail->SMTPAuth   = true;
        $mail->Username   = 'editorjoseluisruizaweb03@gmail.com';
        $mail->Password   = 'ojqeaoaxxfeiiwin';
        $mail->SMTPSecure = PHPMailer::ENCRYPTION_SMTPS;
        $mail->Port       = 465;

        $mail->setFrom($mail->Username, 'Formulario Web');
        $mail->addAddress($mail->Username);
        $mail->addReplyTo($email, $nombre);

        $mail->isHTML(true);
        $mail->Subject = $asunto;
        $mail->Body    = '<strong>Nombre:</strong> ' . $nombre . '<br>' .
                         '<strong>Email:</strong> ' . $email . '<br>' .
                         '<strong>Mensaje:</strong><br>' . nl2br($mensaje);

        $mail->send();
        echo "<script>alert('Mensaje enviado correctamente'); window.location.href='contacto.html';</script>";
    } catch (Exception $e) {
        echo "<script>alert('Error al enviar el mensaje: {$mail->ErrorInfo}'); window.history.back();</script>";
    }
} else {
    echo "<script>window.location.href='contacto.html';</script>";
}
?>

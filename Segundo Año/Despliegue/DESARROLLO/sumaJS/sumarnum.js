function sumarNumeros(){
    var num1 = parseFloat(document.getElementById("numero1").value);
    var num2 = parseFloat(document.getElementById("numero2").value);

    var resultado = num1 + num2;

    var documento = document.getElementById("resultado");
    documento.innerHTML = "El resultado de sumar " +num1+ " y " +num2 + " es: " + resultado;
}
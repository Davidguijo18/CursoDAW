function validarCarta(carta) {
    const errores = [];

    if(carta.vida < 0) errores.push("La vida no puede ser negativa");
    if(carta.coste_elixir < 0 || carta.coste_elixir > 10) errores.push("El elixir debe estar entre 0 y 10");
    if(carta.alcanze < 0) errores.push("El alcance no puede ser negativo");
    if(carta.dano < 0)errores.push("El daño no puede ser negativo") 
    
    return errores.length > 0 ? errores : true;//Esto es simplemente para hacer las validaciones del formulari, no el jest
}

if (typeof module !== 'undefined' && module.exports) {
    module.exports = { validarCarta };
}

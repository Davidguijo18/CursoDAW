const { validarCarta } = require('./validaciones');

test('Carta valdida', () => {
    const carta = { vida: 100, coste_elixir: 5, alcanze: 3, dano: 50 };
    expect(validarCarta(carta)).toBe(true);
});

test('El elixir es mayor de 10', () => {
    const carta = { vida: 300, coste_elixir: 13, alcanze: 3, dano: 50 };
    expect(validarCarta(carta)).toContain("El elixir debe estar entre 0 y 10");
});

test('El elixir es menor de 0', () => {
    const carta = { vida: 300, coste_elixir: -5, alcanze: 3, dano: 50 };
    expect(validarCarta(carta)).toContain("El elixir debe estar entre 0 y 10");
});

test('La vida es negativa', () => {
    const carta = { vida: -10, coste_elixir: 5, alcanze: 3, dano: 50 };
    expect(validarCarta(carta)).toContain("La vida no puede ser negativa");
});

test('El alcance es negativo', () => {
    const carta = { vida: 200, coste_elixir: 5, alcanze: -2, dano: 50 };
    expect(validarCarta(carta)).toContain("El alcance no puede ser negativo");
});

test('El daño es negativo', () => {
    const carta = { vida: 870, coste_elixir: 5, alcanze: 8, dano: -20};
    expect(validarCarta(carta)).toContain("El daño no puede ser negativo");
});

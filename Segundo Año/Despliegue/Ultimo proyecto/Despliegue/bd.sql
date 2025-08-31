USE ClashRoyaleDB;

CREATE TABLE Cartas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    tipo VARCHAR(50) NOT NULL,
    rareza VARCHAR(50) NOT NULL,
    coste_elixir INT NOT NULL,
    vida INT NOT NULL,
    dano INT NOT NULL,
    alcanze INT NOT NULL,
    imagen VARCHAR(255) NOT NULL
);

INSERT INTO Cartas (nombre, tipo, rareza, coste_elixir, vida, dano, alcanze,imagen) VALUES 
('Caballero', 'Tierra', 'Común', 3, 1500, 250, 3,'Caballero.png'),
('Mago', 'Volador', 'Rara', 5, 1200, 400, 6,'Mago.png'),
('Dragón Infernal', 'Volador', 'Épica', 5, 1000, 700, 4,'dragon-infernal.png'),
('Gigante', 'Tierra', 'Común', 5, 3500, 500, 3,'gigante.png'),
('P.E.K.K.A', 'Tierra', 'Legendaria', 7, 4500, 800, 2,'pekka.png');

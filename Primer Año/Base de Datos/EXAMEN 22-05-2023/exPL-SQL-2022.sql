
-- Nombre: <Pon aquí tu nombre>

--------------------------------------------------------------------------------------
-- INSTRUCCIONES
--------------------------------------------------------------------------------------

-Salva este fichero con las iniciales de tu nombre y apellidos:
	Ejemplo:	José María Rivera Calvete
			JMRC.sql

-Pon tu nombre al ejercicio arriba y lee atentamente todas las preguntas.

-Carga el script para el examen desde el fichero "Datos-Mundial.sql".

-RECUERDA: guardar, cada cierto tiempo, el contenido de este fichero. Es lo que voy a evaluar, si lo pierdes, lo siento, en junio tendrás otra oportunidad.

--------------------------------------------------------------------------------------
-- PUNTUACIÓN
--------------------------------------------------------------------------------------

- Pregunta PROCEDURE/FUNCTION: 	2 puntos cada una

--------------------------------------------------------------------------------------
-- CRITERIOS
--------------------------------------------------------------------------------------

- Se considerará para la evaluación:
	- Que funcione.
	- Estilo de programación.
	- Legibilidad del código.
	- Tratamiento de excepciones en cada ejercicio.
	- Código reutilizable y paramétrico.
	- Cursores adecuados.

--------------------------------------------------------------------------------------
-- TABLAS	
--------------------------------------------------------------------------------------

CREATE TABLE SELECCIONES (
  COD_SE		NUMBER(2)	PRIMARY KEY,
  NOMBRE_SE		VARCHAR2(15),
  GRUPO_SE		CHAR(1),
  PUNTOS_SE		NUMBER(2) DEFAULT 0,
  GOLESFAVOR_SE	NUMBER(2) DEFAULT 0,
  GOLESCONTR_SE	NUMBER(2) DEFAULT 0
);

CREATE TABLE ESTADIOS (
  COD_ES			NUMBER(2)	PRIMARY KEY,
  NOMBRE_ES			VARCHAR2(25),
  CIUDAD_ES			VARCHAR2(15),
  ESPECTADORES_ES 	NUMBER(5)
);

CREATE TABLE PARTIDOS (
  LOCAL_PA		NUMBER(2),
  VISITANTE_PA	NUMBER(2),
  GOLESLOC_PA	NUMBER(2)	DEFAULT 0,
  GOLESVIS_PA	NUMBER(2)	DEFAULT 0,
  ESTADIO_PA	NUMBER(2),
  FECHA_PA		DATE,
  FASE_PA		VARCHAR2(10) DEFAULT 'GRUPOS',
  ESTADO_PA		VARCHAR2(15) DEFAULT 'SIN COMENZAR',
  CONSTRAINT PK_PARTIDOS PRIMARY KEY (LOCAL_PA, VISITANTE_PA, FASE_PA),
  CONSTRAINT FK1_PARTIDOS FOREIGN KEY (LOCAL_PA) REFERENCES SELECCIONES,
  CONSTRAINT FK2_PARTIDOS FOREIGN KEY (VISITANTE_PA) REFERENCES SELECCIONES,
  CONSTRAINT FK3_PARTIDOS FOREIGN KEY (ESTADIO_PA) REFERENCES ESTADIOS,
  CONSTRAINT CH_ESTADO_PA CHECK (ESTADO_PA IN ('EN JUEGO','TERMINADO','SIN COMENZAR')),
  CONSTRAINT CH_FASE_PA CHECK (FASE_PA IN ('GRUPOS','OCTAVOS','CUARTOS','SEMIFINAL','FINAL'))
);

CREATE TABLE CRUCES (
  GRUPO_1			CHAR(1),
  GRUPO_2			CHAR(1),
  CONSTRAINT PK_CRUCES PRIMARY KEY (GRUPO_1, GRUPO_2)
);
--------------------------------------------------------------------------------------
-- Pregunta 1
--------------------------------------------------------------------------------------
1.- Diseña un procedimiento llamado 'CalcularPuntosGrupo', que reciba como parámetro la letra de un grupo y basándose en los datos de ese grupo en la tabla PARTIDOS, modifique adecuadamente los siguientes campos de la tabla SELECCIONES: PUNTOS_SE, GOLESCONTR_SE, GOLESFAVOR_SE. Para el cálculo de los puntos se considerará para cada equipo: victoria, 3 puntos; empate, 1 punto; y derrota, 0 puntos.

Código:

--------------------------------------------------------------------------------------
-- Pregunta 2
--------------------------------------------------------------------------------------
2.- Diseña un procedimiento llamado 'ClasificacionGrupo', que reciba como parámetro la letra de un grupo, y muestre un listado con la clasificación del grupo ordenados por puntos, en caso de empate a puntos, el que tenga una diferencia de goles mayor, y si hubiera aún empate, el que más goles a favor tenga.

Ejemplo:

Clasificación GRUPO: A
. Equipo        PU  GF  GC  DIF
- ------------- --  --  --  ---
1 RUSIA          6   8   3   +5
2 EGIPTO         4   4   3   +1
3 ARABIA SAUDI   4   4   6   -2
4 URUGUAY        3   4   8   -4

Código:

--------------------------------------------------------------------------------------
-- Pregunta 3
--------------------------------------------------------------------------------------
3.- Crear el procedimiento sin parámetros 'FaseGrupos', que muestre un listado con la clasificación de todos los grupos.

Código:

--------------------------------------------------------------------------------------
-- Pregunta 4
--------------------------------------------------------------------------------------
4.- Diseña un procedimiento llamado 'CruceOctavos', que reciba como parámetro las letras de dos grupos, creando el partido correspondiente entre el primero del grupo del primer parámetro contra el segundo del grupo del segundo parámetro. Para ello insertará un registro en la tabla PARTIDOS con los siguientes datos:
	- LOCAL_PA: el equipo primero del grupo del primer parámetro.
    - VISITANTE_PA: el equipo segundo del grupo del segundo parámetro.
	- GOLESLOC_PA: 0
	- GOLESVIS_PA: 0
	- ESTADIO_PA: donde jugó el primer partido el equipo LOCAL_PA
	- FECHA_PA: la de mañana.
	- FASE_PA: 'OCTAVOS'
	- ESTADO_PA: 'SIN COMENZAR'

Código:

--------------------------------------------------------------------------------------
-- Pregunta 5
--------------------------------------------------------------------------------------
5.- Diseña el procedimiento sin parámetros 'GeneraOctavos' que cree los partidos de octavos a partir de los cruces indicados en la tabla 'CRUCES'.

Código:
	
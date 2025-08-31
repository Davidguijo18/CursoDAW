
-- Nombre: <Pon aqu� tu nombre>

--------------------------------------------------------------------------------------
-- INSTRUCCIONES
--------------------------------------------------------------------------------------

-Salva este fichero con las iniciales de tu nombre y apellidos:
	Ejemplo:	Jos� Mar�a Rivera Calvete
			JMRC.sql

-Pon tu nombre al ejercicio arriba y lee atentamente todas las preguntas.

-Carga el script para el examen desde el fichero "Datos-Mundial.sql".

-RECUERDA: guardar, cada cierto tiempo, el contenido de este fichero. Es lo que voy a evaluar, si lo pierdes, lo siento, en junio tendr�s otra oportunidad.

--------------------------------------------------------------------------------------
-- PUNTUACI�N
--------------------------------------------------------------------------------------

- Pregunta PROCEDURE/FUNCTION: 	2 puntos cada una

--------------------------------------------------------------------------------------
-- CRITERIOS
--------------------------------------------------------------------------------------

- Se considerar� para la evaluaci�n:
	- Que funcione.
	- Estilo de programaci�n.
	- Legibilidad del c�digo.
	- Tratamiento de excepciones en cada ejercicio.
	- C�digo reutilizable y param�trico.
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
1.- Dise�a un procedimiento llamado 'CalcularPuntosGrupo', que reciba como par�metro la letra de un grupo y bas�ndose en los datos de ese grupo en la tabla PARTIDOS, modifique adecuadamente los siguientes campos de la tabla SELECCIONES: PUNTOS_SE, GOLESCONTR_SE, GOLESFAVOR_SE. Para el c�lculo de los puntos se considerar� para cada equipo: victoria, 3 puntos; empate, 1 punto; y derrota, 0 puntos.

C�digo:

--------------------------------------------------------------------------------------
-- Pregunta 2
--------------------------------------------------------------------------------------
2.- Dise�a un procedimiento llamado 'ClasificacionGrupo', que reciba como par�metro la letra de un grupo, y muestre un listado con la clasificaci�n del grupo ordenados por puntos, en caso de empate a puntos, el que tenga una diferencia de goles mayor, y si hubiera a�n empate, el que m�s goles a favor tenga.

Ejemplo:

Clasificaci�n GRUPO: A
. Equipo        PU  GF  GC  DIF
- ------------- --  --  --  ---
1 RUSIA          6   8   3   +5
2 EGIPTO         4   4   3   +1
3 ARABIA SAUDI   4   4   6   -2
4 URUGUAY        3   4   8   -4

C�digo:

--------------------------------------------------------------------------------------
-- Pregunta 3
--------------------------------------------------------------------------------------
3.- Crear el procedimiento sin par�metros 'FaseGrupos', que muestre un listado con la clasificaci�n de todos los grupos.

C�digo:

--------------------------------------------------------------------------------------
-- Pregunta 4
--------------------------------------------------------------------------------------
4.- Dise�a un procedimiento llamado 'CruceOctavos', que reciba como par�metro las letras de dos grupos, creando el partido correspondiente entre el primero del grupo del primer par�metro contra el segundo del grupo del segundo par�metro. Para ello insertar� un registro en la tabla PARTIDOS con los siguientes datos:
	- LOCAL_PA: el equipo primero del grupo del primer par�metro.
    - VISITANTE_PA: el equipo segundo del grupo del segundo par�metro.
	- GOLESLOC_PA: 0
	- GOLESVIS_PA: 0
	- ESTADIO_PA: donde jug� el primer partido el equipo LOCAL_PA
	- FECHA_PA: la de ma�ana.
	- FASE_PA: 'OCTAVOS'
	- ESTADO_PA: 'SIN COMENZAR'

C�digo:

--------------------------------------------------------------------------------------
-- Pregunta 5
--------------------------------------------------------------------------------------
5.- Dise�a el procedimiento sin par�metros 'GeneraOctavos' que cree los partidos de octavos a partir de los cruces indicados en la tabla 'CRUCES'.

C�digo:
	
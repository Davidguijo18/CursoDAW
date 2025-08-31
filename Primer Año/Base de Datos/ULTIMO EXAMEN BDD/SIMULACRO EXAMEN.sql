SET SERVEROUTPUT ON

-- 1.- Diseña un procedimiento llamado 'CalcularPuntosGrupo', que reciba como parámetro la letra de un grupo y basándose en los datos de ese grupo en la tabla PARTIDOS,
-- modifique adecuadamente los siguientes campos de la tabla SELECCIONES: PUNTOS_SE, GOLESCONTR_SE, GOLESFAVOR_SE. 
-- Para el cálculo de los puntos se considerará para cada equipo: victoria, 3 puntos; empate, 1 punto; y derrota, 0 puntos.

-- Código:
CREATE OR REPLACE PROCEDURE  CalcularPuntosGrupo (LetraGrupo SELECCIONES.GRUPO_SE%TYPE) as
    CURSOR C1 is
    SELECT *
    FROM PARTIDOS WHERE LOCAL_PA IN(SELECT COD_SE FROM SELECCIONES WHERE GRUPO_SE = LetraGrupo);
   
    var_golesloc PARTIDOS.GOLESLOC_PA%type;
    var_golesvis PARTIDOS.GOLESVIS_PA%type;
    var_puntosl NUMBER(2);
    var_puntosv NUMBER(2);
    
    NO_EXISTE_EL_GRUPO EXCEPTION;
    GRUPO_PUNTUADO EXCEPTION;

BEGIN
-- SE COMPRUEBA QUE NO SE HAYAN INTRODUCIDO YA LOS PUNTOS
    SELECT SUM(PUNTOS_SE) INTO var_puntosl FROM SELECCIONES WHERE GRUPO_SE = LetraGrupo;
    
    IF var_puntosl <> 0 THEN 
    RAISE GRUPO_PUNTUADO;
    ELSIF var_puntosl IS NULL THEN 
    RAISE NO_EXISTE_EL_GRUPO;
    END IF;

--SE CALCULAN LOS PUNTOS QUE DEBE TENER CADA UNO EN FUNCION DE LA DIFERENCIA DE GOLES
    FOR X IN C1 LOOP
        var_golesloc := X.GOLESLOC_PA;
        var_golesvis := X.GOLESVIS_PA;

        IF X.GOLESLOC_PA = X.GOLESVIS_PA THEN
            var_puntosl := 1;
            var_puntosv := 1;
        ELSIF X.GOLESLOC_PA > X.GOLESVIS_PA THEN
            var_puntosl := 3;
            var_puntosv := 0;
        ELSIF X.GOLESLOC_PA < X.GOLESVIS_PA THEN
            var_puntosl := 0;
            var_puntosv := 3;
        END IF;
        
-- SE ACTUALIZA EL EQUIPO LOCAL 
        UPDATE SELECCIONES 
        SET PUNTOS_SE = PUNTOS_SE+var_puntosl,
        GOLESFAVOR_SE = GOLESFAVOR_SE + var_golesloc,
        GOLESCONTR_SE = GOLESCONTR_SE + var_golesvis
        WHERE COD_SE = X.LOCAL_PA;

-- SE ACTUALIZA EL EQUIPO VISITANTE 
        UPDATE SELECCIONES 
        SET PUNTOS_SE = PUNTOS_SE+var_puntosv,
        GOLESFAVOR_SE = GOLESFAVOR_SE + var_golesvis,
        GOLESCONTR_SE = GOLESCONTR_SE + var_golesloc
        WHERE COD_SE = X.VISITANTE_PA;
        
    END LOOP;
    
    EXCEPTION
    WHEN GRUPO_PUNTUADO THEN
        DBMS_OUTPUT.PUT_LINE('EL GRUPO YA HA PUNTUADO');
    WHEN NO_EXISTE_EL_GRUPO THEN
        DBMS_OUTPUT.PUT_LINE('EL GRUPO NO EXISTE');
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE(SQLERRM);
END;
/
EXEC CalcularPuntosGrupo('A');
EXEC CalcularPuntosGrupo('B');
EXEC CalcularPuntosGrupo('C');
EXEC CalcularPuntosGrupo('D');
EXEC CalcularPuntosGrupo('E');
EXEC CalcularPuntosGrupo('F');
EXEC CalcularPuntosGrupo('G');
EXEC CalcularPuntosGrupo('H');
--------------------------------------------------------------------------------------
-- Pregunta 2
--------------------------------------------------------------------------------------
-- 2.- Diseña un procedimiento llamado 'ClasificacionGrupo', que reciba como parámetro la letra de un grupo, y muestre un listado con la clasificación del grupo ordenados por puntos, 
-- en caso de empate a puntos, el que tenga una diferencia de goles mayor, y si hubiera aún empate, el que más goles a favor tenga.

-- Ejemplo:

-- Clasificación GRUPO: A
-- . Equipo        PU  GF  GC  DIF
-- ------------- --  --  --  ---
-- 1 RUSIA          6   8   3   +5
-- 2 EGIPTO         4   4   3   +1
-- 3 ARABIA SAUDI   4   4   6   -2
-- 4 URUGUAY        3   4   8   -4

-- Código:

CREATE OR REPLACE PROCEDURE  ClasificacionGrupo (LetraGrupo SELECCIONES.GRUPO_SE%TYPE) as
    CURSOR C1 is
    SELECT NOMBRE_SE "NOMBRE", PUNTOS_SE "PUNTOS", GOLESFAVOR_SE "GOLESFAVOR", GOLESCONTR_SE "GOLESCONTRA", GOLESFAVOR_SE-GOLESCONTR_SE "DIFERENCIAGOLES"
    FROM SELECCIONES WHERE GRUPO_SE = LetraGrupo ORDER BY 2 DESC, 3 DESC, 5 DESC;
    
    var_puntos SELECCIONES.PUNTOS_SE%TYPE;
    
    NO_EXISTE_EL_GRUPO EXCEPTION;

BEGIN

    SELECT SUM(PUNTOS_SE) INTO var_puntos FROM SELECCIONES WHERE GRUPO_SE = LetraGrupo;
    
    IF var_puntos IS NULL THEN 
    RAISE NO_EXISTE_EL_GRUPO;
    END IF;

    DBMS_OUTPUT.PUT_LINE('EQUIPO           PU  GF  GC  DIF');
    DBMS_OUTPUT.PUT_LINE('------           --  --  --  ---');

    FOR X IN C1 LOOP
        DBMS_OUTPUT.PUT_LINE(RPAD(X.NOMBRE, 15) || ' '
        || TO_CHAR(X.PUNTOS, '99') || ' '
        || TO_CHAR(X.GOLESFAVOR, '99') || ' '
        || TO_CHAR(X.GOLESCONTRA, '99') || ' '
        || TO_CHAR(X.DIFERENCIAGOLES, '99') || ' ');

    END LOOP;
    
    EXCEPTION
    WHEN NO_EXISTE_EL_GRUPO THEN
        DBMS_OUTPUT.PUT_LINE('EL GRUPO NO EXISTE');
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE(SQLERRM);
END;
/

EXEC ClasificacionGrupo('A');

--------------------------------------------------------------------------------------
-- Pregunta 3
--------------------------------------------------------------------------------------
-- 3.- Crear el procedimiento sin parámetros 'FaseGrupos', que muestre un listado con la clasificación de todos los grupos.

-- Código:

CREATE OR REPLACE PROCEDURE  FaseGrupos as
    CURSOR C1 is
    SELECT DISTINCT GRUPO_SE
    FROM SELECCIONES ORDER BY 1;
    
BEGIN
    FOR X IN C1 LOOP
        DBMS_OUTPUT.PUT_LINE('GRUPO: ' ||X.GRUPO_SE);
        ClasificacionGrupo(X.GRUPO_SE);
        DBMS_OUTPUT.PUT_LINE(' ');
    END LOOP;

    EXCEPTION
        WHEN OTHERS THEN
            DBMS_OUTPUT.PUT_LINE(SQLERRM);
END;
/

EXEC FaseGrupos;

--------------------------------------------------------------------------------------
-- Pregunta 4
--------------------------------------------------------------------------------------
-- 4.- Diseña un procedimiento llamado 'CruceOctavos', que reciba como parámetro las letras de dos grupos, 
-- creando el partido correspondiente entre el primero del grupo del primer parámetro contra el segundo del grupo del segundo parámetro. 
-- Para ello insertará un registro en la tabla PARTIDOS con los siguientes datos:
--	- LOCAL_PA: el equipo primero del grupo del primer parámetro.
--  - VISITANTE_PA: el equipo segundo del grupo del segundo parámetro.
--	- GOLESLOC_PA: 0
--	- GOLESVIS_PA: 0
--	- ESTADIO_PA: donde jugó el primer partido el equipo LOCAL_PA
--	- FECHA_PA: la de mañana.
--	- FASE_PA: 'OCTAVOS'
--	- ESTADO_PA: 'SIN COMENZAR'

-- Código:

CREATE OR REPLACE PROCEDURE  CruceOctavos (pGrupo1 CHAR, pGrupo2 CHAR) as
-- PARA EL EQUIPO 1	
    CURSOR C1 IS
		SELECT COD_SE
			FROM SELECCIONES
			WHERE GRUPO_SE = pGrupo1
			ORDER BY PUNTOS_SE DESC, GOLESFAVOR_SE-GOLESCONTR_SE DESC, GOLESFAVOR_SE DESC;
-- PARA EL EQUIPO 2        
	CURSOR C2 IS
		SELECT COD_SE
			FROM SELECCIONES
			WHERE GRUPO_SE = pGrupo2
			ORDER BY PUNTOS_SE DESC, GOLESFAVOR_SE-GOLESCONTR_SE DESC, GOLESFAVOR_SE DESC;
-- PARA EL ESTADIO
	CURSOR C3(pEquipo NUMBER) IS
		SELECT ESTADIO_PA
			FROM PARTIDOS
			WHERE LOCAL_PA = pEquipo
				OR VISITANTE_PA = pEquipo
			ORDER BY FECHA_PA;
            
	NO_EXISTE_EL_GRUPO1 EXCEPTION;
	NO_EXISTE_EL_GRUPO2 EXCEPTION;
        
	vLocal 		SELECCIONES.COD_SE%TYPE;
	vVisitante 	SELECCIONES.COD_SE%TYPE;
	vEstadio 	ESTADIOS.COD_ES%TYPE;
    
BEGIN
    -- Buscando equipo local
	OPEN C1;
    -- Cogemos el PRIMERO del grupo
    FETCH C1 INTO vLocal;
    IF C1%NOTFOUND THEN
        RAISE  NO_EXISTE_EL_GRUPO1;
    END IF;
	CLOSE C1;
    
    -- Buscando equipo visitante
	OPEN C2;
    FETCH C2 INTO vVisitante;
    IF C2%NOTFOUND THEN
        RAISE  NO_EXISTE_EL_GRUPO2;
    END IF;
    -- Cogemos el SEGUNDO del grupo
    FETCH C2 INTO vVisitante;
	CLOSE C2;
    
    -- Buscando estadio
	OPEN C3(vLocal);
    -- Cogemos el PRIMER estadio
    FETCH C3 INTO vEstadio;
	CLOSE C3;
    
	INSERT INTO PARTIDOS VALUES (vLocal, vVisitante, 0, 0, vEstadio, SYSDATE + 1, 'OCTAVOS', 'SIN COMENZAR');
    
EXCEPTION
	WHEN NO_EXISTE_EL_GRUPO1 THEN
		DBMS_OUTPUT.PUT_LINE('El grupo '||pGrupo1||' no existe.');
	WHEN NO_EXISTE_EL_GRUPO2 THEN
		DBMS_OUTPUT.PUT_LINE('El grupo '||pGrupo2||' no existe.');
	WHEN OTHERS THEN
		ROLLBACK;
		DBMS_OUTPUT.PUT_LINE(SQLERRM);
END;
/

-- EXEC CruceOctavos('A','B'); -- NO LO EJECUTO PORQUE EL EMPAREJAMIENTO SE HACE EN EL EJERCICIO 5

--------------------------------------------------------------------------------------
-- Pregunta 5
--------------------------------------------------------------------------------------
-- 5.- Diseña el procedimiento sin parámetros 'GeneraOctavos' que cree los partidos de octavos a partir de los cruces indicados en la tabla 'CRUCES'.

-- Código:

CREATE OR REPLACE PROCEDURE GeneraOctavos as
CURSOR C1 IS
		SELECT *
			FROM CRUCES;
BEGIN
    FOR X IN C1 LOOP
        CruceOctavos(X.GRUPO_1, X.GRUPO_2);
    END LOOP;
    EXCEPTION
WHEN OTHERS THEN
    ROLLBACK;
    DBMS_OUTPUT.PUT_LINE(SQLERRM);
END;
/

EXEC GeneraOctavos;
	

-- UPDATE CASCADE
-- cuando se actualiza el NUMDE en departamentos se tiene que actualizar tambi?n el NUMDE en empleados
CREATE OR REPLACE TRIGGER UPDATE_CASCADE_DEPARTAMENTOS_EMPLEADOS
AFTER UPDATE OF NUMDE ON DEPARTAMENTOS 
FOR EACH ROW 
BEGIN
UPDATE EMPLEADOS
SET EMPLEADOS.NUMDE= :NEW.NUMDE
WHERE EMPLEADOS.NUMDE= :OLD.NUMDE;
END;
/

ALTER TRIGGER UPDATE_CASCADE_DEPARTAMENTOS_EMPLEADOS DISABLE;
ALTER TRIGGER UPDATE_CASCADE_DEPARTAMENTOS_EMPLEADOS ENABLE;

-- cuando se actualiza el NUMCE en centros se tiene que actualizar tambi?n el NUMCE en departamentos
CREATE OR REPLACE TRIGGER UPDATE_CASCADE_CENTROS_DEPARTAMENTOS
AFTER UPDATE OF NUMCE ON CENTROS 
FOR EACH ROW 
BEGIN
UPDATE DEPARTAMENTOS
SET DEPARTAMENTOS.NUMCE= :NEW.NUMCE
WHERE DEPARTAMENTOS.NUMCE= :OLD.NUMCE;
END;
/

ALTER TRIGGER UPDATE_CASCADE_CENTROS_DEPARTAMENTOS DISABLE;
ALTER TRIGGER UPDATE_CASCADE_CENTROS_DEPARTAMENTOS ENABLE;

-- OTROS DISPARADORES 
-- Controlar de forma autom?tica que los trabajadores que se den de alta tengan una edad superior a 16 a?os
CREATE OR REPLACE TRIGGER DAR_DE_ALTA_MAYOR_DE_16_A?OS
BEFORE INSERT OR UPDATE ON EMPLEADOS 
FOR EACH ROW
BEGIN
IF (MONTHS_BETWEEN(SYSDATE, :NEW.FECNA)/12)<16 THEN
RAISE_APPLICATION_ERROR(-20001, 'No se puede dar de alta a un empleado con menos de 16 a?os. ');
END IF;
END;
/

ALTER TRIGGER DAR_DE_ALTA_MAYOR_DE_16_A?OS DISABLE;
ALTER TRIGGER DAR_DE_ALTA_MAYOR_DE_16_A?OS ENABLE;

-- ACTIVIDAD 6
CREATE TABLE AUDITORIA_EMPLEADOS (descripcion VARCHAR2(200));

CREATE VIEW SEDE_DEPARTAMENTOS AS
SELECT C.NUMCE, C.NOMCE, C.DIRCE,
D.NUMDE, D.NOMDE, D.PRESU, D.DIREC, D.TIDIR, D.DEPDE
FROM CENTROS C JOIN DEPARTAMENTOS D ON C.NUMCE=D.NUMCE;

INSERT INTO DEPARTAMENTOS VALUES (0, 10, 260, 'F', 10, 100, 'TEMP');

-- 6.1
-- Crea un trigger que, cada vez que se inserte o elimine un empleado, registre una entrada en
-- la tabla AUDITORIA_EMPLEADOS con la fecha del suceso, n?mero y nombre de
-- empleado, as? como el tipo de operaci?n realizada (INSERCI?N o ELIMINACI?N).
CREATE OR REPLACE TRIGGER ACT1
AFTER INSERT OR DELETE ON EMPLEADOS 
FOR EACH ROW
BEGIN
IF INSERTING THEN
INSERT INTO AUDITORIA_EMPLEADOS VALUES ('INSERCI?N del empleado N?' || :NEW.NUMEM || ' ' || :NEW.NOMEM || ' en fecha ' || TO_CHAR(SYSDATE, 'DD/MM/YYY HH:MI:SS'));
END IF;
IF DELETING THEN
INSERT INTO AUDITORIA_EMPLEADOS VALUES ('ELIMINACI?N del empleado N?' || :OLD.NUMEM || ' ' || :OLD.NOMEM || ' en fecha ' || TO_CHAR(SYSDATE, 'DD/MM/YYY HH:MI:SS'));
END IF;
END;
/

-- 6.2
-- Crea un trigger que, cada vez que se modifiquen datos de un empleado, registre una
-- entrada en la tabla AUDITORIA_EMPLEADOS con la fecha del suceso, valor antiguo y valor
-- nuevo de cada campo, as? como el tipo de operaci?n realizada (en este caso
-- MODIFICACI?N).
CREATE OR REPLACE TRIGGER ACT2
AFTER UPDATE ON EMPLEADOS 
FOR EACH ROW
BEGIN
IF UPDATING THEN
INSERT INTO AUDITORIA_EMPLEADOS VALUES ('MODIFICACI?N del empleado: ' || 
:OLD.NUMEM ||'->'|| :NEW.NUMEM ||', '|| :OLD.EXTEL ||'->'|| :NEW.EXTEL ||', '|| 
:OLD.FECNA ||'->'|| :NEW.FECNA ||', '|| :OLD.FECIN ||'->'|| :NEW.FECIN ||', '|| 
:OLD.SALAR ||'->'|| :NEW.SALAR ||', '|| :OLD.COMIS ||'->'|| :NEW.COMIS ||', '|| 
:OLD.NUMHI ||'->'|| :NEW.NUMHI ||', '|| :OLD.NOMEM ||'->'|| :NEW.NOMEM ||', '|| 
:OLD.NUMDE ||'->'|| :NEW.NUMDE || ' en fecha ' || TO_CHAR(SYSDATE, 'DD/MM/YYY HH:MI:SS'));
END IF;
END;
/


-- 6.3
-- Crea un trigger para que registre en la tabla AUDITORIA_EMPLEADOS las subidas de
-- salarios superiores al 5%.
CREATE OR REPLACE TRIGGER ACT3
AFTER UPDATE ON EMPLEADOS 
FOR EACH ROW
BEGIN
IF :NEW.SALAR>:OLD.SALAR*1.05 THEN
INSERT INTO AUDITORIA_EMPLEADOS VALUES ('SUBIDA DE SALARIO DE M?S DEL 5% del empleado N?' || :NEW.NUMEM || ' ' || :NEW.NOMEM || ' en fecha ' || TO_CHAR(SYSDATE, 'DD/MM/YYY HH:MI:SS'));
END IF;
END;
/

-- 6.4
-- Deseamos operar sobre los datos de los departamentos y los centros donde se hallan. Para
-- ello haremos uso de la vista SEDE_DEPARTAMENTOS creada anteriormente.
-- Al tratarse de una vista que involucra m?s de una tabla, necesitaremos crear un trigger de
-- sustituci?n para gestionar las operaciones de actualizaci?n de la informaci?n. Crea el trigger
-- necesario para realizar inserciones, eliminaciones y modificaciones en la vista anterior.
CREATE OR REPLACE TRIGGER ACT4
-- se puede poner AFTER en vez de INDTEAD OF, pero esta �ltima es precisa para trabajar sobre vistas
INSTEAD OF INSERT OR DELETE OR UPDATE ON SEDE_DEPARTAMENTOS
FOR EACH ROW
BEGIN
    IF INSERTING THEN
        -- Inserci�n en la tabla CENTROS
        INSERT INTO CENTROS (NUMCE, NOMCE, DIRCE)
        VALUES (:NEW.NUMCE, :NEW.NOMCE, :NEW.DIRCE);

        -- Inserci�n en la tabla DEPARTAMENTOS
        INSERT INTO DEPARTAMENTOS (NUMDE, NOMDE, PRESU, DIREC, TIDIR, DEPDE)
        VALUES (:NEW.NUMDE, :NEW.NOMDE, :NEW.PRESU, :NEW.DIREC, :NEW.TIDIR, :NEW.DEPDE);
        
    ELSIF DELETING THEN
        -- Eliminaci�n en la tabla DEPARTAMENTOS
        DELETE FROM DEPARTAMENTOS
        WHERE NUMDE = :OLD.NUMDE;

        -- Eliminaci�n en la tabla CENTROS
        DELETE FROM CENTROS
        WHERE NUMCE = (SELECT NUMCE FROM SEDE_DEPARTAMENTOS WHERE NUMDE = :OLD.NUMDE);

    ELSIF UPDATING THEN
        -- Actualizaci�n en la tabla CENTROS
        UPDATE CENTROS
        SET NUMCE = :NEW.NUMCE,
            NOMCE = :NEW.NOMCE,
            DIRCE = :NEW.DIRCE
        WHERE NUMCE = (SELECT NUMCE FROM SEDE_DEPARTAMENTOS WHERE NUMDE = :NEW.NUMDE);

        -- Actualizaci�n en la tabla DEPARTAMENTOS
        UPDATE DEPARTAMENTOS
        SET NUMDE = :NEW.NUMDE,
            NOMDE = :NEW.NOMDE,
            PRESU = :NEW.PRESU,
            DIREC = :NEW.DIREC,
            TIDIR = :NEW.TIDIR,
            DEPDE = :NEW.DEPDE
        WHERE NUMDE = :OLD.NUMDE;
    END IF;
END;
/

-- 6.5
-- Realiza las operaciones para comprobar si los disparadores anteriores funcionan
-- correctamente.
INSERT INTO EMPLEADOS VALUES (600, 789, SYSDATE, SYSDATE, 3000, 100, 0, 'MARIO',110);

UPDATE EMPLEADOS 
SET SALAR=3500
WHERE NUMEM=600;

DELETE FROM EMPLEADOS WHERE NUMEM = 600;

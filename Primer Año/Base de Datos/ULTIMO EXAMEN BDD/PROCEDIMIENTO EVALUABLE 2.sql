/*1.-Escribir un disparador de base de datos( practica 1) que haga fallar cualquier operaci�n de 
modificaci�n del n�mero de un empleado y su fecha de nacimeinto, o que suponga una subida de 
sueldo superior al 10%*/
CREATE OR REPLACE TRIGGER fallo_modif 
    BEFORE UPDATE  OF numem, fecna, salar on empleados
    FOR EACH ROW 
BEGIN 
    IF UPDATING('numem') OR UPDATING('fecna') 
        OR (UPDATING ('salar') AND :new.salar>:old.salar*1.1) 
THEN 
    RAISE_APPLICATION_ERROR (-20001,'Err. Modificacion no permitida'); 
END IF; 
END;

/*Escribir un disparador de base de datos( practica 1) que haga fallar cualquier operaci�n de 
modificaci�n del n�mero de centro (numce) y su presupuesto*/
CREATE OR REPLACE TRIGGER fallo_mod_depar
    BEFORE UPDATE  OF numce, presu on departamentos
    FOR EACH ROW 
BEGIN 
    IF UPDATING('numce') OR UPDATING('presu') 
        THEN 
    RAISE_APPLICATION_ERROR (-20001,'Err. Modificacion no permitida'); 
END IF; 
END;
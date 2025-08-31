-- Sobre la base de datos Practica1(centros, departamentos, empleados)
SET SERVEROUTPUT ON

-- Ejercicio 1
-- Desarrollar una función que se llame anios_tusiniciales que devuelva el número de años
-- completos que hay entre dos fechas que se pasan como argumentos.
CREATE OR REPLACE FUNCTION anios_tusiniciales(fecha1 DATE, fecha2 DATE)
RETURN INT AS
    anios INT:=0;

BEGIN
    -- Calcula la diferencia en años entre las dos fechas
    anios := (MONTHS_BETWEEN(fecha2, fecha1) / 12);
    -- Si fecha1 es mayor que fecha2
    IF (fecha1>fecha2) THEN
        anios := (MONTHS_BETWEEN(fecha1, fecha2) / 12);

    END IF;
    RETURN (anios);
END;
/
BEGIN 
dbms_output.put_line(anios_tusiniciales(SYSDATE, SYSDATE+365));
END;

-- Ejercicio 2
-- Escribir una función llamada trienios_tusiniciales que, haciendo uso de la función anterior
-- devuelva los trienios que hay entre dos fechas. (Un trienio son tres años completos).
CREATE FUNCTION trienios_tusiniciales(fecha1 DATE, fecha2 DATE)
RETURN INT AS
    anios INT;
    trienios INT;

BEGIN
    -- Calcula el número de años completos entre las dos fechas
    anios := anios_tusiniciales(fecha1, fecha2);
    -- Calcula los trienios dividiendo los años completos entre 3
    trienios := anios / 3;
    RETURN (trienios);
END;
/
BEGIN 
dbms_output.put_line(trienios_tusiniciales(SYSDATE, SYSDATE+1095));
END;

-- Ejercicio 3
-- Implementa un procedimiento que muestre un listado de los empleados junto con
-- los trienios que tiene cada uno, haciendo uso de las funciones anteriores. Llámalo
-- Listado_trienios_tusiniciales
CREATE OR REPLACE PROCEDURE  Listado_trienios_tusiniciales as
    CURSOR C1 is
    SELECT *
    FROM EMPLEADOS;
   
BEGIN
    FOR X IN C1 LOOP
        dbms_output.put_line(X.NOMEM||' '||trienios_tusiniciales(X.FECNA, SYSDATE));
    END LOOP;
END;
/
EXEC Listado_trienios_tusiniciales;

-- Ejercicio 4
-- Escribir un procedimiento llamado sal_alto_tusiniciales que visualice el apellido y el salario
-- de los cinco empleados que tienen el salario más alto.
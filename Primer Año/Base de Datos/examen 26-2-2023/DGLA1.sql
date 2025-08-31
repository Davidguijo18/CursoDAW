/*TIPO A2

Nombre: David Guijo Lopez

------------------------------------------------------------------------
	INSTRUCCIONES:
	==============

-Salva este fichero con las iniciales de tu nombre y apellidos,

	Ejemplo:	Francisca María Checa Ligero
			FMCHLA2.sql

-Pon tu nombre al ejercicio y lee atentamente todas las preguntas.
-Se deben incluir las pruebas para comprobar su correcto funcionamiento
-Carga el script para el examen desde el fichero "Empresa.sql".
-Todos los procedimientos o funciones deben llevar delante tus iniciales
        ejemplo: ...procedure FMCHL_ModComision ...

-RECUERDA: guardar, cada cierto tiempo, el contenido de este fichero. 
Es lo que voy a evaluar, si lo pierdes, lo siento, en la recuperación
tendrás otra oportunidad.

	PUNTUACIÓN
	==========
- Cada pregunta: 	 2 puntos

- Se considerará para la evaluación:
	- Que funcione
	- Estilo de programación 
	- Tratamiento de excepciones
	- Código reutilizable y paramétrico

------------------------------------------------------------------------

	Descripción de las tablas:
	==========================

CENTROS
-------
# COD_CE		NUMBER(2)		Código del Centro
* DIRECTOR_CE	NUMBER(6)		Director del Centro
  NOMB_CE		VARCHAR2(30)	Nombre del Centro (O)
  DIRECC_CE		VARCHAR2(50)	Dirección del Centro (O)
  POBLAC_CE		VARCHAR2(15)	Población del Centro (O)

DEPARTAMENTOS
-------------
# COD_DE		NUMBER(3)		Código del Departamento
* DIRECTOR_DE	NUMBER(6)		Director del Departamento
* DEPTJEFE_DE	NUMBER(3)		Departamento del que depende
* CENTRO_DE		NUMBER(2)		Centro trabajo (O)
  NOMB_DE		VARCHAR2(40)	Nombre del Departamento (O)
  PRESUP_DE		NUMBER(11)		Presupuesto del Departamento (O)
  TIPODIR_DE	CHAR(1)			Tipo de Director del Departamento (O)

EMPLEADOS
---------
# COD_EM		NUMBER(6)		Código del Empleado
* DEPT_EM		NUMBER(3)		Departamento del Empleado (O)
  EXTTEL_EM		CHAR(9)			Extensión telefónica
  FECINC_EM		DATE			Fecha de incorporación del Empleado (O)
  FECNAC_EM		DATE			Fecha de nacimiento del Empleado (O)
  DNI_EM		VARCHAR2(9)		DNI del Empleado (U)
  NOMB_EM		VARCHAR2(40)	Nombre del Empleado (O)
  NUMHIJ_EM		NUMBER(2)		Número de hijos del Empleado (O)
  SALARIO_EM	NUMBER(9)		Salario Anual del Empleado (O)
  COMISION_EM	NUMBER(9)		Comisión del Empleado

HIJOS
-----
#*PADRE_HI		NUMBER(6)		Código del Empleado
# NUMHIJ_HI		NUMBER(2)		Número del hijo del Empleado
  FECNAC_HI		DATE			Fecha de nacimiento del Hijo (O)
  NOMB_HI		VARCHAR2(40)	Nombre del Hijo (O)



Nota: 
	# PRIMARY KEY
	* FOREIGN KEY
	(O) Obligatorio
	(U) Único

------------------------------------------------------------------------
------------------------------------------------------------------------
1.- Diseña el procedimiento "ModComision" que establezca la comisión de los empleados que trabajan en los centros de:
	- "Madrid", el 10% de su salario.
	- "Sevilla", el 15%. 
	- "Huelva", un 20%. 
	Todos empleados tendrán un incremento de 100 euros en la comisión por cada año de antigüedad en la empresa.*/

CREATE OR REPLACE PROCEDURE DGL_MODCOMISION AS
CURSOR C_EMPLEADOS IS
    SELECT E.COD_EM, E.SALARIO_EM, E.FECINC_EM, C.POBLAC_CE
    FROM EMPLEADOS E
    INNER JOIN DEPARTAMENTOS D ON E.DEPT_EM = D.COD_DE
    INNER JOIN CENTROS C ON D.CENTRO_DE = C.COD_CE;
  
  V_COD_EMPLEADOS C_EMPLEADOS%ROWTYPE;
  V_ANTIGUEDAD NUMBER;
BEGIN
  FOR V_COD_EMPLEADOS IN C_EMPLEADOS LOOP
  
    V_ANTIGUEDAD := TRUNC(MONTHS_BETWEEN(SYSDATE, V_COD_EMPLEADOS.FECINC_EM) / 12);
    
    IF V_COD_EMPLEADOS.POBLAC_CE = 'Madrid' THEN
          UPDATE EMPLEADOS SET COMISION_EM = V_COD_EMPLEADOS.SALARIO_EM * 0.1 + (V_ANTIGUEDAD * 100)
          WHERE COD_EM = v_cod_empleados.COD_EM;
    ELSIF v_cod_empleados.POBLAC_CE = 'Sevilla' THEN
        UPDATE EMPLEADOS SET COMISION_EM = V_COD_EMPLEADOS.SALARIO_EM * 0.15 + (V_ANTIGUEDAD * 100)
        WHERE COD_EM = V_COD_EMPLEADOS.COD_EM;
    ELSIF V_COD_EMPLEADOS.POBLAC_CE = 'Huelva' THEN
        UPDATE EMPLEADOS SET COMISION_EM = V_COD_EMPLEADOS.SALARIO_EM * 0.2 + (V_ANTIGUEDAD * 100)
        WHERE COD_EM = V_COD_EMPLEADOS.COD_EM;
    END IF;
  END LOOP;
  
  EXCEPTION
    WHEN NO_DATA_FOUND THEN DBMS_OUTPUT.PUT_LINE('No se han encontrado los datos');
    WHEN OTHERS THEN DBMS_OUTPUT.PUT_LINE('Error inesperado');
END;
/
    
SET SERVEROUTPUT ON;
EXEC DGL_MODCOMISION;
   

/*------------------------------------------------------------------------
2.- Diseña el procedimiento "ListarCentro" que acepte como parámetro el código
de un centro y muestre un listado con la siguiente estructura, donde la "Masa salarial" 
será la suma de los salrios de los empleados de ese departamento:

Centro    Director                         Poblacion
--------- -------------------------------- ---------
Direccion Del Junco Suarez, Malvina           Madrid
-
Cod Departamento    Director                    Masa salarial
--- --------------- --------------------------- -------------
200 Informatica     Del Junco Suarez, Malvina        23600000
300 Investigacion   Calderon Diaz, Daniel            18000000

*/
CREATE OR REPLACE PROCEDURE DGL_LISTARCENTRO(P_COD_CENTRO IN NUMBER) IS
  V_CENTRO_NOMBRE CENTROS.NOMB_CE%TYPE;
  V_DIRECTOR_NOMBRE EMPLEADOS.NOMB_EM%TYPE;
  V_POBLACION CENTROS.POBLAC_CE%TYPE;
BEGIN
  SELECT NOMB_CE,(SELECT NOMB_EM FROM EMPLEADOS WHERE COD_EM = DIRECTOR_CE) INTO V_CENTRO_NOMBRE, V_DIRECTOR_NOMBRE
  FROM CENTROS
  WHERE COD_CE = P_COD_CENTRO;
  
  SELECT POBLAC_CE INTO V_POBLACION
  FROM CENTROS
  WHERE COD_CE = P_COD_CENTRO;
  
  DBMS_OUTPUT.PUT_LINE('Centro    Director                         Poblacion');
  DBMS_OUTPUT.PUT_LINE('--------- -------------------------------- ---------');
  DBMS_OUTPUT.PUT_LINE(V_CENTRO_NOMBRE || ' ' || V_DIRECTOR_NOMBRE || ' ' || V_POBLACION);
  DBMS_OUTPUT.PUT_LINE('-');
  DBMS_OUTPUT.PUT_LINE('Cod Departamento    Director                    Masa salarial');
  DBMS_OUTPUT.PUT_LINE('--- --------------- --------------------------- -------------');
  
  FOR I IN (SELECT DEPARTAMENTOS.COD_DE, DEPARTAMENTOS.NOMB_DE, EMPLEADOS.NOMB_EM, SUM(EMPLEADOS.SALARIO_EM) AS MASA_SALARIAL
              FROM DEPARTAMENTOS
              JOIN EMPLEADOS ON DEPARTAMENTOS.COD_DE = EMPLEADOS.DEPT_EM
              WHERE DEPARTAMENTOS.CENTRO_DE = P_COD_CENTRO
              GROUP BY DEPARTAMENTOS.COD_DE, DEPARTAMENTOS.NOMB_DE, EMPLEADOS.NOMB_EM) 
  LOOP
    DBMS_OUTPUT.PUT_LINE(I.COD_DE ||' '||I.NOMB_DE ||' '||I.NOMB_EM||' '||I.MASA_SALARIAL);
  END LOOP;
  
  EXCEPTION
    WHEN NO_DATA_FOUND THEN DBMS_OUTPUT.PUT_LINE ('No se ha encontrado los datos');
    WHEN OTHERS THEN DBMS_OUTPUT.PUT_LINE('Error inesperado');
END;
/

SET SERVEROUTPUT ON;
EXEC DGL_LISTARCENTRO('10');

/*------------------------------------------------------------------------
3.- Diseña el procedimiento "Listar" que haga un listado de los datos de todos 
los centros con la estructura del listado anterior.*/

CREATE OR REPLACE PROCEDURE DGL_LISTAR AS
CURSOR C_DATOS IS
    SELECT COD_CE
    FROM CENTROS;
    
BEGIN
    FOR I IN C_DATOS LOOP
        DGL_LISTARCENTRO(C_DATOS(COD_CE));
    END LOOP;
END;
/

SET SERVEROUTPUT ON;
EXEC DGL_LISTAR;
    

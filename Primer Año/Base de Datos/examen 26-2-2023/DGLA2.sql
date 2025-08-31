/*TIPO A2

Nombre: David Guijo Lopez

------------------------------------------------------------------------
	INSTRUCCIONES:
	==============

-Salva este fichero con las iniciales de tu nombre y apellidos,

	Ejemplo:	Francisca Mar�a Checa Ligero
			FMCHLA2.sql

-Pon tu nombre al ejercicio y lee atentamente todas las preguntas.
-Se deben incluir las pruebas para comprobar su correcto funcionamiento
-Todos los procedimientos o funciones deben llevar delante tus iniciales
        ejemplo: ...procedure FMCHL_ModComision ...
-Carga el script para el examen desde el fichero "Empresa.sql".

-RECUERDA: guardar, cada cierto tiempo, el contenido de este fichero. 
Es lo que voy a evaluar, si lo pierdes, lo siento, en la recuperaci�n
tendr�s otra oportunidad.

	PUNTUACI�N
	==========
- Cada pregunta: 	 2 puntos

- Se considerar� para la evaluaci�n:
	- Que funcione
	- Estilo de programaci�n 
	- Tratamiento de excepciones
	- C�digo reutilizable y param�trico

------------------------------------------------------------------------

	Descripci�n de las tablas:
	==========================

CENTROS
-------
# COD_CE		NUMBER(2)		C�digo del Centro
* DIRECTOR_CE	NUMBER(6)		Director del Centro
  NOMB_CE		VARCHAR2(30)	Nombre del Centro (O)
  DIRECC_CE		VARCHAR2(50)	Direcci�n del Centro (O)
  POBLAC_CE		VARCHAR2(15)	Poblaci�n del Centro (O)

DEPARTAMENTOS
-------------
# COD_DE		NUMBER(3)		C�digo del Departamento
* DIRECTOR_DE	NUMBER(6)		Director del Departamento
* DEPTJEFE_DE	NUMBER(3)		Departamento del que depende
* CENTRO_DE		NUMBER(2)		Centro trabajo (O)
  NOMB_DE		VARCHAR2(40)	Nombre del Departamento (O)
  PRESUP_DE		NUMBER(11)		Presupuesto del Departamento (O)
  TIPODIR_DE	CHAR(1)			Tipo de Director del Departamento (O)

EMPLEADOS
---------
# COD_EM		NUMBER(6)		C�digo del Empleado
* DEPT_EM		NUMBER(3)		Departamento del Empleado (O)
  EXTTEL_EM		CHAR(9)			Extensi�n telef�nica
  FECINC_EM		DATE			Fecha de incorporaci�n del Empleado (O)
  FECNAC_EM		DATE			Fecha de nacimiento del Empleado (O)
  DNI_EM		VARCHAR2(9)		DNI del Empleado (U)
  NOMB_EM		VARCHAR2(40)	Nombre del Empleado (O)
  NUMHIJ_EM		NUMBER(2)		N�mero de hijos del Empleado (O)
  SALARIO_EM	NUMBER(9)		Salario Anual del Empleado (O)
  COMISION_EM	NUMBER(9)		Comisi�n del Empleado

HIJOS
-----
#*PADRE_HI		NUMBER(6)		C�digo del Empleado
# NUMHIJ_HI		NUMBER(2)		N�mero del hijo del Empleado
  FECNAC_HI		DATE			Fecha de nacimiento del Hijo (O)
  NOMB_HI		VARCHAR2(40)	Nombre del Hijo (O)



Nota: 
	# PRIMARY KEY
	* FOREIGN KEY
	(O) Obligatorio
	(U) �nico

------------------------------------------------------------------------
4.- Crea la funci�n "Aniversario" que se le pase como par�metro una fecha 
y que devuelva TRUE o FALSE si hoy fuera el aniversario algo que ocurri� en esa fecha.
*/

CREATE OR REPLACE FUNCTION DGL_ANIVERSARIO(P_FECHA DATE) 
RETURN BOOLEAN IS
    V_ANIVERSARIOHOY DATE := TRUNC(SYSDATE);
    
BEGIN
    IF TO_CHAR(V_ANIVERSARIOHOY, 'DDMM') = TO_CHAR(P_FECHA, 'DDMM') THEN
        RETURN TRUE;
    ELSE
        RETURN FALSE;
    END IF;
END;
/   

SET SERVEROUTPUT ON;
DECLARE
    V_RESULTADO BOOLEAN;
BEGIN
    V_RESULTADO := DGL_ANIVERSARIO(TO_DATE('26-05-10', 'DD-MM-YY'));

    IF V_RESULTADO THEN
        DBMS_OUTPUT.PUT_LINE('TRUE');
    ELSE
        DBMS_OUTPUT.PUT_LINE('FALSE');
    END IF;
END;
/


/*
------------------------------------------------------------------------
5.- Dise�a el procedimiento "ListarAniversario" que genere un listado en el que
se vea cada empleado con su fecha de incorporaci�n a la empresa indicando "Aniversario" 
a aquellos empleados  que hoy sea el aniversario de su incorporaci�n a la empresa, 
indicando el total de personas que lo cumplen.

	Ej.:
		Segura Viudas, Santiago	19/05/90		Aniversario	
		Rivera Calvete, Jos� M�	02/06/95
		Conan B�rbaro, Mari		12/06/99

		Total Aniversario: 1
*/
CREATE OR REPLACE PROCEDURE DGL_LISTARANIVERSARIO AS
CURSOR C_DATOS IS
    SELECT NOMB_EM AS NOMBRE, FECINC_EM AS FECHAINCORPORACION
    FROM EMPLEADOS;

  V_NOMBRE VARCHAR2(100);
  V_INCORPORACION DATE;
  V_ANIVERSARIOS NUMBER := 0;

BEGIN

FOR I IN C_DATOS LOOP
    V_NOMBRE := I.NOMBRE;
    V_INCORPORACION := I.FECHAINCORPORACION;

    IF DGL_ANIVERSARIO(V_INCORPORACION) THEN
        V_ANIVERSARIOS := V_ANIVERSARIOS + 1;
        DBMS_OUTPUT.PUT_LINE(V_NOMBRE||' '||TO_CHAR(V_INCORPORACION,'DD/MM/YY')||' '||'Aniversario');
    ELSE
        DBMS_OUTPUT.PUT_LINE(V_NOMBRE||' '||TO_CHAR(V_INCORPORACION,'DD/MM/YY'));
    END IF;
END LOOP;

  DBMS_OUTPUT.PUT_LINE('Total Aniversario: '||V_ANIVERSARIOS);
END;
/

EXEC DGL_LISTARANIVERSARIO;

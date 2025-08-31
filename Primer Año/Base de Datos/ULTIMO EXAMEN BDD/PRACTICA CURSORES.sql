SET SERVEROUTPUT ON

-- SOBRE LA BASE DE DATOS TIENDA

-- 1.Implementa un procedimiento llamado listaPFP_tusiniciales que muestre un Listado
-- con el nombre de cada fabricante junto con el nombre y el precio de cada producto que
-- suministra

CREATE OR REPLACE PROCEDURE  listaPFP_JDTE as
    CURSOR Lista is
    SELECT F.nombre, P.nombre, P.precio
    FROM Fabricante F JOIN PRODUCTO P ON F.ID = P.ID_FABRICANTE;
   
    var_fnombre FABRICANTE.nombre%type;
    var_pnombre PRODUCTO.nombre%type;
    var_pprecio PRODUCTO.precio%type;
   
BEGIN
    OPEN Lista;
    LOOP
    FETCH Lista INTO var_fnombre, var_pnombre, var_pprecio ;
    EXIT WHEN Lista%NOTFOUND;
    DBMS_OUTPUT.PUT_LINE('-----------------------');
    DBMS_OUTPUT.PUT_LINE('Nombre fabricante:' || var_fnombre);
    DBMS_OUTPUT.PUT_LINE('Nombre producto:' || var_pnombre);
    DBMS_OUTPUT.PUT_LINE('Precio producto:' || var_pprecio);
    END LOOP;
    DBMS_OUTPUT.PUT_LINE('-----------------------');
    CLOSE Lista;
END;
/

EXEC listaPFP_JDTE;

-- 2.Implementa un procedimiento llamado PRECIO_MEDIO_TUSINICIALES de los productos
-- de cada fabricante

CREATE OR REPLACE PROCEDURE  PRECIO_MEDIO_JDTE as
    CURSOR Lista is
    SELECT F.nombre, AVG(P.precio)
    FROM Fabricante F JOIN PRODUCTO P ON F.ID = P.ID_FABRICANTE
    GROUP BY F.nombre;
   
    var_fnombre FABRICANTE.nombre%type;
    var_pprecio PRODUCTO.precio%type;
BEGIN
    OPEN Lista;
    LOOP
    FETCH Lista INTO var_fnombre, var_pprecio;
    EXIT WHEN Lista%NOTFOUND;
    DBMS_OUTPUT.PUT_LINE('-----------------------');
    DBMS_OUTPUT.PUT_LINE('Nombre fabricante:' || var_fnombre);
    DBMS_OUTPUT.PUT_LINE('Precio medio:' || var_pprecio);
    END LOOP;
    DBMS_OUTPUT.PUT_LINE('-----------------------');
    CLOSE Lista;
END;
/

EXEC PRECIO_MEDIO_JDTE;

-- SOBRE LA BASE DE DATOS PRACTICA1

-- 3. Desarrollar un procedimiento que visualice el el nombre y la fecha de alta de
-- todos los empleados ordenados por FECHA DE ALTA

CREATE OR REPLACE PROCEDURE NOMBRE_FECHA_EMPLEADO_JDTE as
    CURSOR Lista is
    SELECT NOMEM, FECIN
    FROM EMPLEADOS
    ORDER BY FECIN;
   
    var_nombre EMPLEADOS.nomem%type;
    var_FECIN EMPLEADOS.fecin%type;
BEGIN
    OPEN Lista;
    LOOP
    FETCH Lista INTO var_nombre, var_FECIN;
    EXIT WHEN Lista%NOTFOUND;
    DBMS_OUTPUT.PUT_LINE('-----------------------');
    DBMS_OUTPUT.PUT_LINE('Nombre empleado:' || var_nombre);
    DBMS_OUTPUT.PUT_LINE('FECHA DE ALTA:' || var_FECIN);
    END LOOP;
    DBMS_OUTPUT.PUT_LINE('-----------------------');
    CLOSE Lista;
END;
/

EXEC NOMBRE_FECHA_EMPLEADO_JDTE;

-- 4. Desarrollar un procedimiento que permita insertar nuevos departamentos seg�n las
-- siguientes especificaciones:
-- *Se pasar� al procedimiento el nombre del departamento.
-- *El procedimiento insertar� la fila nueva asignando como n�mero de departamento la
-- decena siguiente al n�mero mayor de la tabla.
-- *Se incluir� gesti�n de posibles errores.

CREATE OR REPLACE PROCEDURE INSERTAR_DEPARTAMENTO_JDTE (NOMBRE_DEPARTAMENTO DEPARTAMENTOS.nomde%type)as
    var_NUMDE DEPARTAMENTOS.NUMDE%type;
BEGIN
    SELECT MAX(NUMDE)+10 INTO var_NUMDE FROM DEPARTAMENTOS;
    
    INSERT INTO DEPARTAMENTOS (NOMDE, NUMDE) VALUES (NOMBRE_DEPARTAMENTO, var_NUMDE);
    
    -- INCLUIR ERRORES
END;
/

EXEC INSERTAR_DEPARTAMENTO_JDTE;

-- 5.Desarrolla un procedimiento donde se muestre un informe completo por cada centro
-- de los departamentos que lo componen y por cada departamento la informaci�n relativa
-- a cada uno de sus empleados. Como vemos en el ejemplo de salida que debe proporcionar
-- el procedimiento.

CREATE OR REPLACE PROCEDURE MOSTRAR_INFORME_COMPLETO AS
    CURSOR centro IS
        SELECT NUMCE, NOMCE, DIRCE
        FROM CENTROS;

     CURSOR departamento IS
        SELECT NUMDE, NOMDE, PRESU, NUMCE
        FROM DEPARTAMENTOS;

    CURSOR empleado IS
        SELECT NOMEM, NUMEM, NUMHI, SALAR, NUMDE
        FROM EMPLEADOS;

    var_DIRECTOR EMPLEADOS.nomem%type;
BEGIN
    FOR X IN centro LOOP
        DBMS_OUTPUT.PUT_LINE('----------------------------------------------');
        DBMS_OUTPUT.PUT_LINE('Centro: ' || X.NOMCE || '('||X.DIRCE || ')');
        FOR I IN departamento LOOP
            IF X.NUMCE = I.NUMCE THEN
                SELECT NOMEM INTO var_DIRECTOR FROM EMPLEADOS WHERE NUMEM=(SELECT DIREC FROM DEPARTAMENTOS WHERE NUMDE=I.NUMDE);
                DBMS_OUTPUT.PUT_LINE('. Departamento: ' || I.NUMDE ||' ' || I.NOMDE || '(' || I.PRESU || ')' || ' Director: ' || var_DIRECTOR);
                FOR J IN empleado LOOP
                    IF I.NUMDE= J.NUMDE THEN
                        DBMS_OUTPUT.PUT_LINE( '. . ' || J.NUMEM || ' ' || J.NOMEM || ' HIJOS: ' || J.NUMHI || ' SALARIO: '|| J.SALAR);
                    END IF;
                END LOOP;
            END IF;
         END LOOP;
    END LOOP;
END;
/

-- OTRA FORMA DE HACERLO

CREATE OR REPLACE PROCEDURE MOSTRAR_INFORME_COMPLETO AS
    CURSOR centro IS
        SELECT NUMCE, NOMCE, DIRCE
        FROM CENTROS;

     CURSOR departamento (cod CENTROS.NUMCE%TYPE)IS
        SELECT D.NUMDE, D.NOMDE, D.PRESU, E.NOMEM
        FROM DEPARTAMENTOS D JOIN EMMPLEADOS E ON D.NUMDE=E.NUMDE
        WHERE D.DIRCE=E.NUMEM AND D.NUMCE=cod;

    CURSOR empleado (cod DEPARTAMENTOS.NUMDE%TYPE)IS
        SELECT NOMEM, NUMEM, NUMHI, SALAR, NUMDE
        FROM EMPLEADOS
        WHERE NUMDE=cod;

BEGIN
    FOR X IN centro LOOP
        DBMS_OUTPUT.PUT_LINE('----------------------------------------------');
        DBMS_OUTPUT.PUT_LINE('Centro: ' || X.NOMCE || '('||X.DIRCE || ')');
        FOR I IN departamento(x.NUMCE) LOOP
                DBMS_OUTPUT.PUT_LINE('. Departamento: ' || I.NUMDE ||' ' || I.NOMDE || '(' || I.PRESU || ')' || ' Director: ' || I.NOMEM);
                FOR J IN empleado(I.NUMDE) LOOP
                        DBMS_OUTPUT.PUT_LINE( '. . ' || J.NUMEM || ' ' || J.NOMEM || ' HIJOS: ' || J.NUMHI || ' SALARIO: '|| J.SALAR);
                END LOOP;
         END LOOP;
    END LOOP;
END;
/

EXEC MOSTRAR_INFORME_COMPLETO;




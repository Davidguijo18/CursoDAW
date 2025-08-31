/*Procedimiento evaluable 1
Nombre y apellidos:  
*/
-- Consultas necesarias.


/*Procedimiento que reciba como par�metro de entrada el nombre de una ciudad y nos muestre
los clientes (oredenados por apellido1,apellido2 y nombre)de esa ciudad  que han realizado 
pedidos junto con la fecha y el total de cada  pedido.
Tambi�n ha de mostrar el valor medio del total de los pedidos, el valor m�nimo 
del total y el m�ximo. Ha de controlar la excepci�n de no tener registrodos 
clientes de la ciudad que se indique c�mo par�metro.*/
 
create or replace procedure ciudadfm(ciud cliente.ciudad%type)
as
      cursor clientes is
        select nombre, apellido1, apellido2,total,fecha
        from cliente join pedido on cliente.id=pedido.id_cliente
        where ciudad=ciud
        order by 2,3,1; 
        
        fila clientes%rowtype; 
        
        mini number;
        maxi number;
        medi number;
        
        nociudad exception;
         
begin
    open clientes;
    fetch clientes into fila;
    if clientes%NOTFOUND then
                raise nociudad;
    else       
   
        dbms_output.put_line('Los clientes de '||ciud || ' que han realizado pedidos son:');
        dbms_output.put_line('---------------------------------------------------------------------------------');
        while clientes%found loop
    
            dbms_output.put_line(fila.nombre||' '||fila.apellido1||' '||fila.apellido2||' '||fila.total||' � '||fila.fecha);
            fetch clientes into fila;
         end loop; 
            dbms_output.put_line('---------------------------------------------------------------------------------');
            dbms_output.put_line('Hay un total de  '||clientes%rowcount ||' pedidos');
        close clientes;
   end if;
   
   select min(total), max(total), avg(total) into mini,maxi,medi
   from cliente join pedido on cliente.id=pedido.id_cliente
   where ciudad=ciud;
   dbms_output.put_line(' ');
   dbms_output.put_line('El valor medio del total de los pedidos es: '||medi|| ' �');
   dbms_output.put_line('El pedido de valor mánimo es: '||mini|| ' �');
   dbms_output.put_line('El pedido de valor máximo es: '||maxi|| ' �');
   
   exception
     WHEN nociudad  THEN
            dbms_output.put_line('No tenemos clientes de '||ciud);
   
end;
/
set SERVEROUTPUT ON
exec ciudadfm('Albacete');
exec ciudadfm('Granada');
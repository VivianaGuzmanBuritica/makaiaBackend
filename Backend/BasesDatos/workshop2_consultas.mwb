-- 1. Devuelve un listado con el código de oficina y la ciudad donde hay oficinas.
SELECT codigo_oficina , ciudad FROM jardineria.oficina;

#2. Devuelve un listado con la ciudad y el teléfono de las oficinas de España
select ciudad, telefono,pais from oficina where pais='España';

-- 3. Devuelve un listado con el nombre, apellidos y email de los empleados cuyo jefe tiene un código de jefe igual a 7.
SELECT nombre, apellido1, apellido2, email, codigo_jefe FROM jardineria.empleado
where codigo_jefe = 7;

#4. Devuelve un listado con el código de cliente de aquellos clientes que realizaron algún pago en 2008.
# Tenga en cuenta que deberá eliminar aquellos códigos de cliente que aparezcan repetidos.
select*from pago;

select distinct c.codigo_cliente, date_format(p.fecha_pago, '%Y') from cliente c, pago p
where date_format(p.fecha_pago, '%Y')=2008 order by c.codigo_cliente asc;

select distinct c.codigo_cliente, year(p.fecha_pago) from cliente c, pago p
where year(p.fecha_pago)=2008 order by c.codigo_cliente asc;

-- 5. ¿Cuántos empleados hay en la compañía?
select COUNT(*) AS cant_empleados from jardineria.empleado;

#6. ¿Cuántos clientes tiene cada país?
select pais, count(codigo_cliente) from cliente group by pais;

-- 7. ¿Cuál fue el pago medio en 2009?
select avg(total) as promedio_pago from jardineria.pago;

#8. ¿Cuántos pedidos hay en cada estado? 
#Ordena el resultado de forma descendente por el número de pedidos.

select estado, count(codigo_pedido) from pedido group by  estado order by count(codigo_pedido) desc;

-- 9. Calcula el precio de venta del producto más caro y barato en una misma consulta.
select min(precio_venta) as barato, max(precio_venta) as caro from jardineria.producto;

# 10. Devuelve el nombre del cliente con mayor límite de crédito.

select nombre_cliente,limite_credito 
from cliente 
where limite_credito=(select max(limite_credito) from cliente);

-- 11. Devuelve el nombre del producto que tenga el precio de venta más caro.
select nombre,  max(precio_venta) as precio from jardineria.producto;

#12. Devuelve el nombre del producto del que se han vendido más unidades. 
#Tenga en cuenta que tendrá que calcular cuál es el número total de unidades 
#que se han vendido de cada producto a partir de los datos de la tabla detalle_pedido

select dp.codigo_producto, sum(dp.cantidad), p.nombre  from jardineria.detalle_pedido dp, jardineria.producto p
where p.codigo_producto = dp.codigo_producto	
group by dp.codigo_producto
order by sum(dp.cantidad) desc limit 1;

-- 13. Los clientes cuyo límite de crédito sea mayor que los pagos que haya realizado. (Sin utilizar INNER JOIN).
select distinct c.codigo_cliente, c.limite_credito, p.total from jardineria.cliente c, jardineria.pago p
where c.codigo_cliente = p.codigo_cliente
and c.limite_credito < p.total;

 -- 14- 17. Devuelve el listado de clientes indicando el nombre del cliente y cuantos pedidos ha realizado. Tenga en cuenta que pueden existir clientes que no han realizado ningún pedido.
 select c.nombre_cliente, count(p.codigo_cliente) as cant_pedidos  from jardineria.cliente c
 left join jardineria.pedido p on p.codigo_cliente = c.codigo_cliente
 group by p.codigo_cliente;

 -- 15. Devuelve el nombre, apellidos, puesto y teléfono de la oficina de aquellos empleados que no sean representante de ventas de ningún cliente.
 select e.codigo_empleado, e.nombre, e.apellido1, e.puesto, e.extension from jardineria.empleado e
 where  e.codigo_empleado not in (select c.codigo_empleado_rep_ventas from jardineria.cliente c);
  
  -- 16. Devuelve las oficinas donde no trabajan ninguno de los empleados que hayan sido los representantes de ventas de algún 
 -- cliente que haya realizado la compra de algún producto de la gama Frutales

select e.codigo_oficina, e.codigo_empleado, pd.codigo_producto, pr.gama from jardineria.empleado e
##empleado con cliente
join jardineria.cliente cl on cl.codigo_empleado_rep_ventas= e.codigo_empleado
#cliente con pedido
join jardineria.pedido pe on  pe.codigo_cliente= cl.codigo_cliente
#pedido con detalle_pedido
join jardineria.detalle_pedido pd on pd.codigo_pedido = pe.codigo_pedido
#detalle_pedido con producto
join jardineria.producto pr on pr.codigo_producto = pd.codigo_producto
where pr.gama != "Frutales";

  -- 18. Devuelve un listado con los nombres de los clientes y el total pagado por cada uno de ellos. Tenga en cuenta que pueden existir clientes que no han realizado ningún pago.
select c.nombre_cliente,  sum(p.total) as total_pagado  from jardineria.cliente c
 left join jardineria.pago p on p.codigo_cliente = c.codigo_cliente
 group by c.codigo_cliente;
 



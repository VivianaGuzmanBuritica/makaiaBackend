-- 1. Devuelve un listado con todos los pedidos que se han realizado. 
-- Los pedidos deben estar ordenados por la fecha de realización, mostrando en primer lugar los pedidos más recientes.

select * FROM ventas.pedido
order by fecha DESC

-- 3. Devuelve un listado con los identificadores de los clientes que han realizado algún pedido. 
-- Tenga en cuenta que no debe mostrar identificadores que estén repetidos.

select id_cliente from ventas.pedido p
group by id_cliente

-- 5 Devuelve un listado con el nombre y los apellidos de los comerciales que tienen una comisión entre 0.05 y 0.11.
select * from ventas.comercial
where comisión between 0.05 and 0.11

-- 7 Devuelve el número total de pedidos que se han realizado cada año.
select year(fecha) anios, count(*) total_pedidos from pedido
group by  year(fecha)
order by fecha desc

-- 9 Devuelve un listado con el identificador, nombre y los apellidos de todos los clientes que han realizado algún pedido. 
-- El listado debe estar ordenado alfabéticamente y se deben eliminar los elementos repetidos.

select p.id id_pedido, c.*  from ventas.pedido p
inner join ventas.cliente c on c.id = p.id_cliente
group by nombre
order by nombre asc

-- 11 Devuelve un listado con todos los pedidos que ha realizado Adela Salas Díaz. (Sin utilizar INNER JOIN).

select p.id id_pedido, c.nombre cliente from cliente c, pedido p
where nombre = "Adela"
group by p.id_cliente

-- 13 Devuelve los datos del cliente que realizó el pedido más caro en el año 2019. (Sin utilizar INNER JOIN)

select year(fecha), max(total), c.*  from ventas.cliente c, ventas.pedido p
where year(fecha) = 2019
and c.id = p.id_cliente

-- 2) Devuelve todos los datos de los dos pedidos de mayor valor
SELECT * FROM ventas.pedido
order by total desc
LIMIT 2;

-- 4) Devuelve un listado de todos los pedidos que se realizaron durante el año 2017, cuya cantidad total sea superior a 500€.
SELECT id, fecha, total
FROM pedido
WHERE YEAR(fecha) = 2017 AND total > 500;

-- 6) Devuelve cuál ha sido el pedido de máximo valor que se ha realizado cada año.
SELECT YEAR(fecha) AS anio, MAX(total) AS max_total
FROM pedido
GROUP BY YEAR(fecha);

-- 8) Devuelve el valor de la comisión de mayor valor que existe en la tabla comercial.
SELECT MAX(comisión) as max_comision
FROM comercial;

-- 10) Devuelve un listado que muestre todos los pedidos que ha realizado cada cliente. El resultado debe mostrar todos los datos de los pedidos y del cliente. El listado debe mostrar los datos de los clientes ordenados alfabéticamente.
SELECT c.id AS id_cliente, c.nombre, c.apellido1, c.apellido2, p.id AS id_pedido, p.fecha, p.total
FROM cliente c
INNER JOIN pedido p ON c.id = p.id_cliente
ORDER BY c.nombre, c.apellido1, c.apellido2;

-- 12) Devuelve el número de pedidos en los que ha participado el comercial Daniel Sáez Vega. (Sin utilizar INNER JOIN)
SELECT COUNT(*) AS num_pedidos
FROM pedido
WHERE id_comercial = (
  SELECT id
  FROM comercial
  WHERE nombre = 'Daniel' AND apellido1 = 'Sáez' AND apellido2 = 'Vega'
);

-- 14) Devuelve un listado de los clientes que no han realizado ningún pedido. (Utilizando IN o NOT IN).
SELECT id, nombre, apellido1, apellido2
FROM cliente
WHERE id NOT IN (
  SELECT DISTINCT id_cliente
  FROM pedido
);

-- 15) Devuelve un listado de los comerciales que no han realizado ningún pedido. (Utilizando IN o NOT IN).
SELECT id, nombre, apellido1, apellido2
FROM ventas.comercial
WHERE id NOT IN (
  SELECT DISTINCT id_comercial
  FROM ventas.pedido
);



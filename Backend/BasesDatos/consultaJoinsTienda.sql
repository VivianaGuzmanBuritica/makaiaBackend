SELECT p.id_pedido, p.fecha_pedido, c.nombre_cliente, pr.nombre_producto, ct.nombre_categorias, 
m.nombre_marca fROM tienda_en_linea.pedidos p
INNER JOIN tienda_en_linea.clientes c on c.id_cliente=p.id_cliente
INNER JOIN tienda_en_linea.productos pr on pr.id_producto= p.id_producto
INNER JOIN tienda_en_linea.categorias ct on ct.id_categorias = pr.id_categoria
INNER JOIN tienda_en_linea.marcas m on m.id_marca = pr.id_marca
WHERE p.fecha_pedido ='10-02-2021'

-- PROCEDIMIENTO ALMACENADOS
call sp_mostrarNombres();
call new_procedure_insertarCliente(11, 'Viviana', 'Guzman', 'burtica', 'cali', 100);
call actualizar_ciudad_cliente('Bogota', 11);
select buscar_cliente('Viviana');
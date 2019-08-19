USE	DBTECNOIMPORT;

CREATE PROCEDURE sp_agregar_cliente (
@xml_datos XML,
@err_code int output
)
AS
BEGIN TRY
	BEGIN TRANSACTION
		INSERT INTO dbo.Cliente VALUES (
			@xml_datos.value('(/Clientes/Cliente/cedula)[1]','varchar(10)'),
			@xml_datos.value('(/Clientes/Cliente/nombre)[1]','varchar(255)'),
			@xml_datos.value('(/Clientes/Cliente/direccion)[1]','varchar(255)'),
			@xml_datos.value('(/Clientes/Cliente/telefono)[1]','varchar(15)')
		);
	COMMIT
	SET @err_code = 0;
END TRY
BEGIN CATCH
    ROLLBACK
    SET @err_code = 1;
END CATCH
GO

CREATE PROCEDURE sp_detalles_transaccion (
@xml_datos_detalles XML,
@id_transaccion int
)
AS
	INSERT INTO dbo.Detalle_Transaccion (id_transaccion, id_articulo, cantidad) VALUES (
		@id_transaccion,
		@xml_datos_detalles.query('articulo').value('.','int'),
		@xml_datos_detalles.query('cantidad').value('.','int')
	);
GO

CREATE PROCEDURE sp_realizar_transaccion (
@tipo VARCHAR(15),
@xml_datos XML,
@xml_datos_detalles XML,
@err_code INT output
)
AS
DECLARE @id_transaccion int;
BEGIN TRY
	BEGIN TRANSACTION
		INSERT INTO dbo.Transaccion (id_cliente, id_establecimiento, fecha_creacion, hora_creacion, tipo, subtotal, total) VALUES (
			@xml_datos.value('(/Transacciones/Transaccion/cedula)[1]','varchar(10)'),
			@xml_datos.value('(/Transacciones/Transaccion/id_establecimiento)[1]','int'),
			@xml_datos.value('(/Transacciones/Transaccion/fecha_creacion)[1]','varchar(8)'),
			@xml_datos.value('(/Transacciones/Transaccion/hora_creacion)[1]','varchar(6)'),
			@tipo,
			@xml_datos.value('(/Transacciones/Transaccion/subtotal)[1]','float'),
			@xml_datos.value('(/Transacciones/Transaccion/total)[1]','float')
		);
	SET @id_transaccion = SCOPE_IDENTITY();
	EXEC sp_detalles_transaccion @xml_datos_detalles, @id_transaccion;
	COMMIT
	SET @err_code = 0;
END TRY
BEGIN CATCH
    ROLLBACK
    SET @err_code = 1;
END CATCH
GO

CREATE PROCEDURE sp_buscar_cliente (
@cedula VARCHAR(10)
)
AS
	SELECT *
	FROM dbo.Cliente
	WHERE cedula = @cedula
GO

CREATE PROCEDURE sp_consultar_entrega (
@fecha_inicio VARCHAR(8),
@fecha_fin VARCHAR(8)
)
AS
	SELECT *
	FROM dbo.ENTREGA e
	INNER JOIN dbo.Detalle_Entrega de
	ON e.id_entrega = de.id_entrega
	WHERE e.fecha_entrega BETWEEN 
	@fecha_inicio AND @fecha_inicio
GO

CREATE PROCEDURE sp_buscar_articulo_nombre (
@string VARCHAR(255)
)
AS
	SELECT nombre, descripcion, categoria, precio
	FROM dbo.Articulo
	WHERE nombre LIKE @string
GO

CREATE PROCEDURE sp_buscar_articulo_descripcion (
@string VARCHAR(255)
)
AS
	SELECT nombre, descripcion, categoria, precio
	FROM dbo.Articulo
	WHERE descripcion LIKE @string
GO

CREATE PROCEDURE sp_buscar_articulo_categoria (
@string VARCHAR(255)
)
AS
	SELECT nombre, descripcion, categoria, precio
	FROM dbo.Articulo
	WHERE categoria LIKE @string
GO

CREATE PROCEDURE sp_entrega_no_asignada (
@xml_datos_detalles XML,
@err_code INT OUTPUT
)
AS
BEGIN TRY
	BEGIN TRANSACTION
		INSERT INTO dbo.Detalle_Entrega (id_transaccion, detalle, fueExitosa) VALUES (
			@xml_datos_detalles.value('(/Entregas/Entrega/transaccion)[1]','int'),
			@xml_datos_detalles.value('(/Entregas/Entrega/detalles)[1]','varchar(255)'),
			1
		);
	COMMIT
	SET @err_code = 0;
END TRY
BEGIN CATCH
    ROLLBACK
    SET @err_code = 1;
END CATCH
GO

CREATE PROCEDURE sp_asignar_repartidor (
@id_entrega INT,
@xml_entregas XML
)
AS
	UPDATE dbo.Detalle_Entrega
	SET id_entrega = @id_entrega
	WHERE id_detalle =
		(SELECT @xml_entregas.query('id_detalle').value('.','int'))
GO

CREATE PROCEDURE sp_crear_entrega (
@xml_datos XML,
@xml_entregas XML,
@err_code INT OUTPUT
)
AS
DECLARE @id_entrega int;
BEGIN TRY
	BEGIN TRANSACTION
		INSERT INTO dbo.Entrega (id_repartidor, fecha_entrega, detalle_ruta) VALUES (
			@xml_datos.value('(/Entregas/Entrega/id_repartidor)[1]','varchar(10)'),
			@xml_datos.value('(/Entregas/Entrega/fecha_entrega)[1]','varchar(8)'),
			@xml_datos.value('(/Entregas/Entrega/detalle_ruta)[1]','varchar(255)')
		);
	SET @id_entrega = SCOPE_IDENTITY();
	EXEC sp_asignar_repartidor @id_entrega, @xml_entregas;
	COMMIT
	SET @err_code = 0;
END TRY
BEGIN CATCH
    ROLLBACK
    SET @err_code = 1;
END CATCH
GO

CREATE PROCEDURE sp_iniciar_sesion (
@usuario VARCHAR(255),
@clave VARCHAR(255),
@output BIT OUTPUT
)
AS
SET @output = CASE WHEN EXISTS (
    SELECT *
    FROM dbo.Usuario
    WHERE usuario = @usuario
    AND clave = @clave
	)
THEN CAST(1 AS BIT)
ELSE CAST(0 AS BIT) END
GO

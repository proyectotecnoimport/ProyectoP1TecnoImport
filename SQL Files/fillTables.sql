USE DBTECNOIMPORT;

INSERT INTO Articulo (nombre, descripcion, categoria, precio)
VALUES ('Teclado USB', 'Teclado de 30x10 cm marca generica', 'Perifericos', 19.99),
	('Mouse USB', 'Mouse USB marca Genius', 'Perifericos', 14.99),
	('Laptop Dell Core i5', 'Portatil marca Dell con procesador Core i5, 500 gB de almacenamiento y RAM 4GB', 'Laptops', 299.99),
	('PC HP Slimline', 'PC HP Slimline 270-P033W, Intel Celeron G3930 2.9GHz, RAM 4GB, HDD 500GB, DVD-RW, Wi-FI, Windows 10 Home', 'Computadores', 999.00),
	('Monitor HP', 'Monitor marca HP de 18.5" Full HD', 'Perifericos', 49.99),
	('Pendrive SanDisk 12 Gb', 'Pendrive marca SanDisk de 10x2 cm con 12 gB de almacenamiento', 'Almacenamiento', 9.99),
	('Toshiba Canvio Basics', 'Disco duro externo, 2.5 pulgadas (7.9 cm), Negro, 1 TB', 'Almacenamiento', 49.99)

INSERT INTO Establecimiento (direccion, telefono, tipo_establecimiento)
VALUES ('Boyacá y 9 de Octubre, diagonal a la estación Boca 9', '046025257', 'Sucursal'),
	('Av. Juan Tanca Marengo, diagonal al Dicentro', '1800-832664', 'Matriz'),
	('Parque California, Via a Daule', '046232124', 'Bodega')

INSERT INTO Inventario (id_establecimiento, id_articulo, cantidad)
VALUES (1, 1, 30),
	(1,2,20),(1,6,15),(1,7,5),
	(2,3,10),(2,4,15),(2,5,12),
	(3,1,50),(3,2,40),(3,3,40),(3,4,20),(3,5,20),(3,6,50),(3,7,20)
	
INSERT INTO Empleado VALUES
	('0926903025', 'Jorge Parrales', '19902005', 'jparrales@gmail.com', 'Vendedor', 1),
	('0864826423', 'Emilio Insua', '19940405', 'emilio.insua@gmail.com', 'Vendedor', 1),
	('0912926060', 'Victoria Ricaurte', '19700121', 'v.ricaurte1970@tecnoimport.com', 'Gerente', 1),
	('0953728596', 'Gustavo Macías', '19931212', 'gmacias@gmail.com', 'Vendedor', 2),
	('0956473840', 'Susana Restrepo', '19951105', 'restrepo1105@hotmail.com', 'Vendedor', 2),
	('0967534245', 'Luis Mendoza', '19800420', 'l.mendoza1980@tecnoimport.com', 'Gerente', 2),
	('0845362738', 'José Pérez', '19850107', NULL, 'Repartidor',3),
	('0745432344', 'Antonio Zambrano', '19871125', NULL, 'Repartidor',3),
	('0845362638', 'Miguel Benalcázar', '19840713',NULL, 'Repartidor',3),
	('0927678659', 'Mario Rendón', '19801025','m.rendon1980@tecnoimport.com', 'Jefe de Bodega',3)

INSERT INTO Usuario (cedula, usuario, clave, esAdmin)
VALUES ('0926903025', 'jparrales', 'Jpml990', 0),
	('0864826423', 'eminsua94', '03252002', 0),
	('0912926060', 'vricaurte', 'ricaurte1123', 0),
	('0953728596', 'gusmacias', 'barcelonaEstrella15', 0),
	('0956473840', 'susrestrepo', '05111995', 0),
	('0967534245', 'luchitomendoza', 'LU2004', 0),
	('0927678659', 'mrendon', 'luigi1983', 0)
	
INSERT INTO Cliente VALUES
	('0925465684', 'Carlos Orellana', 'La Saiba Mz. O V. 13', '042330779'),
	('0967453648', 'Emilio Valarezo', 'Alborada 10ma Etapa Solar 6', '04625453'),
	('0954637485', 'Andrés Menoscal', 'Lomas de Urdesa MZ. B Solar 30', '046025465'),
	('0912345638', 'Romina Cevallos', 'Samanes 5 Mz H V 12', '042337645'),
	('0954638564', 'Alejandra Caicedo', '40 y La J', '042025647'),
	('0965748395', 'Jorge Icaza', 'Alborada 7ma Etapa Solar 7', '046546374')

INSERT INTO Transaccion (id_cliente, id_establecimiento, fecha_creacion, hora_creacion, tipo, subtotal, total)
VALUES ('0925465684', 1, '20190728', '164045', 'Venta', 17.69, 19.99),
	('0967453648', 1, '20190728', '173023', 'Venta', 17.69, 19.99),
	('0954637485', 2, '20190728', '182014', 'Cotización', 928.31, 1048.99),
	('0912345638', 1, '20190729', '123144', 'Venta', 26.52, 29.97),
	('0954638564', 1, '20190729', '133541', 'Cotizacion', 176.90, 199.90),
	('0954637485', 2, '20190729', '151221', 'Venta', 928.31, 1048.99),
	('0965748395', 2, '20190729', '163540', 'Venta', 265.48, 299.99)
	
INSERT INTO Detalle_Transaccion (id_transaccion, id_articulo, cantidad)
VALUES (1, 1, 1),
	(2, 1, 1),
	(3, 4, 1),(3, 5, 1),
	(4, 6, 2),
	(5, 1, 10),
	(6, 4, 1),(6, 5, 1),
	(7, 3, 1)
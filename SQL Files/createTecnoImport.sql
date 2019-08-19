CREATE DATABASE DBTECNOIMPORT;
USE DBTECNOIMPORT;

CREATE TABLE Articulo (
	id_articulo int NOT NULL auto_increment,
	nombre varchar(255),
	descripcion varchar(255),
	categoria varchar(255),
	precio float,
	PRIMARY KEY (id_articulo)
);

CREATE TABLE Inventario (
	id_inventario int NOT NULL auto_increment,
	id_articulo int,
	cantidad int,
	PRIMARY KEY (id_inventario),
	FOREIGN KEY (id_articulo) REFERENCES Articulo(id_articulo)
);

CREATE TABLE Establecimiento (
	id_establecimiento int NOT NULL auto_increment,
	direccion varchar(255),
	telefono varchar(15),
	tipo_establecimiento varchar(15),
	id_inventario int,
	PRIMARY KEY (id_establecimiento),
	FOREIGN KEY (id_inventario) REFERENCES Inventario(id_inventario)
);

CREATE TABLE Empleado (
	cedula varchar(10) NOT NULL,
	nombre varchar(255),
	fecha_nacimiento varchar(8),
	correo varchar(255),
	rol varchar(15),
	id_establecimiento int,
	PRIMARY KEY (cedula),
	FOREIGN KEY (id_establecimiento) REFERENCES Establecimiento(id_establecimiento)
);

CREATE TABLE Usuario (
	id_usuario int NOT NULL auto_increment,
	cedula varchar(10),
	usuario varchar(255),
	clave varchar(255),
	PRIMARY KEY (id_usuario),
	FOREIGN KEY (cedula) REFERENCES Empleado(cedula)
);

CREATE TABLE Compra_por_mayor (
	id_compra_mayor int NOT NULL auto_increment,
	fecha_compra varchar(8),
	hora_compra varchar(6),
	total float,
	detalles varchar(255),
	PRIMARY KEY (id_compra_mayor)
);

CREATE TABLE Recibido_por_mayor (
	id_recibido int NOT NULL auto_increment,
	id_compra_mayor int,
	id_establecimiento int,
	fecha_recibido varchar(8),
	hora_recibido varchar(6),
	PRIMARY KEY (id_recibido),
	FOREIGN KEY (id_compra_mayor) REFERENCES Compra_por_mayor(id_compra_mayor)
);

CREATE TABLE Detalle_Recibido (
	id_detalle int NOT NULL auto_increment,
	id_articulo int,
	cantidad int,
	PRIMARY KEY (id_detalle),
	FOREIGN KEY (id_articulo) REFERENCES Articulo(id_articulo)
);

CREATE TABLE Cliente (
	cedula varchar(10) NOT NULL,
	nombre varchar(255),
	direccion varchar(255),
	telefono varchar(15),
	PRIMARY KEY (cedula)
);

CREATE TABLE Transaccion (
	id_transaccion int NOT NULL auto_increment,
	id_cliente varchar(10),
	id_establecimiento int,
	fecha_creacion varchar(8),
	hora_creacion varchar(6),
	tipo varchar(15),
	subtotal float,
	total float,
	PRIMARY KEY (id_transaccion),
	FOREIGN KEY (id_cliente) REFERENCES Cliente(cedula),
	FOREIGN KEY (id_establecimiento) REFERENCES Establecimiento(id_establecimiento)
);

CREATE TABLE Detalle_Transaccion (
	id_detalle int NOT NULL auto_increment,
	id_transaccion int,
	id_articulo int,
	cantidad int,
	PRIMARY KEY (id_detalle),
	FOREIGN KEY (id_transaccion) REFERENCES Transaccion(id_transaccion),
	FOREIGN KEY (id_articulo) REFERENCES Articulo(id_articulo)
);

CREATE TABLE Abastecimiento (
	id_abastecimiento int NOT NULL auto_increment,
	id_repartidor varchar(10),
	fecha_envio varchar(8),
	hora_envio varchar(6),
	fecha_recibido varchar(8),
	hora_recibido varchar(6),
	id_bodega int,
	id_local int,
	PRIMARY KEY (id_abastecimiento),
	FOREIGN KEY (id_bodega) REFERENCES Establecimiento(id_establecimiento),
	FOREIGN KEY (id_local) REFERENCES Establecimiento(id_establecimiento),
	FOREIGN KEY (id_repartidor) REFERENCES Empleado(cedula)
);

CREATE TABLE Detalle_Abastecimiento (
	id_detalle int NOT NULL auto_increment,
	id_abastecimiento int,
	id_articulo int,
	cantidad int,
	PRIMARY KEY (id_detalle),
	FOREIGN KEY (id_abastecimiento) REFERENCES Abastecimiento(id_abastecimiento)
);

CREATE TABLE Entrega (
	id_entrega int NOT NULL auto_increment,
	id_repartidor varchar(10),
	fecha_entrega varchar(8),
	detalle_ruta varchar(255),
	PRIMARY KEY (id_entrega),
	FOREIGN KEY (id_repartidor) REFERENCES Empleado(cedula)
);

CREATE TABLE Detalle_Entrega (
	id_detalle int NOT NULL auto_increment,
	id_entrega int,
	id_transaccion int,
	hora_entrega varchar(6),
	fueExitosa int,
	detalle varchar(255),
	PRIMARY KEY (id_detalle),
	FOREIGN KEY (id_entrega) REFERENCES Entrega(id_entrega),
	FOREIGN KEY (id_transaccion) REFERENCES Transaccion(id_transaccion)
);
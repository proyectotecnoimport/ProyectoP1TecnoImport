USE DBTECNOIMPORT;

ALTER TABLE Establecimiento DROP CONSTRAINT FK__Estableci__id_in__09DE7BCC
ALTER TABLE Establecimiento DROP COLUMN id_inventario

ALTER TABLE Inventario ADD id_establecimiento int,
	FOREIGN KEY(id_establecimiento) REFERENCES Establecimiento(id_establecimiento)
	
ALTER TABLE Usuario ADD esAdmin int
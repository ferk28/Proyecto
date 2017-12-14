DROP DATABASE IF EXISTS lucylu;
CREATE DATABASE lucylu;
USE lucylu;

CREATE TABLE clientes(
id_cliente		int auto_increment		not null,
nombre			varchar(50)				not null,
genero			varchar(1)				not null,	
telefono		varchar(10)				not null,
telefono2		varchar(10)				null,
PRIMARY KEY(id_cliente));

INSERT INTO clientes 	(id_cliente, nombre, genero, telefono, telefono2)
VALUES					('0','Israel Pérez Pineda','M','0447652424','0446223584');

CREATE TABLE empleados(
id_empleado		int auto_increment		not null,
nombre			varchar(50)				not null,
edad			char(2)					null,
genero			varchar(1)				not null,
clavelector		varchar(18)				not null,
telefono		varchar(10)				not null,
telefono2		varchar(10)				null,
identificacion	varchar(2)				null,
PRIMARY KEY(id_empleado));

INSERT INTO empleados 	(id_empleado, nombre, edad, genero, clavelector, telefono, telefono2)
VALUES
						('0','Lucia Pineda Navarro','50','F','7645JSDGFAS6457456','7757546828','7752156066');

CREATE TABLE inventario(
id_articulo		int auto_increment		not null,
nombre			varchar(25)				not null,
cantidad		int						not null,
estado			varchar(7)				not null,
imagen			longblob,
PRIMARY KEY(id_articulo));

INSERT INTO inventario	(id_articulo, nombre, cantidad, estado)
VALUES					('0','tijeras entresacar','4','bueno'),
						('0','maquina afeitar','2','regular');

CREATE TABLE egtipo(
id_egtipo		int auto_increment		not null,
tipo			varchar(25)				not null,
PRIMARY KEY(id_egtipo));

INSERT INTO egtipo		(id_egtipo,tipo)
VALUES					('0','recibo de luz'),
						('0','pago empleado');

CREATE TABLE reservaciones(
id_reservacion	int auto_increment		not null,
hora			time					not null,
fecha			date					not null,
id_cliente		int						not null,
PRIMARY KEY(id_reservacion),				
FOREIGN KEY(id_cliente)		REFERENCES clientes(id_cliente));
/*tipo de trabajo*/
INSERT INTO reservaciones 	(id_reservacion, hora, fecha, id_cliente)
VALUES						('0','13:22:00','2017-11-13','1');

CREATE TABLE DetalleTrabajo(
id_trabajo 		int auto_increment 		not null,
trabajo			varchar(25)				not null,
imagen			longblob,
PRIMARY KEY(id_trabajo));


CREATE TABLE Usuarios(
    Usuario         varchar(20)      NOT NULL   PRIMARY KEY,
    Contrasena      varchar(32)      NOT NULL,
    Rol             char(2)          NOT NULL
);

INSERT INTO Usuarios(Usuario, Contrasena, Rol)
VALUES
('admin', MD5('12345'), '00'),
('empleado',     MD5('12345'), '01');
    
/********************references*****************/

CREATE TABLE egresos( /*tipo egreso tabla*/
id_egreso		int auto_increment		not null,
monto			int						not null,
cantidad		int						not null,
fecha			date					not null,
id_egtipo		int						not null,
PRIMARY KEY(id_egreso),
FOREIGN KEY(id_egtipo)		REFERENCES egtipo(id_egtipo));

INSERT INTO egresos			(id_egreso, monto, cantidad, fecha, id_egtipo)
VALUES						('0','400','1','2017-11-09','1');

CREATE TABLE servicios(
id_servicio		int auto_increment		not null,
costo			int						not null,
tipcorte		varchar(11)				not null,
fecha			date					not null,
id_cliente		int						null,
id_empleado		int						not null,
imagen			longblob,
PRIMARY KEY(id_servicio),
FOREIGN KEY(id_cliente)		REFERENCES clientes(id_cliente),
FOREIGN KEY(id_empleado)	REFERENCES empleados(id_empleado));
/*detalle de servicios detalle de venta*/
INSERT INTO servicios			(id_servicio, costo, tipcorte, fecha, id_cliente, id_empleado) 
VALUES							('0','40','Dama','2017-09-08','1','1');


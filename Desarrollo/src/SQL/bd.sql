DROP SEQUENCE IF EXISTS identificador CASCADE;
DROP TABLE IF EXISTS sedes;
DROP TABLE IF EXISTS usuarios;
DROP TABLE IF EXISTS pqr;

CREATE TABLE sedes (
	nombre VARCHAR(40),
	ciudad VARCHAR(40),
	direccion VARCHAR(40),
	telefono VARCHAR(7),
	PRIMARY KEY (nombre)
);

CREATE TABLE usuarios (
	cedula INTEGER NOT NULL,
	usuario VARCHAR(20) NOT NULL,
	contrasena VARCHAR(20) NOT NULL,
	nombre VARCHAR(30) NOT NULL,
	apellidos VARCHAR(40) NOT NULL,
	rol VARCHAR (30) NOT NULL,
	direccion VARCHAR(50),
	telefono VARCHAR(10),
	email VARCHAR(30),
	PRIMARY KEY (cedula)
);

CREATE SEQUENCE identificador
START 100
increment by 1;

CREATE TABLE pqr (
        id_pqr INTEGER  DEFAULT nextval('identificador') NOT NULL,
        tipo_pqr VARCHAR(25) NOT NULL,
        detalle VARCHAR(200) NOT NULL,
        nombre VARCHAR(50) NOT NULL,
        apellido VARCHAR(100) NOT NULL,
        cedula VARCHAR(15) NOT NULL,
        direccion VARCHAR(50) NOT NULL,
        telefono VARCHAR(10) NOT NULL,
        email VARCHAR(50) NOT NULL,
        sede VARCHAR(50) NOT NULL,
        estado VARCHAR(30) NOT NULL,
        respuesta VARCHAR(200),
        fecha,
        PRIMARY KEY(id_pqr)
);
CREATE SEQUENCE iden
START 1001
increment by 1;
CREATE TABLE envio (
	id_envio INTEGER DEFAULT nextval('iden') NOT NULL,
        nombre VARCHAR(50) NOT NULL,
        cedula VARCHAR(25) NOT NULL,
        direccion VARCHAR(100) NOT NULL,
        telefono VARCHAR(10) NOT NULL,
        nombre2 VARCHAR(50) NOT NULL,
        cedula2 VARCHAR(25) NOT NULL,
        direccion2 VARCHAR(100) NOT NULL,
        telefono2 VARCHAR(10) NOT NULL,
        sede VARCHAR(25) NOT NULL,
        tipo VARCHAR(25) NOT NULL,
        observacion VARCHAR(25) NOT NULL,
        peso INTEGER NOT NULL,
        declaracion_precio INTEGER NOT NULL,
        precio_neto INTEGER NOT NULL,
        precio_seguro INTEGER NOT NULL,
        precio_impuesto INTEGER NOT NULL,
        precio_total INTEGER NOT NULL,
        forma_pago VARCHAR(50) NOT NULL,
        fecha DATE,
        PRIMARY KEY(id_envio)


);

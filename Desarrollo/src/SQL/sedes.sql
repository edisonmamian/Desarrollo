DROP TABLE IF EXISTS sedes;
DROP TABLE IF EXISTS usuarios;


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
	rol VARCHAR (20) NOT NULL,
	direccion VARCHAR(50),
	telefono VARCHAR(10),
	email VARCHAR(30),
	PRIMARY KEY (cedula)
);



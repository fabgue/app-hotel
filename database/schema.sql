-- DROP TABLE hotel;
CREATE TABLE hotel (
	id BIGINT NOT NULL,
	nombre VARCHAR(100) NOT NULL,
	direccion VARCHAR(100) NOT NULL,
	telefono VARCHAR(100) NOT NULL,
	descripcion VARCHAR(100),
	localidad VARCHAR(30),
	hotel_categoria VARCHAR(30)
);

-- DROP TABLE habitacion;
CREATE TABLE habitacion (
	id BIGINT NOT NULL,
	id_hotel BIGINT NOT NULL,
	numero VARCHAR(10) NOT NULL,
	num_piso INTEGER NOT NULL,
	habitacion_tipo VARCHAR(30),
	num_personas INTEGER
);

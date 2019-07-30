
DROP TABLE HABITACION;
DROP TABLE HOTEL;
DROP TABLE HABITACION_TIPO;
DROP TABLE HOTEL_CATEGORIA;
DROP TABLE LOCALIDAD;
DROP TABLE REGION;


CREATE TABLE HABITACION_TIPO (
    ID BIGSERIAL NOT NULL,
    NOMBRE VARCHAR(100) NOT NULL,
    NUM_PERSONAS INTEGER NOT NULL
);
ALTER TABLE HABITACION_TIPO ADD CONSTRAINT HABITACION_TIPO_PK PRIMARY KEY (ID);


CREATE TABLE HOTEL_CATEGORIA (
    ID BIGSERIAL NOT NULL,
    NOMBRE VARCHAR(100) NOT NULL
);
ALTER TABLE HOTEL_CATEGORIA ADD CONSTRAINT HOTEL_CATEGORIA_PK PRIMARY KEY (ID);


CREATE TABLE REGION (
    ID BIGSERIAL NOT NULL,
    NOMBRE VARCHAR(100) NOT NULL,
    TIPO VARCHAR(20) NOT NULL,
    ID_REGION_PADRE BIGINT
);
ALTER TABLE REGION ADD CONSTRAINT REGION_PK PRIMARY KEY (ID);


CREATE TABLE LOCALIDAD (
    ID BIGSERIAL NOT NULL,
    ID_REGION_CIUDAD BIGINT NOT NULL,
    ID_REGION_DEPTO BIGINT NOT NULL,
    ID_REGION_PAIS BIGINT NOT NULL
);
ALTER TABLE LOCALIDAD ADD CONSTRAINT LOCALIDAD_PK PRIMARY KEY (ID);

CREATE TABLE HOTEL (
	ID BIGSERIAL NOT NULL,
	NOMBRE VARCHAR(100) NOT NULL,
	DIRECCION VARCHAR(100) NOT NULL,
	TELEFONO VARCHAR(100) NOT NULL,
	DESCRIPCION VARCHAR(100),
	ID_LOCALIDAD BIGINT NOT NULL,
	ID_HOTEL_CATEGORIA BIGINT NOT NULL
);
ALTER TABLE HOTEL ADD CONSTRAINT HOTEL_PK PRIMARY KEY (ID);


CREATE TABLE HABITACION (
	ID BIGSERIAL NOT NULL,	
	NUMERO VARCHAR(10) NOT NULL,
	PISO INTEGER NOT NULL,
	ID_HOTEL BIGINT NOT NULL,
    ID_HABITACION_TIPO BIGINT NOT NULL
);
ALTER TABLE HABITACION ADD CONSTRAINT HABITACION_PK PRIMARY KEY (ID);

ALTER SEQUENCE HABITACION_TIPO_ID_SEQ RESTART WITH 1000;
ALTER SEQUENCE HOTEL_CATEGORIA_ID_SEQ RESTART WITH 1000;
ALTER SEQUENCE REGION_ID_SEQ RESTART WITH 1000;
ALTER SEQUENCE LOCALIDAD_ID_SEQ RESTART WITH 1000;
ALTER SEQUENCE HOTEL_ID_SEQ RESTART WITH 1000;
ALTER SEQUENCE HABITACION_ID_SEQ RESTART WITH 1000;

-- FOREIGN KEYS
ALTER TABLE REGION ADD CONSTRAINT REGION_FK_REGION_PADRE FOREIGN KEY (ID_REGION_PADRE) REFERENCES REGION (ID);
ALTER TABLE LOCALIDAD ADD CONSTRAINT LOCALIDAD_FK_REGION_CIUDAD FOREIGN KEY (ID_REGION_CIUDAD) REFERENCES REGION (ID);
ALTER TABLE LOCALIDAD ADD CONSTRAINT LOCALIDAD_FK_REGION_DEPTO FOREIGN KEY (ID_REGION_DEPTO) REFERENCES REGION (ID);
ALTER TABLE LOCALIDAD ADD CONSTRAINT LOCALIDAD_FK_REGION_PAIS FOREIGN KEY (ID_REGION_PAIS) REFERENCES REGION (ID);
ALTER TABLE HOTEL ADD CONSTRAINT HOTEL_FK_HOTEL_CATEGORIA FOREIGN KEY (ID_HOTEL_CATEGORIA) REFERENCES HOTEL_CATEGORIA (ID);
ALTER TABLE HOTEL ADD CONSTRAINT HOTEL_FK_LOCALIDAD FOREIGN KEY (ID_LOCALIDAD) REFERENCES LOCALIDAD (ID);
ALTER TABLE HABITACION ADD CONSTRAINT HABITACION_FK_HOTEL FOREIGN KEY (ID_HOTEL) REFERENCES HOTEL (ID);
ALTER TABLE HABITACION ADD CONSTRAINT HABITACION_FK_HABITACION_TIPO FOREIGN KEY (ID_HABITACION_TIPO) REFERENCES HABITACION_TIPO (ID);



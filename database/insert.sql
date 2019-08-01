

INSERT INTO habitacion_tipo(id, nombre, num_personas) VALUES(1, 'Sencilla', 1);
INSERT INTO habitacion_tipo(id, nombre, num_personas) VALUES(2, 'Doble', 2);
INSERT INTO habitacion_tipo(id, nombre, num_personas) VALUES(3, 'Multiple', 4);

INSERT INTO hotel_categoria (id, nombre) VALUES(1, '3 Estrellas');
INSERT INTO hotel_categoria (id, nombre) VALUES(2, '4 Estrellas');
INSERT INTO hotel_categoria (id, nombre) VALUES(2, '5 Estrellas');

INSERT INTO pais (nombre) VALUES(1, 'COLOMBIA');
INSERT INTO pais (nombre) VALUES(2, 'VENEZUELA');

INSERT INTO ciudad (nombre, id_pais) VALUES(1, 'BOGOTA', 1);
INSERT INTO ciudad (nombre, id_pais) VALUES(2, 'MEDELLIN', 1);
INSERT INTO ciudad (nombre, id_pais) VALUES(3, 'CARTAGENA', 1);
INSERT INTO ciudad (nombre, id_pais) VALUES(4, 'CARACAS', 2);
INSERT INTO ciudad (nombre, id_pais) VALUES(5, 'MARACAIBO', 2);

INSERT INTO hotel (nombre, direccion, telefono, descripcion, id_ciudad, id_hotel_categoria) VALUES('Bacata', 'Cra 1', '300', null, 1, 3);
INSERT INTO hotel (nombre, direccion, telefono, descripcion, id_ciudad, id_hotel_categoria) VALUES('Bacata', 'Cra 1', '300', null, 1, 3);
INSERT INTO hotel (nombre, direccion, telefono, descripcion, id_ciudad, id_hotel_categoria) VALUES('Bacata', 'Cra 1', '300', null, 1, 3);
INSERT INTO hotel (nombre, direccion, telefono, descripcion, id_ciudad, id_hotel_categoria) VALUES('Bacata', 'Cra 1', '300', null, 1, 3);
INSERT INTO hotel (nombre, direccion, telefono, descripcion, id_ciudad, id_hotel_categoria) VALUES('Bacata', 'Cra 1', '300', null, 1, 3);
INSERT INTO hotel (nombre, direccion, telefono, descripcion, id_ciudad, id_hotel_categoria) VALUES('Bacata', 'Cra 1', '300', null, 1, 3);
INSERT INTO hotel (nombre, direccion, telefono, descripcion, id_ciudad, id_hotel_categoria) VALUES('Bacata', 'Cra 1', '300', null, 1, 3);

INSERT INTO habitacion(numero, piso, id_hotel, id_habitacion_tipo) VALUES('', 0, 0, 0);














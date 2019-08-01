

INSERT INTO habitacion_tipo(id, nombre, num_personas) VALUES(1, 'Sencilla', 1);
INSERT INTO habitacion_tipo(id, nombre, num_personas) VALUES(2, 'Doble', 2);
INSERT INTO habitacion_tipo(id, nombre, num_personas) VALUES(3, 'Multiple', 4);

INSERT INTO hotel_categoria (id, nombre) VALUES(1, '3 Estrellas');
INSERT INTO hotel_categoria (id, nombre) VALUES(2, '4 Estrellas');
INSERT INTO hotel_categoria (id, nombre) VALUES(3, '5 Estrellas');

INSERT INTO pais (id, nombre) VALUES(1, 'COLOMBIA');
INSERT INTO pais (id, nombre) VALUES(2, 'VENEZUELA');

INSERT INTO ciudad (id, nombre, id_pais) VALUES(1, 'BOGOTA', 1);
INSERT INTO ciudad (id, nombre, id_pais) VALUES(2, 'MEDELLIN', 1);
INSERT INTO ciudad (id, nombre, id_pais) VALUES(3, 'CARTAGENA', 1);
INSERT INTO ciudad (id, nombre, id_pais) VALUES(4, 'CARACAS', 2);
INSERT INTO ciudad (id, nombre, id_pais) VALUES(5, 'MARACAIBO', 2);

INSERT INTO hotel (id, nombre, direccion, telefono, descripcion, id_ciudad, id_hotel_categoria) VALUES(1, 'Bacata', 'Cra 1', '100', null, 1, 3);
INSERT INTO hotel (id, nombre, direccion, telefono, descripcion, id_ciudad, id_hotel_categoria) VALUES(2, 'De Paso', 'Cra 1', '300', null, 1, 2);
INSERT INTO hotel (id, nombre, direccion, telefono, descripcion, id_ciudad, id_hotel_categoria) VALUES(3, 'Four Seasons', 'Cra 1', '300', null, 1, 3);
INSERT INTO hotel (id, nombre, direccion, telefono, descripcion, id_ciudad, id_hotel_categoria) VALUES(4, 'Dann Carlton', 'Cra 1', '300', null, 2, 3);
INSERT INTO hotel (id, nombre, direccion, telefono, descripcion, id_ciudad, id_hotel_categoria) VALUES(5, 'El Poblado', 'Cra 1', '300', null, 2, 3);
INSERT INTO hotel (id, nombre, direccion, telefono, descripcion, id_ciudad, id_hotel_categoria) VALUES(6, 'Costa del Sol', 'Cra 1', '300', null, 3, 3);
INSERT INTO hotel (id, nombre, direccion, telefono, descripcion, id_ciudad, id_hotel_categoria) VALUES(7, 'Selina Cartagena', 'Cra 1', '300', null, 3, 3);
INSERT INTO hotel (id, nombre, direccion, telefono, descripcion, id_ciudad, id_hotel_categoria) VALUES(7, 'GHL Corales', 'Cra 1', '300', null, 3, 3);
INSERT INTO hotel (id, nombre, direccion, telefono, descripcion, id_ciudad, id_hotel_categoria) VALUES(7, 'Bacata', 'Cra 1', '300', null, 3, 3);
INSERT INTO hotel (id, nombre, direccion, telefono, descripcion, id_ciudad, id_hotel_categoria) VALUES(7, 'Bacata', 'Cra 1', '300', null, 3, 3);
INSERT INTO hotel (id, nombre, direccion, telefono, descripcion, id_ciudad, id_hotel_categoria) VALUES(7, 'Bacata', 'Cra 1', '300', null, 3, 3);

INSERT INTO habitacion(id, numero, piso, id_hotel, id_habitacion_tipo) VALUES(1, '', 0, 0, 0);














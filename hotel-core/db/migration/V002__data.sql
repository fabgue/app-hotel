

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
INSERT INTO hotel (id, nombre, direccion, telefono, descripcion, id_ciudad, id_hotel_categoria) VALUES(6, 'Costa del Sol', 'Cra 1', '300', null, 3, 1);
INSERT INTO hotel (id, nombre, direccion, telefono, descripcion, id_ciudad, id_hotel_categoria) VALUES(7, 'Selina Cartagena', 'Cra 1', '300', null, 3, 3);
INSERT INTO hotel (id, nombre, direccion, telefono, descripcion, id_ciudad, id_hotel_categoria) VALUES(8, 'GHL Corales', 'Cra 1', '300', null, 3, 2);
INSERT INTO hotel (id, nombre, direccion, telefono, descripcion, id_ciudad, id_hotel_categoria) VALUES(9, 'Cartagena Real', 'Cra 1', '300', null, 3, 3);
INSERT INTO hotel (id, nombre, direccion, telefono, descripcion, id_ciudad, id_hotel_categoria) VALUES(10, 'Caracas Plaza', 'Cra 1', '300', null, 4, 1);
INSERT INTO hotel (id, nombre, direccion, telefono, descripcion, id_ciudad, id_hotel_categoria) VALUES(11, 'Maracaibo Street', 'Cra 1', '300', null, 5, 1);

INSERT INTO habitacion(id, numero, piso, id_hotel, id_habitacion_tipo) VALUES(1, '101', 1, 1, 1);
INSERT INTO habitacion(id, numero, piso, id_hotel, id_habitacion_tipo) VALUES(2, '102d', 1, 1, 2);
INSERT INTO habitacion(id, numero, piso, id_hotel, id_habitacion_tipo) VALUES(3, '103', 1, 1, 3);
INSERT INTO habitacion(id, numero, piso, id_hotel, id_habitacion_tipo) VALUES(4, '201', 2, 1, 1);
INSERT INTO habitacion(id, numero, piso, id_hotel, id_habitacion_tipo) VALUES(5, '202d', 2, 1, 2);
INSERT INTO habitacion(id, numero, piso, id_hotel, id_habitacion_tipo) VALUES(6, '203', 2, 1, 3);
INSERT INTO habitacion(id, numero, piso, id_hotel, id_habitacion_tipo) VALUES(7, '301', 3, 1, 1);
INSERT INTO habitacion(id, numero, piso, id_hotel, id_habitacion_tipo) VALUES(8, '302d', 3, 1, 2);
INSERT INTO habitacion(id, numero, piso, id_hotel, id_habitacion_tipo) VALUES(9, '303', 3, 1, 3);

INSERT INTO habitacion(id, numero, piso, id_hotel, id_habitacion_tipo) VALUES(11, '101', 1, 2, 1);
INSERT INTO habitacion(id, numero, piso, id_hotel, id_habitacion_tipo) VALUES(12, '102', 1, 2, 2);
INSERT INTO habitacion(id, numero, piso, id_hotel, id_habitacion_tipo) VALUES(14, '201', 2, 2, 1);
INSERT INTO habitacion(id, numero, piso, id_hotel, id_habitacion_tipo) VALUES(15, '202', 2, 2, 2);

INSERT INTO habitacion(id, numero, piso, id_hotel, id_habitacion_tipo) VALUES(21, '101', 1, 3, 2);
INSERT INTO habitacion(id, numero, piso, id_hotel, id_habitacion_tipo) VALUES(22, '102', 1, 3, 2);
INSERT INTO habitacion(id, numero, piso, id_hotel, id_habitacion_tipo) VALUES(23, '103', 1, 3, 2);
INSERT INTO habitacion(id, numero, piso, id_hotel, id_habitacion_tipo) VALUES(24, '201', 2, 3, 2);
INSERT INTO habitacion(id, numero, piso, id_hotel, id_habitacion_tipo) VALUES(25, '202', 2, 3, 2);
INSERT INTO habitacion(id, numero, piso, id_hotel, id_habitacion_tipo) VALUES(26, '203', 2, 3, 2);
INSERT INTO habitacion(id, numero, piso, id_hotel, id_habitacion_tipo) VALUES(27, '301', 3, 3, 2);
INSERT INTO habitacion(id, numero, piso, id_hotel, id_habitacion_tipo) VALUES(28, '302', 3, 3, 2);
INSERT INTO habitacion(id, numero, piso, id_hotel, id_habitacion_tipo) VALUES(29, '303', 3, 3, 2);


INSERT INTO demo (id, obid, nombre, id_ciudad) VALUES(1, public.uuid_generate_v1(), 'Hotel Demo', 1);
INSERT INTO demo (id, obid, nombre, id_ciudad) SELECT id+1, public.uuid_generate_v1(), nombre, id_ciudad FROM hotel;












INSERT INTO habitacion_tipo(id, nombre, num_personas) VALUES(1, 'Sencilla', 1);
INSERT INTO habitacion_tipo(id, nombre, num_personas) VALUES(2, 'Doble', 2);
INSERT INTO habitacion_tipo(id, nombre, num_personas) VALUES(3, 'Multiple', 4);

INSERT INTO hotel_categoria (id, nombre) VALUES(1, '3 Estrellas');
INSERT INTO hotel_categoria (id, nombre) VALUES(2, '4 Estrellas');
INSERT INTO hotel_categoria (id, nombre) VALUES(2, '5 Estrellas');


INSERT INTO region (id, nombre, tipo, id_region_padre) VALUES(1, 'COLOMBIA', 'PAIS', null);
INSERT INTO region (id, nombre, tipo, id_region_padre) VALUES(2, 'PANAMA', 'PAIS', null);
INSERT INTO region (id, nombre, tipo, id_region_padre) VALUES(3, 'ANTIOQUIA', 'DEPARTAMENTO', 1);
INSERT INTO region (id, nombre, tipo, id_region_padre) VALUES(3, 'BOGOTA', 'DEPARTAMENTO', 1);
INSERT INTO region (id, nombre, tipo, id_region_padre) VALUES(3, 'ANTIOQUIA', 'DEPARTAMENTO', 1);
INSERT INTO region (id, nombre, tipo, id_region_padre) VALUES(3, 'BOGOTA', 'DEPARTAMENTO', 1);


INSERT INTO habitacion(numero, piso, id_hotel, id_habitacion_tipo) VALUES('', 0, 0, 0);




INSERT INTO hotel (nombre, direccion, telefono, descripcion, id_localidad, id_hotel_categoria) VALUES('', '', '', '', 0, 0);




INSERT INTO localidad (id_region_ciudad, id_region_depto, id_region_pais) VALUES(0, 0, 0);




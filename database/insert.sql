

INSERT INTO public.habitacion
(id, id_habitacion_tipo, id_hotel, numero, piso)
VALUES(0, 0, 0, '', 0);

INSERT INTO public.habitacion_tipo
(id, nombre, num_personas)
VALUES(0, '', 0);

INSERT INTO public.hotel
(id, descripcion, direccion, id_hotel_categoria, id_localidad, nombre, telefono)
VALUES(0, '', '', 0, 0, '', '');

INSERT INTO public.hotel_categoria
(id, nombre)
VALUES(0, '');

INSERT INTO public.localidad
(id, id_region_ciudad, id_region_depto, id_region_pais)
VALUES(0, 0, 0, 0);

INSERT INTO public.region
(id, id_region_padre, nombre)
VALUES(0, 0, '');


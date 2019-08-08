create table ciudad (id  bigserial not null, id_pais int8 not null, nombre varchar(255) not null, primary key (id))
create table form (id uuid not null, nombre varchar(255) not null, primary key (id))
create table habitacion (id  bigserial not null, id_habitacion_tipo int8 not null, id_hotel int8 not null, numero varchar(255) not null, piso int4 not null, primary key (id))
create table habitacion_tipo (id  bigserial not null, nombre varchar(255) not null, num_personas int4 not null, primary key (id))
create table hotel (id  bigserial not null, descripcion varchar(255), direccion varchar(255) not null, id_ciudad int8 not null, id_hotel_categoria int8 not null, nombre varchar(255) not null, telefono varchar(255) not null, primary key (id))
create table hotel_categoria (id  bigserial not null, nombre varchar(255) not null, primary key (id))
create table pais (id  bigserial not null, nombre varchar(255) not null, primary key (id))
alter table habitacion add constraint FKeag8u83lrrtq9aujngntytohf foreign key (id_habitacion_tipo) references habitacion_tipo

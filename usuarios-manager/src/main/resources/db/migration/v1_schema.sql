
create table usuario (
	id bigserial not null,
	login varchar(30) not null,
	email varchar(256) not null,
	nombre varchar(100) not null,
	clave varchar(200) not null
);

create table rol (
	id bigserial not null,
	nombre varchar(100) not null
);


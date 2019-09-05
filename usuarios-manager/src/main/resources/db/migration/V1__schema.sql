
create table usuario (
	id bigserial not null,
	login varchar(30) not null,
	email varchar(256) not null,
	nombre varchar(100) not null,
	clave varchar(200) not null
);
alter table usuario add constraint usuario_pk primary key (id);

create table rol (
	id bigserial not null,
	nombre varchar(100) not null
);
alter table rol add constraint rol_pk primary key (id);

create table usuario_rol (
	-- id bigserial not null,
	id_usuario bigint not null,
	id_rol bigint not null
);
-- alter table usuario_rol add constraint usuario_rol_pk primary key (id);

-- foreign keys
alter table usuario_rol add constraint usuario_rol_fk_usuario foreign key (id_usuario) references usuario (id);
alter table usuario_rol add constraint usuario_rol_fk_rol foreign key (id_rol) references rol (id);


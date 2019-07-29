--
-- PostgreSQL database dump
--

-- Dumped from database version 11.4 (Debian 11.4-1.pgdg90+1)
-- Dumped by pg_dump version 11.4 (Debian 11.4-1.pgdg90+1)

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- Name: habitacion; Type: TABLE; Schema: public; Owner: aphuser
--

CREATE TABLE public.habitacion (
    id bigint NOT NULL,
    id_habitacion_tipo bigint,
    id_hotel bigint NOT NULL,
    numero character varying(255) NOT NULL,
    piso integer NOT NULL
);


ALTER TABLE public.habitacion OWNER TO aphuser;

--
-- Name: habitacion_tipo; Type: TABLE; Schema: public; Owner: aphuser
--

CREATE TABLE public.habitacion_tipo (
    id bigint NOT NULL,
    nombre character varying(255) NOT NULL,
    num_personas integer
);


ALTER TABLE public.habitacion_tipo OWNER TO aphuser;

--
-- Name: hibernate_sequence; Type: SEQUENCE; Schema: public; Owner: aphuser
--

CREATE SEQUENCE public.hibernate_sequence
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.hibernate_sequence OWNER TO aphuser;

--
-- Name: hotel; Type: TABLE; Schema: public; Owner: aphuser
--

CREATE TABLE public.hotel (
    id bigint NOT NULL,
    descripcion character varying(255),
    direccion character varying(255),
    id_hotel_categoria bigint,
    id_localidad bigint,
    nombre character varying(255) NOT NULL,
    telefono character varying(255)
);


ALTER TABLE public.hotel OWNER TO aphuser;

--
-- Name: hotel_categoria; Type: TABLE; Schema: public; Owner: aphuser
--

CREATE TABLE public.hotel_categoria (
    id bigint NOT NULL,
    nombre character varying(255) NOT NULL
);


ALTER TABLE public.hotel_categoria OWNER TO aphuser;

--
-- Name: localidad; Type: TABLE; Schema: public; Owner: aphuser
--

CREATE TABLE public.localidad (
    id bigint NOT NULL,
    id_region_ciudad bigint,
    id_region_depto bigint,
    id_region_pais bigint
);


ALTER TABLE public.localidad OWNER TO aphuser;

--
-- Name: region; Type: TABLE; Schema: public; Owner: aphuser
--

CREATE TABLE public.region (
    id bigint NOT NULL,
    id_region_padre bigint,
    nombre character varying(255) NOT NULL
);


ALTER TABLE public.region OWNER TO aphuser;

--
-- Data for Name: habitacion; Type: TABLE DATA; Schema: public; Owner: aphuser
--

COPY public.habitacion (id, id_habitacion_tipo, id_hotel, numero, piso) FROM stdin;
3	\N	1	101	1
4	\N	1	201	2
5	\N	2	1001	1
6	\N	2	2001	2
\.


--
-- Data for Name: habitacion_tipo; Type: TABLE DATA; Schema: public; Owner: aphuser
--

COPY public.habitacion_tipo (id, nombre, num_personas) FROM stdin;
\.


--
-- Data for Name: hotel; Type: TABLE DATA; Schema: public; Owner: aphuser
--

COPY public.hotel (id, descripcion, direccion, id_hotel_categoria, id_localidad, nombre, telefono) FROM stdin;
1	\N	\N	\N	\N	Hotel Ritz	\N
2	\N	\N	\N	\N	Hotel Hilton	\N
\.


--
-- Data for Name: hotel_categoria; Type: TABLE DATA; Schema: public; Owner: aphuser
--

COPY public.hotel_categoria (id, nombre) FROM stdin;
\.


--
-- Data for Name: localidad; Type: TABLE DATA; Schema: public; Owner: aphuser
--

COPY public.localidad (id, id_region_ciudad, id_region_depto, id_region_pais) FROM stdin;
\.


--
-- Data for Name: region; Type: TABLE DATA; Schema: public; Owner: aphuser
--

COPY public.region (id, id_region_padre, nombre) FROM stdin;
\.


--
-- Name: hibernate_sequence; Type: SEQUENCE SET; Schema: public; Owner: aphuser
--

SELECT pg_catalog.setval('public.hibernate_sequence', 6, true);


--
-- Name: habitacion habitacion_pkey; Type: CONSTRAINT; Schema: public; Owner: aphuser
--

ALTER TABLE ONLY public.habitacion
    ADD CONSTRAINT habitacion_pkey PRIMARY KEY (id);


--
-- Name: habitacion_tipo habitacion_tipo_pkey; Type: CONSTRAINT; Schema: public; Owner: aphuser
--

ALTER TABLE ONLY public.habitacion_tipo
    ADD CONSTRAINT habitacion_tipo_pkey PRIMARY KEY (id);


--
-- Name: hotel_categoria hotel_categoria_pkey; Type: CONSTRAINT; Schema: public; Owner: aphuser
--

ALTER TABLE ONLY public.hotel_categoria
    ADD CONSTRAINT hotel_categoria_pkey PRIMARY KEY (id);


--
-- Name: hotel hotel_pkey; Type: CONSTRAINT; Schema: public; Owner: aphuser
--

ALTER TABLE ONLY public.hotel
    ADD CONSTRAINT hotel_pkey PRIMARY KEY (id);


--
-- Name: localidad localidad_pkey; Type: CONSTRAINT; Schema: public; Owner: aphuser
--

ALTER TABLE ONLY public.localidad
    ADD CONSTRAINT localidad_pkey PRIMARY KEY (id);


--
-- Name: region region_pkey; Type: CONSTRAINT; Schema: public; Owner: aphuser
--

ALTER TABLE ONLY public.region
    ADD CONSTRAINT region_pkey PRIMARY KEY (id);


--
-- PostgreSQL database dump complete
--


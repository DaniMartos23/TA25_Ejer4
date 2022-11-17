
DROP table IF EXISTS peliculas;

create table peliculas(
	codigo int auto_increment,
	nombre varchar(100),
	calificacionedad int,
	primary key (codigo)
);

DROP table IF EXISTS salas;

create table salas(
	codigo int auto_increment,
	nombre varchar(100),
	pelicula int,
	primary key (codigo),
	foreign key(pelicula) references peliculas(codigo) 
);

insert into peliculas (nombre,calificacionedad)values('Jumanji',13);
insert into peliculas (nombre,calificacionedad)values('It',18);
insert into peliculas (nombre,calificacionedad)values('Mortadelo y Filemon',0);



insert into salas (nombre, pelicula)values('Sala1',3);
insert into salas (nombre, pelicula)values('Sala2',2);
insert into salas (nombre, pelicula)values('Sala3',1);

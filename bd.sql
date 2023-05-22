DROP DATABASE CL2_RodriguezGerardo;
CREATE DATABASE CL2_RodriguezGerardo;
USE CL2_RodriguezGerardo;

create table tema(
	idtema int not null primary key auto_increment,
    nombre varchar(45)
);

create table libros(
	idlibro int not null primary key auto_increment,
    titulo varchar(45),
    precio double,
    cant_ejemplares int,
    origen varchar(45),
    idtema int,
    foreign key (idtema) references tema(idtema));
    
INSERT INTO tema values (null, 'Informatica'), (null, 'Diseño'), (null, 'Redes'), (null, 'Tecnologia');

INSERT INTO libros values (null, 'Networking', 125.70, 5, 'Propio', 4),
							(null, 'Java', 85.00, 6, 'Donacion', 1),
							(null, 'Illustrator', 165.99, 4, 'Donacion', 2),
                            (null, 'Phyton', 120.00, 15, 'Propio', 1);
                            
select * from libros;

DELIMITER $$
CREATE PROCEDURE sp_getLibros()
BEGIN
	SELECT l.idlibro, l.titulo, l.precio, l.cant_ejemplares, l.origen, t.nombre
    FROM Libros l JOIN Tema t ON l.idtema = t.idtema;
END
$$

call sp_getLibros()
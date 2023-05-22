CREATE DATABASE DAWI_CL2_RodriguezGerardo;
USE DAWI_CL2_RodriguezGerardo;

create table tema(
	idtema int not null primary key auto_increment,
    nombre varchar(45)
);

create table libros(
	idlibro int not null primary key auto_increment,
    titulo varchar(45),
    precio double,
    cantEjemplares int,
    origen varchar(45),
    idtema int,
    foreign key (idtema) references tema(idtema));
    

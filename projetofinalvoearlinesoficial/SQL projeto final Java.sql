create database lojapadrao default character set utf8;
use lojapadrao;

create table usuario(
	id int primary key auto_increment,
	login varchar(100) not null,
	senha varchar(100) not null
);

create table aeronave(
	id int primary key auto_increment,
	fabricante varchar(100) not null,
    modelo varchar(100) not null,
	codigo varchar(100) not null,
    tipo varchar (100) 
);

drop table aeronave;
Alter table
  aeronave
add
  constraint idTipo foreign key (TipoAeronave) references  (id);
  
select * from aeronave;

create table TipoAeronave(
	id int primary key auto_increment,
	descricao varchar(200) not null
);

select * from tipoAeronave;
describe aeronave;



drop table usuario;
select * from usuario;

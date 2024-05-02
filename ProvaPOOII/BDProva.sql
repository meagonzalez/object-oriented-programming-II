#drop database meubanco;
create database meubanco;
use meubanco;

create table cliente(
nome varchar(20),
cpf varchar(12),
telefone varchar(20),
endereco varchar(20),
cidade varchar(20)
);

select * from cliente;
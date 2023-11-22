drop schema crud;
create schema crud;

create table crud.PESSOA(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	CPF varchar(255),
	IDADE INTEGER,
	NOME varchar(255)
);

create table crud.TELEFONE(
	ID_TELEFONE INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	ID_PESSOA INT NOT NULL,
	TELEFONE varchar(255)
);

insert into crud.PESSOA(nome, idade, cpf) values('João', 30, '123.456.789-52');
insert into crud.PESSOA(nome, idade, cpf) values('Maria', 20, '111.222.333-44');

insert into crud.TELEFONE(id_pessoa, telefone) values(1, '(61)99875-4215');
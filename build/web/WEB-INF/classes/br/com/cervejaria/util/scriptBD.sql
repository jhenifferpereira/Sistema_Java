create data base cervejaria;

create table usuario(
    codigo serial primary key,
    nome varchar(100),
    telefone varchar(50),
    email varchar(100),
    login varchar(100),
    senha varchar(100)
);

create table Fornecedor(
    codigo serial primary key,
    cnpj varchar(100),
    razao_social varchar(100),
    telefone varchar(50),
    email varchar(100),
    endereco varchar(100),
    cidade varchar(100),
    estado varchar(100)
);

create table Categoria(
    codigo serial primary key,
    nome varchar(100),
    descricao varchar(200)
);





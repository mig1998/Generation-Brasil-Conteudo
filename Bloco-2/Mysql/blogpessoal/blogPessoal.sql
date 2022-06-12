create database blogPessoal;

use blogPessoal;


create table tb_usuarios(
id bigint primary key auto_increment,
nome varchar(50) not null,
usuario varchar(50) not null,
senha varchar(50) not null,
foto varchar(255)
);


create table tb_postagens(
id bigint primary key not null auto_increment,
titulo varchar(255) not null,
texto varchar(1000) not null,
date Date,
tema_id bigint,
usuario_id bigint,
foreign key(tema_id) references tb_tema(id),
foreign key(usuario_id) references tb_usuarios(id)
);


create table tb_tema(
id bigint primary key not null auto_increment,
descricao varchar(255)
);

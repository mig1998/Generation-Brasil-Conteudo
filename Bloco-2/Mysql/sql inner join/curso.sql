#-----------------------------curso---------------------------------

create database db_cursoDaMinhaVida;

use db_cursoDaMinhaVida;


create table tb_categoria(
idCategoria int primary key not null auto_increment,
nome varchar(50) not null,
tipo enum ('Online','Presencial') not null
);

create table tb_curso(
id_curso bigint primary key not null auto_increment,
nome varchar(50) not null,
duracao_Horas int not null,
preco double(5,2) not null,
id_categoria int, 
Foreign Key(id_categoria) references tb_categoria(idCategoria)
);

#--------------insert categoria---------------------
insert into tb_categoria values(null,'Desenvolvimento Web','Online');
insert into tb_categoria values(null,'Desenvolvimento Movel','Online');

insert into tb_categoria values(null,'Tecnologia de Redes','Presencial');

insert into tb_categoria values(null,'Manutenção','Presencial');
insert into tb_categoria values(null,'Desenvolvimento de software','Online');


#-----------------insert produto-----------------------
insert into tb_curso values(null,'Java',15,80.00,5);
insert into tb_curso values(null,'C#',12,69.00,5);
insert into tb_curso values(null,'Html,Css,js',10,56.00,1);
insert into tb_curso values(null,'Redes',6,26.00,3);

insert into tb_curso values(null,'React,Angular,Android',20,100.00,2);
insert into tb_curso values(null,'Teste de Software',10,76.00,5);
insert into tb_curso values(null,'Manutenção Computadores',4,34.00,4);
insert into tb_curso values(null,'Manutenção Celulares',17,76.00,4);

#-------------------------Select-------------------------
select * from tb_curso;

select nome,preco from tb_curso where preco>50;
select nome,preco from tb_curso where preco>3 and preco<60;

select * from tb_curso where nome like '%J%';

Select tb_categoria.nome, tb_categoria.tipo,
tb_curso.nome, tb_curso.duracao_Horas, tb_curso.preco
from tb_categoria
inner join tb_curso
on tb_categoria.idCategoria=tb_curso.id_categoria;


Select tb_categoria.nome,tb_categoria.tipo,tb_curso.nome,tb_curso.duracao_Horas, tb_curso.preco
from tb_categoria
inner join tb_curso
on idCategoria=id_categoria where tipo='Online';

create database db_pizzaria_legal;

use db_pizzaria_legal;


create table tb_categoria(
idCategoria int primary key not null auto_increment,
tipo varchar(50) not null,
modo enum ('lenha','gas')
);

create table tb_pizza(
id_pizza bigint primary key not null auto_increment,
nome varchar(50) not null,
borda enum('catupiry','cheddar'),
preco double(5,2) not null,
id_categoria int, 
Foreign Key(id_categoria) references tb_categoria(idCategoria)
);

#--------------insert categoria---------------------
insert into tb_categoria values(null,'Doce','gas');
insert into tb_categoria values(null,'Doce','lenha');
insert into tb_categoria values(null,'Salgada','lenha');
insert into tb_categoria values(null,'Salgada','gas');
insert into tb_categoria values(null,'Mista Doce','gas');
insert into tb_categoria values(null,'Mista Doce','lenha');


#-----------------insert produto-----------------------
insert into tb_pizza values(null,'Calabresa','catupiry',29.00,3);
insert into tb_pizza values(null,'Portuguesa','cheddar',29.00,4);
insert into tb_pizza values(null,'Bauru','cheddar',35.00,4);
insert into tb_pizza values(null,'Camarão','catupiry',55.00,3);
insert into tb_pizza values(null,'A moda da casa','catupiry',35.00,3);

insert into tb_pizza values(null,'Chocolate com M&M','catupiry',45.00,2);
insert into tb_pizza values(null,'Morango e Chocolate','catupiry',42.00,2);
insert into tb_pizza values(null,'Romeu e Julieta','cheddar',50.00,1);


#-------------------------Select-------------------------
select * from tb_pizza;

select nome,preco from tb_pizza where preco>45;
select nome,preco from tb_pizza where preco>29 and preco<60;

select * from tb_pizza where nome like '%C%';

Select tb_categoria.tipo, tb_categoria.modo,
tb_pizza.nome, tb_pizza.borda, tb_pizza.preco
from tb_categoria
inner join tb_pizza
on tb_categoria.idCategoria=tb_pizza.id_categoria;


Select tb_categoria.tipo,tb_pizza.nome, tb_pizza.borda, tb_pizza.preco
from tb_categoria
inner join tb_pizza
on idCategoria=id_categoria where tipo='doce';

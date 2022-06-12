#-----------------------------açogue---------------------------------

create database db_cidade_das_carnes;

use db_cidade_das_carnes;


create table tb_categoria(
idCategoria int primary key not null auto_increment,
carne_animal enum('boi','porco','galinha') not null,
tipo enum ('primeira','segunda') not null
);

create table tb_produto(
id_carne bigint primary key not null auto_increment,
nome varchar(50) not null,
cortado boolean not null,
preco double(5,2) not null,
id_categoria int, 
Foreign Key(id_categoria) references tb_categoria(idCategoria)
);

#--------------insert categoria---------------------
insert into tb_categoria values(null,'boi','primeira');
insert into tb_categoria values(null,'porco','segunda');
insert into tb_categoria values(null,'galinha','primeira');

insert into tb_categoria values(null,'boi','segunda');
insert into tb_categoria values(null,'porco','primeira');
insert into tb_categoria values(null,'galinha','segunda');

#-----------------insert produto-----------------------
insert into tb_produto values(null,'Coxão Mole',true,40.00,1);
insert into tb_produto values(null,'Picanha',false,56.00,1);
insert into tb_produto values(null,'Lombinho',true,43.00,5);
insert into tb_produto values(null,'Costela',false,30.00,2);

insert into tb_produto values(null,'Coxão Duro',true,40.00,4);
insert into tb_produto values(null,'Coxa',true,43.00,3);
insert into tb_produto values(null,'Pe de galinha',true,20.00,6);
insert into tb_produto values(null,'File Mignon Suino',true,55.00,5);

#-------------------------Select-------------------------
select * from tb_produto;

select nome,preco from tb_produto where preco>50;
select nome,preco from tb_produto where preco>3 and preco<60;

select * from tb_produto where nome like '%C%';

Select tb_categoria.carne_animal, tb_categoria.tipo,
tb_produto.nome, tb_produto.cortado, tb_produto.preco
from tb_categoria
inner join tb_produto
on tb_categoria.idCategoria=tb_produto.id_categoria;


Select tb_categoria.tipo,tb_categoria.carne_animal,tb_produto.nome, tb_produto.cortado, tb_produto.preco
from tb_categoria
inner join tb_produto
on idCategoria=id_categoria where tipo='primeira';

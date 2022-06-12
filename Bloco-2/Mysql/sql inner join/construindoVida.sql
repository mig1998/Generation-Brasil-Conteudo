#-----------------------------Ecommerce---------------------------------

create database db_construindo_a_nossa_vida;

use db_construindo_a_nossa_vida;


create table tb_categoria(
idCategoria int primary key not null auto_increment,
nome varchar(50) not null,
tipo enum ('Eletronico','Domestico') not null
);

create table tb_produto(
id_produto bigint primary key not null auto_increment,
nome varchar(50) not null,
marca varchar(50) not null,
preco double(5,2) not null,
id_categoria int, 
Foreign Key(id_categoria) references tb_categoria(idCategoria)
);

#--------------insert categoria---------------------
insert into tb_categoria values(null,'cozinha','Eletronico');
insert into tb_categoria values(null,'cozinha','Domestico');

insert into tb_categoria values(null,'sala','Eletronico');
insert into tb_categoria values(null,'sala','Domestico');

insert into tb_categoria values(null,'quarto','Eletronico');
insert into tb_categoria values(null,'quarto','Domestico');

#-----------------insert produto-----------------------
insert into tb_produto values(null,'Mesa','Woods',145.00,2);
insert into tb_produto values(null,'airFryer','Brastemp',205.00,1);
insert into tb_produto values(null,'controle remoto','sony',25.00,3);
insert into tb_produto values(null,'sofa','Woods',85.00,4);

insert into tb_produto values(null,'cama','Woodsy',335.00,6);
insert into tb_produto values(null,'roteador wifi','Woods',55.00,5);
insert into tb_produto values(null,'coberto','fofs',45.00,6);
insert into tb_produto values(null,'livro','saraiva',25.00,4);



#-------------------------Select-------------------------
select * from tb_produto;

select nome,preco from tb_produto where preco>50;
select nome,preco from tb_produto where preco>3 and preco<60;

select * from tb_produto where nome like '%C%';

Select tb_categoria.nome, tb_categoria.tipo,
tb_produto.nome, tb_produto.marca, tb_produto.preco
from tb_categoria
inner join tb_produto
on tb_categoria.idCategoria=tb_produto.id_categoria;


Select tb_categoria.nome,tb_categoria.tipo,tb_produto.nome,tb_produto.marca, tb_produto.preco
from tb_categoria
inner join tb_produto
on idCategoria=id_categoria where tipo='eletronico';

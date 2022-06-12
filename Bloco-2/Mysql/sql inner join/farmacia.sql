create database db_farmacia_do_bem;

use db_farmacia_do_bem;


create table tb_categoria(
idCategoria int primary key not null auto_increment,
modo enum('capsula','liquido') not null,
tipo enum ('marca','generico','similiar') not null
);

create table tb_produto(
id_remedio bigint primary key not null auto_increment,
nome varchar(50) not null,
receita enum('sim','não'),
preco double(5,2) not null,
id_categoria int, 
Foreign Key(id_categoria) references tb_categoria(idCategoria)
);

#--------------insert categoria---------------------
insert into tb_categoria values(null,'capsula','generico');
insert into tb_categoria values(null,'capsula','marca');
insert into tb_categoria values(null,'capsula','similiar');

insert into tb_categoria values(null,'liquido','generico');
insert into tb_categoria values(null,'liquido','marca');
insert into tb_categoria values(null,'liquido','similiar');



#-----------------insert produto-----------------------
insert into tb_produto values(null,'Doril','não',10.00,3);
insert into tb_produto values(null,'Multi Gripe','não',12.00,3);
insert into tb_produto values(null,'Cine Gripe','não',15.00,2);
insert into tb_produto values(null,'paracetamol','não',30.00,1);

insert into tb_produto values(null,'Tylenol','sim',40.00,5);
insert into tb_produto values(null,'Ambroxol','sim',55.00,5);
insert into tb_produto values(null,'Amoxicilina','sim',29.00,6);
insert into tb_produto values(null,'Ciprofloxacino','sim',13.00,4);



#-------------------------Select-------------------------
select * from tb_produto;

select nome,preco from tb_produto where preco>50;
select nome,preco from tb_produto where preco>3 and preco<60;

select * from tb_produto where nome like '%B%';

Select tb_categoria.modo, tb_categoria.tipo,
tb_produto.nome, tb_produto.receita, tb_produto.preco
from tb_categoria
inner join tb_produto
on tb_categoria.idCategoria=tb_produto.id_categoria;


Select tb_categoria.tipo,tb_produto.nome, tb_produto.receita, tb_produto.preco
from tb_categoria
inner join tb_produto
on idCategoria=id_categoria where tipo='generico';

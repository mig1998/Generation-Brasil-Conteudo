#---------------------------empresa------------------------
create database empresa;
use empresa;

create table funcionaries(
id  bigint primary key not null auto_increment,
Nome varchar(50) not null,
Sexo enum('M','F') not null,
Cpf int(11) not null unique,
Telefone varchar(30) not null, 
Salario double not null
);



insert into funcionaries values(null,'Miguel','M','123456710','109854321','1.999');
insert into funcionaries values(null,'Paulo','M','12412451','11114041','1.299');
insert into funcionaries values(null,'Daniela','F','42415610','31456652','3.099');
insert into funcionaries values(null,'Leticia','F','48851819','423563544','4.099');
insert into funcionaries values(null,'Magno','M','145654230','23452321','1.099');



select Id,Nome,Salario from funcionaries where Salario>2.000;
select Id,Nome,Salario from funcionaries where Salario<2.000;


update funcionaries set Salario='1.999' where id='2';
select * from funcionaries;



#---------------------------ecomerce------------------------

create database ecommerce;
use ecommerce;

create table produtos(
id  bigint primary key not null auto_increment,
NomeProduto varchar(50) not null,
Descricao varchar(50) not null,
nomeFornecedor varchar(50) not null,
preco double not null
);



insert into Produtos values(null,'airFryer','é uma airFryer que pode fazer tudo','consul','300');
insert into Produtos values(null,'notebook','intel I5 com placa de video','Positivo','1.999');
insert into Produtos values(null,'Cadeira Gamer','confortavel','XgamingX','2.999');
insert into Produtos values(null,'Geladeira Inox','alta qualidade nos alimentos','Brastemp','1.599');
insert into Produtos values(null,'Mesa','coloque suas coisas emcima','Wood','150.99');
insert into Produtos values(null,'HeadPhone','ouça musicas','SoundWave','350.99');
insert into Produtos values(null,'Celular','ligue e se comunique','Sony','2.399');
insert into Produtos values(null,'tablet','leve para qualquer lugar e faça tudo','xperia','800.99');

select Id,NomeProduto,preco from Produtos where preco>500;
select Id,NomeProduto,preco from Produtos where preco<500;


update Produtos set preco='1.299' where id='1';
select * from Produtos;

#---------------------------Escola------------------------
create database Escola;
use Escola;

create table estudantes(
id  bigint primary key not null auto_increment,
Nome varchar(50) not null,
Sexo enum('M','F') not null,
RA int not null unique,
Telefone varchar(30) not null, 
Nota double not null
);



insert into estudantes values(null,'Lucas','M','12390419','43241241','8.7');
insert into estudantes values(null,'Pedro','M','042958519','3124511','6.3');
insert into estudantes values(null,'Larissa','F','40204231','4352252','3.5');
insert into estudantes values(null,'Leandro','M','5933095','0198544','7.1');
insert into estudantes values(null,'Luana','F','145654230','21958100','10');
insert into estudantes values(null,'Leticia','F','39058905','2523342','7.5');
insert into estudantes values(null,'Miguel','M','21490581','91875629','10');
insert into estudantes values(null,'Arthur','M','29388393','23546453','2');



select Id,Nome,Nota from estudantes where nota>7;
select Id,Nome,Nota from estudantes where nota<7;


update estudantes set Nota='7' where nota>='6' and nota<=6.9;
select * from estudantes;
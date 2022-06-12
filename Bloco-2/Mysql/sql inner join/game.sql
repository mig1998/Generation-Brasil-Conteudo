#-----------------------------game---------------------------------
create database db_generation_game_online;

use db_generation_game_online;


create table tb_classe(
idClasse int primary key not null auto_increment,
tipo varchar(50) not null,
habilidades_ativas varchar(50) not null,
habilidades_passivas varchar(50) not null
);

create table tb_personagem(
idPersonagem bigint primary key not null auto_increment,
nome varchar(50) not null,
genero enum('M','F') not null,
ataque double not null,
defesa double not null,
nivel int(50) not null,
id_classe int, 
Foreign Key(id_classe) references tb_classe(idClasse)
);

#--------------insert CLASSES---------------------
insert into tb_classe values(null,'Knight','Defesa e  Ataque','regeneração de vida');
insert into tb_classe values(null,'Shooter','atirar com armas','dano aumenta durante o tempo de luta');
insert into tb_classe values(null,'Sorcerer','atirar magia','dano maior quando atinge 2 ou mais inimigos');
insert into tb_classe values(null,'Druid','curar','curar a todos quando tiver com pouca vida');
insert into tb_classe values(null,'Elf','atirar com arco e flecha','maior precisão quando sozinho');
insert into tb_classe values(null,'Samurai','Bater com espada','refletir dano com espada');

#-----------------insert personagem-----------------------
insert into tb_personagem values(null,'Yasuel','M',2.135,400,23,6);
insert into tb_personagem values(null,'Morgana','F',1.113,100,10,3);
insert into tb_personagem values(null,'Hari','F',351,50,1,3);
insert into tb_personagem values(null,'Garen','M',2.165,5405,49,1);
insert into tb_personagem values(null,'Sorakar','F',600,400,25,4);
insert into tb_personagem values(null,'Mifuney','M',6.105,1.403,50,6);
insert into tb_personagem values(null,'Legolas','M',4.115,1.703,31,5);
insert into tb_personagem values(null,'Luciana','F',5.125,1.604,44,6);
insert into tb_personagem values(null,'Carlos','M',1.125,700,39,5);



#-------------------------Select-------------------------
select * from tb_personagem;

select nome,ataque from tb_personagem where ataque>2.000;
select nome,defesa from tb_personagem where defesa>1.000 and defesa<2.000;

select nome,defesa from tb_personagem where defesa between 1000 and 2000;


select * from tb_personagem where nome like '%C%';

Select tb_classe.tipo, tb_classe.habilidades_ativas, tb_classe.habilidades_passivas,
tb_personagem.nome, tb_personagem.genero, tb_personagem.ataque, tb_personagem.defesa, tb_personagem.nivel
from tb_classe
inner join tb_personagem
on tb_classe.idClasse=tb_personagem.id_classe;



select * from tb_personagem inner join tb_classe
on idPersonagem=idClasse;



Select tb_classe.tipo,tb_personagem.nome, tb_personagem.genero, tb_personagem.ataque, tb_personagem.defesa, tb_personagem.nivel
from tb_classe
inner join tb_personagem
on idClasse=id_classe where tipo='sorcerer';

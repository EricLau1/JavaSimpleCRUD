drop database loja_java;

CREATE DATABASE loja_java 
DEFAULT CHARACTER SET utf8 
DEFAULT COLLATE utf8_general_ci;

USE loja_java;

create table cliente (
id int auto_increment,
nome varchar(35) not null,
nascimento date not null,
telefone varchar(15) not null,
constraint cliente_id_pk primary key(id)
)
ENGINE = InnoDB DEFAULT CHARSET = utf8;

create table item (
id int auto_increment,
descricao varchar(100) not null,
estoque int default 0,
valor double not null,
constraint item_id_pk primary key(id)
)
ENGINE = InnoDB DEFAULT CHARSET = utf8;

create table compra (
codigo int auto_increment,
idCliente int not null,
idItem int not null,
qtd int not null,
dataHora datetime not null,
constraint compra_codigo_pk primary key(codigo),
constraint compra_idCliente_fk foreign key(idCliente) references cliente(id),
constraint compra_idItem_fk foreign key(idItem) references item(id)
)
ENGINE = InnoDB DEFAULT CHARSET = utf8;

create table test (
id int auto_increment primary key,
semana varchar(10) not null,
dataHora datetime not null,
dataFixa date not null
)
ENGINE = InnoDB DEFAULT CHARSET = utf8;


insert into cliente (nome, nascimento, telefone) VALUES ('Jane Doe', '2018-01-03', '(99)9999-99999');
insert into item (descricao, estoque, valor) VALUES ('Video Game', 11, 2500);
insert into compra (idCliente, idItem, qtd, dataHora) VALUES (1, 1, 10, now());

select cliente.id as idCliente, cliente.nome as cliente, 
item.id as idItem, item.descricao as item, 
compra.qtd as quantidade, compra.dataHora as dataHora 
FROM compra
inner join cliente on cliente.id = compra.idCliente
inner join item on item.id = compra.idItem;

select * from item;

update item set estoque = (estoque - 1) where id = 7;

create table Produto(
	id uuid primary key,
	nome varchar(150),
	preco decimal(10,2),
	quantidade integer
);
//consulta:
select * from Produto;
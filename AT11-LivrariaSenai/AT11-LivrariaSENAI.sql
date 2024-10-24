DROP DATABASE IF EXISTS db_livrariaSenai;

CREATE DATABASE IF NOT EXISTS db_livrariaSenai;

USE db_livrariaSenai;

CREATE TABLE IF NOT EXISTS tb_cliente (
id_cliente INT PRIMARY KEY AUTO_INCREMENT,
nome_cliente VARCHAR(45) NOT NULL UNIQUE,       
cpf VARCHAR (11) NOT NULL,
rg VARCHAR (11) NOT NULL,
email VARCHAR (45) NOT NULL
);

 CREATE TABLE IF NOT EXISTS tb_clientes_telefone ( 
 id_telefone INT PRIMARY KEY AUTO_INCREMENT, 
 telefone VARCHAR(15), 
 CLIENTE_tb_cliente INT, 
 FOREIGN KEY (CLIENTE_tb_cliente) REFERENCES CLIENTE(tb_cliente) 
 ); 
 
 CREATE TABLE IF NOT EXISTS tb_clientes_endereco ( 
 id_endereco INT PRIMARY KEY AUTO_INCREMENT, 
 rua VARCHAR(45), 
 numero INT, 
 cidade VARCHAR(45), 
 estado VARCHAR(45), 
 CLIENTE_tb_cliente INT, FOREIGN KEY (CLIENTE_tb_cliente) 
 REFERENCES CLIENTE(tb_cliente) 
 ); 

 CREATE TABLE IF NOT EXISTS tb_editora ( 
 id_editora INT PRIMARY KEY AUTO_INCREMENT, 
 nome_editora VARCHAR(30), 
 nome_contato VARCHAR(30), 
 email VARCHAR(45), 
 contato VARCHAR(20)
 );
 
 CREATE TABLE IF NOT EXISTS tb_livro ( 
 id_livro INT PRIMARY KEY AUTO_INCREMENT, 
 titulo VARCHAR(45), 
 categoria VARCHAR(45), 
 isbn VARCHAR(13), 
 ano DATE, 
 valor DECIMAL(10, 2), 
 autor VARCHAR(45), 
 EDITORA_id_editora INT
 ); 
 
 CREATE TABLE IF NOT EXISTS tb_estoque ( 
quantidade INT, 
LIVRO_id_livro INT, 
PRIMARY KEY (LIVRO_id_livro), 
FOREIGN KEY (LIVRO_id_livro) REFERENCES LIVRO(id_livro) );

CREATE TABLE IF NOT EXISTS tb_pedido ( 
 id_pedido INT PRIMARY KEY AUTO_INCREMENT, 
 valor DECIMAL(10, 2), 
 data DATE, 
 CLIENTE_id_cliente INT, 
 FOREIGN KEY (CLIENTE_id_cliente) REFERENCES CLIENTE(id_cliente)
 );
 
  CREATE TABLE IF NOT EXISTS tb_item_pedido( 
 quantidade INT, 
 valor DECIMAL(10, 2), 
 PEDIDO_id_pedido INT, 
 LIVRO_id_livro INT, PRIMARY KEY (PEDIDO_id_pedido, LIVRO_id_livro), 
 FOREIGN KEY (PEDIDO_id_pedido) REFERENCES PEDIDO(id_pedido), 
 FOREIGN KEY (LIVRO_id_livro) REFERENCES LIVRO(id_livro)
 ); 
 
 INSERT INTO tb_cliente (nome_cliente, cpf, rg, email) VALUES
('Maria Fernanda', 39286923412, 2023),
('Análise de Dados com SQL', 80, 2024),
('Design Gráfico', 150, 2023),
('Marketing Digital', 100, 2024),
('Administração de Empresas', 200, 2023),
('Engenharia de Software', 250, 2024),
('Ciência da Computação', 300, 2023),
('Direito', 180, 2024),
('Medicina', 400, 2023),
('Educação Física', 120, 2024);
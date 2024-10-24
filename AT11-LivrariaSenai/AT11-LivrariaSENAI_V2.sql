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
('Maria Fernanda', '479.661.960-70', 343463520, 'pokawaj681@regishub.com'),
('Pedro Henrique', '456.661.990-70', 346763520, 'kapowaj681@regishub.com'),
('Mario Barbosa', '382.661.960-70', 3435948520, 'kajwes681@regishub.com'),
('Julia Santos', '493.661.960-70', 343439220, 'akfnasj681@regishub.com'),
('Bruno Gazola', '479.483.696-70', 343463392, 'egswazj681@regishub.com'),
('Gabriela Francisco', '479.473.695-70', 342323520, 'aokdfwj681@regishub.com'),
('Isabela Primissia', '392.661.960-93', 343463372, 'erstasj681@regishub.com'),
('Marcos Leite', '421.661.392-45', 343448320, 'aksdj681@regishub.com'),
('Amanda Pigatti', '479.451.870-70', 343449320, 'kdjsgah681@regishub.com'),
('Sonia Leite', '479.661.932-59', 3434372620, 'agshsdj681@regishub.com');

INSERT INTO tb_clientes_telefone (telefone) VALUES 
('(69) 96897-9290'),
('(95) 97115-8197'),
('(99) 99484-6103'),
('(67) 98394-6166'),
('(51) 99576-9355'),
('(82) 97837-8767'),
('(65) 96103-9078'),
('(34) 98583-7494'),
('(71) 97006-7873'),
('(86) 99003-0285'),
('(28) 99523-4924'),
('(71) 98039-7362'),
('(18) 98188-0476'),
('(95) 99089-1037'),
('(31) 98408-7766');

INSERT INTO tb_clientes_endereco (rua, numero, cidade, estado) VALUES

('Rua das Rosas', '479.661.932-59', 3434372620, 'agshsdj681@regishub.com'),
('Condomínio Bella Vista', '479.661.932-59', 3434372620, 'agshsdj681@regishub.com'),
('Rua Chapa', '479.661.932-59', 3434372620, 'agshsdj681@regishub.com'),
('Rua Raimundo Coutinho', '479.661.932-59', 3434372620, 'agshsdj681@regishub.com'),
('Rua Jair Machado dos Santos', '479.661.932-59', 3434372620, 'agshsdj681@regishub.com'),
('Rua Coronel Vicente Ramos', '479.661.932-59', 3434372620, 'agshsdj681@regishub.com'),
('Rua Arnaldo Vallardi Portilho', '479.661.932-59', 3434372620, 'agshsdj681@regishub.com'),
('Rua Sebastiana Pereira Gomes', '479.661.932-59', 3434372620, 'agshsdj681@regishub.com'),
('Rua dos Andradas', '479.661.932-59', 3434372620, 'agshsdj681@regishub.com'),
('Rua Belo Horizonte', '479.661.932-59', 3434372620, 'agshsdj681@regishub.com'),
('Rua Antônio Prado', '479.661.932-59', 3434372620, 'agshsdj681@regishub.com'),
('Rua Hugo Leal', '479.661.932-59', 3434372620, 'agshsdj681@regishub.com'),
('Rua Rosa de Saron', '479.661.932-59', 3434372620, 'agshsdj681@regishub.com'),
('Rua Raul Pompéia', '479.661.932-59', 3434372620, 'agshsdj681@regishub.com'),
('Rua Palestina', '479.661.932-59', 3434372620, 'agshsdj681@regishub.com');	




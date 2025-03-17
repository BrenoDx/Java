create database cenaflixpd_bd;

CREATE TABLE podcast(
id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
produtor VARCHAR(50) NOT NULL,
nomeEp VARCHAR(50) NOT NULL,
episodio INT NOT NULL,
duracao VARCHAR(8) NOT NULL,
url TEXT NOT NULL

);

CREATE TABLE acesso(
id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(50) NOT NULL,
login VARCHAR(50) NOT NULL,
senha TEXT NOT NULL,
tipo VARCHAR(15) NOT NULL
);

INSERT INTO acesso(nome, login, senha, tipo) VALUES
('Alexandre', 'alexandre@email.com', md5('8651'), 'Administrador'),
('Deive', 'deive@email.com', md5('7845'), 'Operador'),
('Breno', 'breno@email.com', md5('9546'), 'Usuario');

Select * from podcast;

CREATE TABLE pessoa(
   codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
   nome VARCHAR(50) NOT NULL,
   ativo BOOLEAN,
   logradouro VARCHAR(50),
   numero VARCHAR(10), 
   complemento VARCHAR(20),
   bairro VARCHAR(50),
   cep VARCHAR(10),
   cidade VARCHAR(20),
   estado VARCHAR(20)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) 
VALUES ('Rivaldo Souza', 1, 'testmom', '155', 'casa', 'Silviania', '06782198', 'Osasco', 'São Paulo');

INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) 
VALUES ('Emanuella', 1, 'testmom2', '325', 'casa', 'Linda', '01223398', 'São Paulo', 'São Paulo');

INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) 
VALUES ('Gabriella', 0, 'testmom3', '255', 'apartamento', 'Silviania', '045782198', 'Barueri', 'São Paulo');

INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) 
VALUES ('Luciana', 1, 'mega', '2955', 'apartamento', 'Avenida Brasil', '045782112', 'Barueri', 'Rio de Janeiro');

INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) 
VALUES ('Adriana', 1, 'ultra', '5255', 'casa', 'Rebouças', '045782155', 'Barueri', 'Rio de Janeiro');

INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) 
VALUES ('Ludimila', 1, 'megamente', '2545', 'apartamento', 'Olinda', '045782155', 'Recefi', 'Ceará');

INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) 
VALUES ('Marcelo', 0, 'louco', '2535', 'casa', 'Motanha', '4045782198', 'Liberdade', 'Minas Gerais');

INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) 
VALUES ('Antonio', 0, 'teste', '1255', 'casa', 'Gelo', '045782198', 'Salvador', 'Bahia');



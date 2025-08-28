-- comentario de linha
/*
comentario de bloco
*/

-- criando uma tabelapessoapetshop
CREATE TABLE pessoa
(cd_pessoa		INTEGER,
nm_pessoa		VARCHAR(20),
dt_nascimento	DATE
);
-- inserindo um registro na tabela pessoa
INSERT INTO pessoa(cd_pessoa, nm_pessoa, dt_nascimento)
				VALUES (1, 'pessoa 1', '2024-10-10');
-- selecionando dados de pessoa
SELECT * FROM pessoa;	
-- descrevendo a estrutura de uma tabela
DESC pessoa;
-- alterando a tabela pessoa, aumento do campo de coluna	
ALTER TABLE pessoa
MODIFY COLUMN nm_pessoa VARCHAR(50);		
-- alterando uma tabela para adicionar novo campo
ALTER TABLE pessoa
ADD COLUMN ds_email VARCHAR(50);
-- alterando uma tabela, eliminando uma coluna 
ALTER TABLE pessoa
DROP COLUMN dt_nascimento;
-- eliminando dados (TODOS) de uma tabela
TRUNCATE TABLE pessoa
-- elimina a tabela
DROP TABLE pessoa

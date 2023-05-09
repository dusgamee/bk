CREATE TABLE Cliente (
id INT PRIMARY KEY,
nome VARCHAR(100),
email VARCHAR(100),
telefone VARCHAR(15) UNIQUE
);

CREATE TABLE Pedido (
    id INT PRIMARY KEY,
    cliente_id INT,
    date DATE,
    valor DECIMAL(10, 2) CHECK (valor >= 10)
);

CREATE TABLE Produto (
  id INT PRIMARY KEY,
  descricao VARCHAR(255),
  marca_id INT,
  fornecedor_id INT,
  quantidade_atual INT,
  valor DECIMAL(10,2)
);

ALTER TABLE Produto MODIFY
quantidade_atual DECIMAL(13,4);

ALTER TABLE Cliente
DROP COLUMN email;

CREATE TABLE Categoria (
  id INT PRIMARY KEY,
  descricao VARCHAR(100)
);

ALTER TABLE Produto
ADD COLUMN categoria_id INT;

ALTER TABLE Produto
ADD CONSTRAINT fk_produto_categoria
FOREIGN KEY (categoria_id)
REFERENCES Categoria(id);

DROP TABLE Produto;

ALTER TABLE Cliente
ALTER COLUMN nome_cliente SET NOT NULL;

ALTER TABLE Produto
ADD COLUMN ativo BOOLEAN DEFAULT TRUE;

ALTER TABLE Cliente RENAME TO Pessoa;

# Gerenciador de Produtos - Java + JDBC + PostgreSQL

## Descrição

Este projeto é um **sistema de gerenciamento de produtos** desenvolvido em **Java**, utilizando **JDBC** para comunicação com o banco de dados **PostgreSQL**. Ele realiza operações de **CRUD** (Create, Read, Update, Delete) e é integrado com o Docker, facilitando a execução do banco de dados PostgreSQL em um contêiner isolado.

## Tecnologias Utilizadas

- **Java 21**: A versão mais recente da linguagem Java, aproveitando suas novas funcionalidades para tornar o código mais robusto e moderno.
- **JDBC**: API Java para comunicação com bancos de dados relacionais, utilizada para realizar as operações de CRUD diretamente no banco de dados.
- **PostgreSQL**: Banco de dados relacional robusto e altamente escalável, utilizado para persistir os dados dos produtos.
- **Docker + Docker Compose**: Ferramentas para criar, executar e orquestrar contêineres. O PostgreSQL é executado em um contêiner Docker isolado.
- **Eclipse IDE**: Ambiente de desenvolvimento integrado (IDE) utilizado para escrever e compilar o código (pode ser substituído por outras IDEs).

## Arquitetura do Projeto

A aplicação é estruturada em camadas bem definidas, seguindo o princípio da **separação de responsabilidades**, o que melhora a manutenção e a escalabilidade do código:

- **Entities**: Contêm os modelos de dados que representam as tabelas do banco. Exemplo: `Produto`.
  
- **Repositories**: São responsáveis pela lógica de acesso e manipulação de dados no banco. Eles interagem diretamente com o banco de dados utilizando JDBC. Exemplo: `ProdutoRepository`.
  
- **Controllers**: Camada que recebe as requisições e interage com o usuário. Responsável por processar entradas e retornar saídas (informações sobre os produtos cadastrados, por exemplo).
  
- **Factories**: Responsáveis pela criação e configuração de objetos. Por exemplo, uma `ConnectionFactory` gerencia a conexão com o banco de dados PostgreSQL, centralizando a criação da conexão.

## Funcionalidades

- **Cadastrar Produto**: Adiciona um novo produto ao banco de dados.
- **Listar Produtos**: Exibe todos os produtos cadastrados no banco.
- **Atualizar Produto**: Modifica as informações de um produto existente.
- **Deletar Produto**: Remove um produto do banco de dados.

## Pré-Requisitos

Antes de executar o projeto, certifique-se de ter o seguinte instalado:

- **Java JDK 21** ou superior
- **Docker** e **Docker Compose**
- **Eclipse IDE** (ou outra IDE de sua preferência)

## Como Executar

1. **Suba o banco de dados PostgreSQL com Docker Compose**:

   Na raiz do projeto, execute o seguinte comando para iniciar o contêiner do PostgreSQL:

   ```bash
   docker-compose up -d

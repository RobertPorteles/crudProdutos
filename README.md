## Gerenciador de Produtos - Java + JDBC + PostgreSQL

Sistema de gerenciamento de produtos com operações de **CRUD** (Create, Read, Update, Delete), desenvolvido em **Java 21** com **JDBC** e persistência em banco de dados **PostgreSQL**, executado em contêiner **Docker** via `docker-compose`.

### 🚀 Tecnologias Utilizadas
- **Java 21** – versão moderna da linguagem, com novos recursos.
- **JDBC** – API de acesso a banco de dados relacionais.
- **PostgreSQL** – banco de dados robusto e confiável.
- **Docker + Docker Compose** – para isolar e orquestrar o ambiente do banco de dados.
- **Eclipse IDE** – ambiente de desenvolvimento utilizado.

### 🧱 Arquitetura do Projeto
- **Entities** – representam os dados da aplicação (ex: `Produto`).
- **Repositories** – fazem a ponte entre o código Java e o banco usando JDBC.
- **Controllers** – lidam com entradas e saídas do usuário.
- **Factories** – criam objetos reutilizáveis, como conexões com o banco.

### ✅ Funcionalidades
- Cadastrar produto  
- Listar produtos  
- Atualizar produto  
- Deletar produto  

### 📦 Pré-Requisitos
- Java JDK 21+  
- Docker e Docker Compose  
- Eclipse ou outra IDE Java  

### ▶️ Como Executar
1. Suba o banco de dados PostgreSQL com Docker:
   ```bash
   docker-compose up -d

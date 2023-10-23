![QuickNotes Logo](https://via.placeholder.com/150)

# QuickNotes - Sistema de Anotações com SQLite

Um aplicativo Java simples para gerenciar anotações pessoais, categorias e lembretes utilizando SQLite como banco de dados.

## 📌 Índice

- [Estrutura do Projeto](#-estrutura-do-projeto)
- [Funcionalidades](#-funcionalidades)
- [Pré-requisitos](#-pré-requisitos)
- [Como Executar](#-como-executar)
- [Licença](#-licença)

## 📁 Estrutura do Projeto

#### Modelos:

- **Anotacao:** Representa uma anotação individual.
- **Categoria:** Representa uma categoria de anotações.
- **Lembrete:** Representa um lembrete associado a uma anotação.

#### DAO (Data Access Object):

- **DBConnection:** Classe para gerenciar a conexão com o banco de dados.
- **AnotacaoDAO:** Fornece métodos para operações CRUD com anotações.
- **CategoriaDAO:** Permite a inserção e listagem de categorias.
- **LembreteDAO:** Permite a inserção e listagem de lembretes.

## ✨ Funcionalidades

### CategoriaDAO:
- **Insert:** Adiciona uma nova categoria ao banco de dados.
- **FindAll:** Retorna uma lista de todas as categorias.

### LembreteDAO:
- **Insert:** Adiciona um novo lembrete.
- **FindAllReminders:** Retorna uma lista de todos os lembretes.

*(Funcionalidades adicionais de CRUD podem ser implementadas no futuro.)*

## 🛠️ Pré-requisitos

- JDK instalado em sua máquina.
- Driver JDBC para SQLite.

## 🚀 Como Executar

1. Clone o repositório para sua máquina local:
   ```bash
   git clone git@github.com:leoarcabold/quicknotes.git

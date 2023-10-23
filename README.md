# QuickNotes - Sistema de Anotações

Sistema simples de gerenciamento de anotações pessoais desenvolvido em Java e utilizando SQLite como banco de dados.

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

## ✨ Funcionalidades

- **Listar Anotações:** Visualize todas as suas anotações em uma lista.
  
*(Funcionalidades adicionais de CRUD podem ser implementadas no futuro.)*

## 🛠️ Pré-requisitos

- JDK instalado em sua máquina.
- Driver JDBC para SQLite.

## 🚀 Como Executar

1. Clone o repositório para sua máquina local:
   ```bash
   git clone git@github.com:leoarcabold/quicknotes.git

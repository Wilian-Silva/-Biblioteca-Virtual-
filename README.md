# 📚 Biblioteca Virtual – Java (Console)

Projeto desenvolvido como parte da etapa final do curso técnico em **Desenvolvimento de Sistemas**, com o objetivo de aplicar boas práticas de programação e os princípios de projeto **SOLID**, em especial o **Princípio da Responsabilidade Única (SRP)**.

O sistema consiste em uma **biblioteca virtual em modo console**, permitindo o controle de livros e o acompanhamento do status de leitura.

---

## 🎯 Objetivo do Projeto

Demonstrar:
- Organização de código em camadas
- Separação de responsabilidades
- Aplicação de princípios SOLID
- Versionamento com GitHub
- Funcionamento correto das funcionalidades básicas do sistema

Este projeto serve como base para evolução futura para uma **aplicação web utilizando Spring e MySQL**.

---

## ⚙️ Funcionalidades

- 📌 Cadastrar livros  
- 📌 Listar livros cadastrados  
- 📌 Atualizar o status de leitura (Não lido, Lendo, Lido)  
- 📌 Excluir livros  
- 📌 Buscar livros por identificador (ID)  

---

## 🧱 Estrutura do Projeto

O projeto foi organizado em pacotes, seguindo boas práticas de arquitetura:

---

## 🧩 Princípios SOLID Aplicados

### 🔹 Princípio da Responsabilidade Única (SRP)

Cada classe possui uma única responsabilidade:

- `Livro` → Representação dos dados do livro  
- `StatusLivro` → Controle dos estados de leitura  
- `LivroRepository` → Armazenamento e acesso aos dados  
- `LivroService` → Regras de negócio  
- `Menu` → Interação com o usuário  
- `Main` → Inicialização e testes do sistema  

Essa separação facilita a manutenção, leitura do código e futuras evoluções do projeto.

---

## 🛠️ Tecnologias Utilizadas

- Java
- Maven
- Git / GitHub
- IDE: NetBeans

---

## ▶️ Como Executar o Projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/biblioteca-console.git

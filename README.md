# 🍽️ Sistema de Pedidos de Restaurante

Um simples sistema de consola em Java para gerir pedidos, criado como um projeto de estudo para a disciplina de Arquitetura de Software.

O objetivo principal deste projeto é demonstrar a aplicação prática dos padrões de design **GRASP**.

---

## 🎯 Padrões GRASP Aplicados

1.  **Creator (Criador)**
    * **Onde:** A classe `CozinhaService` é a "Criadora".
    * **Porquê:** Ela é responsável por criar e gerir o ciclo de vida dos objetos `Pedido`. A `CozinhaService` "contém" ou "agrega" os pedidos.
2.  **Controller (Controlador)**
    * **Onde:** A classe `GerenteController` atua como o "Controlador".
    * **Porquê:** Ela serve como intermediária entre a `RestauranteView` (interface) e a `CozinhaService` (lógica).

---

## 🚀 Como Executar

1.  Clone este repositório.
2.  Abra o projeto no seu IDE Java favorito (Eclipse, IntelliJ, VS Code, etc.).
3.  Localize e execute o ficheiro `Main.java`.

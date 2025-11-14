# 🍽️ Sistema de Pedidos de Restaurante

Um simples sistema de consola em Java para gerir pedidos, criado como um projeto de estudo para a disciplina de Arquitetura de Software.

O objetivo principal deste projeto é demonstrar a aplicação prática dos padrões de design **GRASP**.

---

## 🎯 Padrões GRASP Aplicados

Este projeto foca-se na implementação de dois padrões GRASP principais, conforme descrito no material de aula:

1.  **Creator (Criador)**
    * **Onde:** A classe `CozinhaService` é a "Criadora".
    * **Porquê:** Ela é responsável por criar e gerir o ciclo de vida dos objetos `Pedido`. [cite_start]A `CozinhaService` "contém" ou "agrega" os pedidos, tornando-se a candidata lógica para a sua criação, tal como o restaurante do exemplo da aula cria os Pratos [cite: 59-61].

2.  **Controller (Controlador)**
    * **Onde:** A classe `GerenteController` atua como o "Controlador".
    * [cite_start]**Porquê:** Ela serve como intermediária entre a `RestauranteView` (interface) e a `CozinhaService` (lógica) [cite: 175-176]. Ela recebe eventos de entrada (opções do menu) e coordena as ações, delegando o trabalho para as classes corretas, exatamente como o "Gerente" do exemplo da aula.

Além disso, o projeto procura manter uma **Alta Coesão (High Cohesion)**, com cada classe (View, Controller, Service, Model) a ter um conjunto focado e bem definido de responsabilidades.

---

## 🚀 Como Executar

1.  Clone este repositório.
2.  Abra o projeto no seu IDE Java favorito (Eclipse, IntelliJ, VS Code, etc.).
3.  Localize e execute o ficheiro `Main.java`.

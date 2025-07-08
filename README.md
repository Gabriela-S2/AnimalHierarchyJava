# Hierarquia de Animais em Java (POO)

Este projeto demonstra a aplicação de conceitos fundamentais de Programação Orientada a Objetos (POO) em Java, através da criação de uma hierarquia de classes de diferentes tipos de animais.

## 🚀 Conceitos de POO Abordados

* **Herança:** Utilização de classes base (`Animal`) e subclasses (`Peixe`, `Felino`, `Canino`, `Gato`, `Onca`, `Cachorro`, `Lobo`, `Piaba`) para reutilizar código e estabelecer relações "é um".
* **Abstração:** Classes abstratas (`Animal`, `Peixe`, `Felino`, `Canino`) definem comportamentos comuns sem fornecer uma implementação completa, garantindo que as subclasses implementem métodos específicos.
* **Polimorfismo:** O método `informacoes()` é um exemplo de polimorfismo, onde cada subclasse fornece sua própria implementação desse método.
* **Encapsulamento:** Uso de modificadores de acesso (`private` para atributos e `public` para `getters` e `setters`) para controlar o acesso aos dados das classes.

## 📂 Estrutura do Projeto

O projeto está organizado em um pacote `lista03.exercicio03` e contém as seguintes classes:

* `Animal.java`: Classe abstrata base para todos os animais, definindo atributos e comportamentos comuns (comer, mover).
* `Peixe.java`: Classe abstrata que estende `Animal`, com características específicas de peixes.
* `Felino.java`: Classe abstrata que estende `Animal`, base para felinos.
* `Canino.java`: Classe abstrata que estende `Animal`, base para caninos.
* `Gato.java`: Estende `Felino`, implementa método `miar()`.
* `Onca.java`: Estende `Felino`, implementa método `rosnar()`.
* `Cachorro.java`: Estende `Canino`, implementa método `latir()`.
* `Lobo.java`: Estende `Canino`, implementa método `uivar()`.
* `Piaba.java`: Estende `Peixe`, implementa o método `informacoes()`.
* `Aplicativo.java`: Classe principal com o método `main` para demonstrar a criação e interação com os objetos das classes de animais.

## 🛠️ Como Compilar e Rodar

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/SeuUsuario/AnimalHierarchyJava.git](https://github.com/SeuUsuario/AnimalHierarchyJava.git)
    ```
2.  **Navegue até o diretório do projeto:**
    ```bash
    cd AnimalHierarchyJava
    ```
3.  **Compile os arquivos Java:**
    Se você estiver na raiz do projeto (`AnimalHierarchyJava/`), execute:
    ```bash
    javac src/lista03/exercicio03/*.java -d out
    ```
    (Este comando compila todos os arquivos `.java` dentro do pacote e os coloca no diretório `out`).
4.  **Execute a aplicação:**
    ```bash
    java -cp out lista03.exercicio03.Aplicativo
    ```

## 📄 Exemplo de Saída

Ao executar o `Aplicativo.java`, você verá uma saída similar a esta no console:

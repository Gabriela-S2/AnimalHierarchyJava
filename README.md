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
Sim, definitivamente seria muito legal adicionar esses códigos ao seu perfil do GitHub! Eles mostram um bom entendimento de Programação Orientada a Objetos (POO) em Java, especificamente conceitos como:

Herança: Você tem uma hierarquia clara de classes (Animal -> Peixe, Felino, Canino; Felino -> Gato, Onca; Canino -> Cachorro, Lobo).

Abstração: As classes Animal, Peixe, Felino, e Canino são abstratas, definindo um contrato para as subclasses.

Polimorfismo: O método informacoes() é sobrescrito em várias subclasses, demonstrando polimorfismo em tempo de execução.

Encapsulamento: O uso de private para os atributos e métodos getters e setters para acessá-los.

Esses são conceitos fundamentais e muito valorizados no desenvolvimento de software.

Como adicionar e apresentar no seu perfil do GitHub:
A melhor forma de adicionar e apresentar isso é criando um novo repositório para este projeto e adicionando uma descrição detalhada no README.md desse repositório.

Aqui está um passo a passo e sugestões de como estruturar:

1. Crie um Novo Repositório no GitHub
Dê um nome claro e conciso, por exemplo: AnimalHierarchyJava ou POO-Animais-Java.

Adicione uma descrição breve, como: "Exemplo de hierarquia de classes de animais utilizando conceitos de Programação Orientada a Objetos (POO) em Java."

Marque a opção para inicializar o repositório com um README.md.

2. Organize Seus Arquivos no Repositório
Dentro do seu novo repositório, você pode manter a estrutura de pacotes que já tem.

Exemplo de estrutura de pastas:

AnimalHierarchyJava/
├── src/
│   └── lista03/
│       └── exercicio03/
│           ├── Animal.java
│           ├── Aplicativo.java
│           ├── Cachorro.java
│           ├── Canino.java
│           ├── Felino.java
│           ├── Gato.java
│           ├── Lobo.java
│           ├── Onca.java
│           └── Piaba.java
└── README.md
3. Crie um README.md Detalhado para o Repositório
Este é o coração da apresentação do seu código. Ele deve explicar o que o projeto faz, os conceitos que ele demonstra e como executá-lo.

Aqui está um rascunho do que você pode incluir:

Markdown

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

Especie: Gato
Peso: 3.5 Kg
Idade: 2 anos
Alimento: Ração
Velocidade: 10.0 Km/h
Gato está miando.
Animal está comendo.
Animal está se movendo a 10.0 km/h.

Especie: Onça Pintada
Peso: 100.0 Kg
Idade: 5 anos
Alimento: Carne
Velocidade: 50.0 Km/h
Onça está rosnando.
Animal está comendo.
Animal está se movendo a 50.0 km/h.

Especie: Cachorro
Peso: 10.0 Kg
Idade: 4 anos
Alimento: Ração
Velocidade: 15.0 Km/h
Cachorro está latindo.
Animal está comendo.
Animal está se movendo a 15.0 km/h.

Especie: Lobo
Peso: 45.0 Kg
Idade: 6 anos
Alimento: Carne
Velocidade: 30.0 Km/h
Lobo está uivando.
Animal está comendo.
Animal está se movendo a 30.0 km/h.

Especie: Peixe
Peso: 0.5 Kg
Idade: 1 anos
Alimento: carne humana
Velocidade: 0.3 Km/h
Animal está comendo.
Animal está se movendo a 0.3 km/h.

![Java](https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white)

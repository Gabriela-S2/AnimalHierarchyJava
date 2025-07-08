package lista03.exercicio03;

abstract class Canino extends Animal {
    public Canino(String especie, double peso, int idade, String alimento, double velocidade) {
        super(especie, peso, idade, alimento, velocidade);
    }

    public abstract void informacoes();
}
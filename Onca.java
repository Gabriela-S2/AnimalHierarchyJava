package lista03.exercicio03;

public class Onca extends Felino {
    public Onca(String especie, double peso, int idade, String alimento, double velocidade) {
        super(especie, peso, idade, alimento, velocidade);
    }

    public void rosnar() {
        System.out.println("Onça está rosnando.");
    }

    @Override
    public void informacoes() {
        System.out.println("________");
        System.out.println("Especie: " + getEspecie());
        System.out.println("Peso: " + getPeso() + " Kg");
        System.out.println("Idade: " + getIdade() + " anos");
        System.out.println("Alimento: " + getAlimento());
        System.out.println("Velocidade: " + getVelocidade() + " Km/h");


    }
}

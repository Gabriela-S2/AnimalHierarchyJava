package lista03.exercicio03;

public class Piaba extends Peixe{
    public Piaba(String especie, double peso, int idade, String alimento, double velocidade, String caracteristicas) {
        super(especie, peso, idade, alimento, velocidade, caracteristicas);
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

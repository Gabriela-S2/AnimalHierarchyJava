package lista03.exercicio03;

class Gato extends Felino {
    public Gato(String especie, double peso, int idade, String alimento, double velocidade) {
        super(especie, peso, idade, alimento, velocidade);
    }

    public void miar() {
        System.out.println("Gato está miando.");
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


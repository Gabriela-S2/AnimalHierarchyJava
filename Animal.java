package lista03.exercicio03;

public abstract class Animal {
    private String especie;
    private double peso;
    private int idade;
    private String alimento;
    private double velocidade;

    public Animal(String especie, double peso, int idade, String alimento, double velocidade) {
        this.especie = especie;
        this.peso = peso;
        this.idade = idade;
        this.alimento = alimento;
        this.velocidade = velocidade;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public void comer() {
        System.out.println("Animal está comendo.");
    }

    public void mover() {
        System.out.println("Animal está se movendo a " + velocidade + " km/h.");
    }
    public abstract void informacoes();
}




package lista03.exercicio03;

abstract class Peixe extends Animal{
    private String caracteristicas;

    public Peixe(String especie, double peso, int idade, String alimento, double velocidade, String caracteristicas) {
        super(especie, peso, idade, alimento, velocidade);
        this.caracteristicas = caracteristicas;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }
}

package lista03.exercicio03;

public class Aplicativo {
    public static void main(String[] args) {
        Gato xaninha = new Gato("Gato", 3.5, 2, "Ração", 10.0);
        xaninha.informacoes();
        xaninha.miar();
        xaninha.comer();
        xaninha.mover();


        Onca pintada = new Onca("Onça Pintada", 100.0, 5, "Carne", 50.0);
        pintada.informacoes();
        pintada.rosnar();
        pintada.comer();
        pintada.mover();


        Cachorro pitoco = new Cachorro("Cachorro", 10.0, 4, "Ração", 15.0);
        pitoco.informacoes();
        pitoco.latir();
        pitoco.comer();
        pitoco.mover();


        Lobo alpha = new Lobo("Lobo", 45.0, 6, "Carne", 30.0);
        alpha.informacoes();
        alpha.uivar();
        alpha.comer();
        alpha.mover();

        Piaba nemo = new Piaba("Peixe",0.5, 1, "carne humana", 0.3, "cinza");
        nemo.informacoes();
        nemo.comer();
        nemo.mover();
    }
}


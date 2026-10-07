package ads.esd;

public class Main {
    static void main() {
        Processo p1 = new Processo("P1", 7, 0);
        Processo p2 = new Processo("P2", 4, 0);
        Processo p3 = new Processo("P3", 5, 1);
        Processo p4 = new Processo("P4", 6, 2);
        Processo p5 = new Processo("P5", 3, 4);

        Escalonador escalonador = new Escalonador(5,2);
        escalonador.adicionarProcessos(p1,p2,p3,p4,p5);
        escalonador.incrementarProcessos();



    }
}

package ads.esd;

public class Main {
    static void main() {
        Processo p1 = new Processo("P1", 7, 0);
        Processo p2 = new Processo("P2", 4, 0);
        Processo p3 = new Processo("P3", 5, 1);
        Processo p4 = new Processo("P4", 6, 2);
        Processo p5 = new Processo("P5", 3, 4);

        Processo[] processos = new Processo[5];
        processos[0] = p1;
        processos[1] = p2;
        processos[2] = p3;
        processos[3] = p4;
        processos[4] = p5;

        int rodada = 0; // Tempo atual
        final int INSTRUCOES_POR_RODADA = 2;
        FilaCircular<Processo> fila = new FilaCircular<Processo>(5);

        while (rodada < 14) {
            for (int i = 0; i < processos.length; i++) {
                if (processos[i].getTempoChegada() == rodada){
                    fila.enfileirar(processos[i]);

                }
            }

            for (int quantum = 0; quantum < INSTRUCOES_POR_RODADA; quantum++) {
                if (quantum == fila.desenfileirar().getInstrucoesRestantes()){
                    fila.desenfileirar().setStatus("FINALIZADO"); // Ajustar
                }

            }

            rodada++;
        }
    }
}

package ads.esd.testes;

import ads.esd.Vetor;

import java.util.Random;

public class ex13 {
    public static void main(String[] args) {
        Vetor<Integer> vetorP = new Vetor<>(1000);
        Vetor<Integer> vetorM = new Vetor<>(10000);
        Vetor<Integer> vetorG = new Vetor<>(100000);


        for (int i = 0; i < 100000; i++) {
            if (i < 1000){
                vetorP.inserir(i + 1);
            }

            if (i < 10000){
                vetorM.inserir(i + 1);
            }

            vetorG.inserir(i + 1);
        }

        System.out.println("=========================== VETOR PEQUENO ==============================");
        System.out.println("(BUSCA LINEAR)");
        System.out.println("  • Melhor caso:");
        buscarLinear(vetorP, 1);
        System.out.println("\n  • Caso médio:");
        buscarLinear(vetorP, 500);
        System.out.println("\n  • Pior caso:");
        buscarLinear(vetorP, 1000);

        System.out.println("\n(BUSCA BINÁRIA)");
        System.out.println("  • Melhor caso:");
        buscarBinaria(vetorP, 500);
        System.out.println("\n  • Caso médio:");
        buscarBinaria(vetorP, 125);
        System.out.println("\n  • Pior caso:");
        buscarBinaria(vetorP, 1); //  ou 1000

        System.out.println();
        System.out.println("=========================== VETOR MÉDIO ==============================");
        System.out.println("\n(BUSCA LINEAR)");
        System.out.println("  • Melhor caso:");
        buscarLinear(vetorM, 1);
        System.out.println("\n  • Caso médio:");
        buscarLinear(vetorM, 5000);
        System.out.println("\n  • Pior caso:");
        buscarLinear(vetorM, 10000);

        System.out.println("\n(BUSCA BINÁRIA)");
        System.out.println("  • Melhor caso:");
        buscarBinaria(vetorM, 5000);
        System.out.println("\n  • Caso médio:");
        buscarBinaria(vetorM, 625);
        System.out.println("\n  • Pior caso:");
        buscarBinaria(vetorM, 1); //  ou 10000

        System.out.println();
        System.out.println("=========================== VETOR GRANDE ==============================");
        System.out.println("\n(BUSCA LINEAR)");
        System.out.println("  • Melhor caso:");
        buscarLinear(vetorG, 1);
        System.out.println("\n  • Caso médio:");
        buscarLinear(vetorG, 50000);
        System.out.println("\n  • Pior caso:");
        buscarLinear(vetorG, 100000);

        System.out.println("\n(BUSCA BINÁRIA)");
        System.out.println("  • Melhor caso:");
        buscarBinaria(vetorG, 50000);
        System.out.println("\n  • Caso médio:");
        buscarBinaria(vetorG, 3125);
        System.out.println("\n  • Pior caso:");
        buscarBinaria(vetorG, 1); //  ou 100000

        buscarInterpolacao(vetorP, 100);
        buscarInterpolacao(vetorM, 112);
        buscarInterpolacao(vetorG, 777);

        System.out.println();
        System.out.println("Busca por Interpolacao");
        buscarInterpolacao(vetorM, 500);
        buscarInterpolacao(vetorM, 5);

    }

    public static int buscarLinear(Vetor<Integer> vetor, int alvo){
        long inicio = System.nanoTime();

        for (int i = 0; i < vetor.getTamanho(); i++) {
            if (vetor.ler(i) == alvo){
                System.out.println("    - Contador: " + (i+1));
                long fim = System.nanoTime();
                double duracaoMs = (fim - inicio) / 1_000_000.0;
                System.out.println("    - Tempo: " + duracaoMs + " ms");

                return i;
            }
        }
        return -1;
    }

    public static int buscarBinaria(Vetor<Integer> vetor, int alvo){
        long inicioExecucao = System.nanoTime();
        int inicio = 0;
        int fim = vetor.getTamanho() -1 ;
        int contador = 0;

        while (inicio <= fim) {
            contador++;

            int meio = (inicio + fim) / 2;

            if (vetor.ler(meio) == alvo){
                System.out.println("    - Contador: " + (contador));
                long fimExecucao = System.nanoTime();
                double duracaoMs = (fimExecucao - inicioExecucao) / 1_000_000.0;
                System.out.println("    - Tempo: " + duracaoMs + " ms");
                return meio;
            }else if (alvo > vetor.ler(meio)){
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return -1;
    }

    public static int buscarInterpolacao(Vetor<Integer> vetor, int alvo){
        long inicioExecucao = System.nanoTime();
        int inicio = 0;
        int fim = vetor.getTamanho() -1 ;
        int contador = 0;

        while (inicio <= fim) {
            contador++;

            int estimativa = inicio + ((alvo - vetor.ler(inicio)) * (fim - inicio)) / (vetor.ler(fim) - vetor.ler(inicio));

            if (vetor.ler(estimativa) == alvo){
                System.out.println("    - Contador: " + (contador));
                long fimExecucao = System.nanoTime();
                double duracaoMs = (fimExecucao - inicioExecucao) / 1_000_000.0;
                System.out.println("    - Tempo: " + duracaoMs + " ms");
                return estimativa;
            }else if (alvo > vetor.ler(estimativa)){
                inicio = estimativa + 1;
            } else {
                fim = estimativa - 1;
            }
        }

        return -1;
    }


}

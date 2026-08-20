package ads.esd.testes;

import ads.esd.Vetor;

import java.util.Random;

public class ex13 {
    public static void main(String[] args) {
        Vetor<Integer> vetorP = new Vetor<>(1000);
        Vetor<Integer> vetorM = new Vetor<>(10000);
        Vetor<Integer> vetorG = new Vetor<>(100000);


        for (int i = 0; i < 1000; i++) {
            vetorP.inserir(i);
            vetorM.inserir(i);
            vetorG.inserir(i);
        }

        for (int i = 1000; i < 10000; i++) {
            vetorM.inserir(i);
            vetorG.inserir(i);
        }

        for (int i = 10000; i < 100000; i++) {
            vetorG.inserir(i);
        }

    }

    public static int buscarLinear(Vetor<Integer> vetor, int alvo){
        for (int i = 0; i < vetor.getTamanho(); i++) {
            if (vetor.ler(i) == alvo){
                return i;
            }
        }
        return -1;
    }

    public static int buscarBinaria(Vetor<Integer> vetor, int alvo){
        int inicio = 0;
        int fim = vetor.ler(10); // arrumar

//        while ()

        return -1;
    }


}

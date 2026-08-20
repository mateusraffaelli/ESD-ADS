package ads.esd.testes;

import ads.esd.Vetor;

import java.util.Random;

public class ex12 {

    public static void main(String[] args) {
        Vetor<Integer> vetor = new Vetor<>(10);

        vetor.inserir(10);
        vetor.inserir(20);
        vetor.inserir(30);
        vetor.inserir(40);
        vetor.inserir(50);
        vetor.inserir(60);
        vetor.inserir(70);
        vetor.inserir(80);
        vetor.inserir(90);
        vetor.inserir(100);
        vetor.imprimir();
        System.out.println(buscarLinear(vetor, 50));
        System.out.println(buscarBinaria(vetor, 50));

    }

    public static void inserirAleatorio(Vetor<Integer> vetor, int quantidade, int range) {

        Random aleatorio = new Random();
        while (vetor.getTamanho() < quantidade) {
            int numeroSorteado = aleatorio.nextInt(range);
//          vetor.inserirOrdenadov2(numeroSorteado);
            vetor.inserir(numeroSorteado);
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

    public static int buscarLinearOrdenada(Vetor<Integer> vetor, int alvo){
        for (int i = 0; i < vetor.getTamanho(); i++) {
            if (vetor.ler(i) == alvo){
                return i;
            }else if(vetor.ler(i) > alvo){
                return -1;
            }
        }
        return -1;
    }

    public static int buscarBinaria(Vetor<Integer> vetor, int alvo){
        int inicio = 0;
        int fim = vetor.getTamanho();

        while (inicio <= fim){
            int meio = (inicio + fim)/2;

            if (vetor.ler(meio) == alvo){
                return meio;
            } else if (vetor.ler(meio) > alvo) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }
        return -1;
    }


}


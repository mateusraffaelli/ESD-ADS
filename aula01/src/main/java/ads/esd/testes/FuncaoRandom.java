package ads.esd.testes;

import ads.esd.Vetor;

import java.util.Random;

public class FuncaoRandom {
    private Vetor<Integer> inteiros;
    private int[] numerosAleatorios;

    public FuncaoRandom(int tamanhoDoVetor) {
        this.inteiros = new Vetor<>(tamanhoDoVetor);
        this.numerosAleatorios = new int[tamanhoDoVetor];
        gerarNumeroAleatorio();

    }

    private void gerarNumeroAleatorio(){
        Random random = new Random(100);
        int quantidade = 0;

        while (quantidade < numerosAleatorios.length){
            int n = random.nextInt();

            if (!repetido(n)){
                ordenarVetor(n);
                quantidade++;
            }
        }
    }

    private void ordenarVetor(int n){
        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 1; j < numerosAleatorios.length; j++) {
                if (numerosAleatorios[i] < numerosAleatorios[j] || j == numerosAleatorios.length){
                    int numeroMaior = numerosAleatorios[j];
                    inteiros.remover(i);
                    inteiros.inserir(n);
                    inteiros.inserir(numeroMaior);
                }else{
                    inteiros.inserir(n);
                }
            }
        }
    }

    private boolean repetido(int n){
        for (int i = 0; i < numerosAleatorios.length; i++) {
            if (n != numerosAleatorios[i]) {
                return true;
            }
        }
        return false;
    }

    public void getInteiros() {
        inteiros.imprimir();
    }
}

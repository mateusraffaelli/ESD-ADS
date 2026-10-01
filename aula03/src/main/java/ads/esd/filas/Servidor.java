package ads.esd.filas;

import java.util.Random;

public class Servidor {
    private int totalReqGeradas;
    private int totalReqAtendidas;
    private int totalReqPerdidas;
    private Random aleatorio;
    private Fila<String> fila;
    private int numProcessadores;
    private int N;
    private int novasReq;

    public Servidor(int capacidade, int numProcessadores, int N) {
        this.fila = new Fila<>(capacidade);
        this.numProcessadores = numProcessadores;
        this.N = N;

        this.aleatorio = new Random();
        this.totalReqPerdidas  = 0;
        this.totalReqAtendidas = 0;
        this.totalReqGeradas = 0;
    }

    public void executar(int ciclos){
        for (int ciclo = 0; ciclo < ciclos; ciclo++) {

            novasReq = aleatorio.nextInt(1, N);
            adicionar(novasReq);

            for (int i = 0; i < numProcessadores; i++) {
                if (!fila.isEmpty()){
                    fila.desenfileirar();
                    totalReqAtendidas++;
                }
            }
        }


    }


    public void adicionar(int requisicoes){

        for (int i = 0; i < requisicoes; i++) {
            if (fila.isCheia()){
                totalReqPerdidas++;
            }else {
                fila.enfileirar("A");
            }
            totalReqGeradas++;
        }

    }

    @Override
    public String toString() {
        return "\ntotalReqPerdidas = " + totalReqPerdidas +
                "\ntotalReqAtendidas = " + totalReqAtendidas +
                "\ntotalReqGeradas = " + totalReqGeradas +
                "\nnovasReq = " + novasReq;
    }
}

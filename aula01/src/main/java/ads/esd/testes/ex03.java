package ads.esd.testes;

import ads.esd.VetorEstatico;

public class ex03 {
    public static void main(String[] args) {
        VetorEstatico vetor = new VetorEstatico(10);
        vetor.inserir("A");
        vetor.inserir("B");
        vetor.inserir("C");
        vetor.inserir("F");
//        System.out.println(vetor.getTamanho());
//        vetor.removerFinal();
//        System.out.println(vetor.getTamanho());

        vetor.imprimir();
    }
}

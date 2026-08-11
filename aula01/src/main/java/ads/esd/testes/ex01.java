package ads.esd.testes;

import ads.esd.VetorEstatico;

public class ex01 {
    static void main() {
        VetorEstatico vetor = new VetorEstatico(3);
        vetor.inserir("A");
        vetor.inserir("B");
        vetor.inserir("C");
        vetor.inserir("D");

        vetor.imprimir();
    }

}

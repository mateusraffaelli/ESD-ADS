package ads.esd.testes;

import ads.esd.VetorEstatico;

public class ex02 {
    static void main() {
        VetorEstatico vetor = new VetorEstatico(10);
        vetor.inserir("A");
        vetor.inserir("B");
        vetor.inserir("C");
        vetor.inserir("F");
        vetor.inserir(2, "W");
        vetor.imprimir();
    }
}

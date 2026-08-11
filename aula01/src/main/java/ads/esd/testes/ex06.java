package ads.esd.testes;

import ads.esd.VetorDinamico;

public class ex06 {
    public static void main(String[] args) {
        VetorDinamico vetor = new VetorDinamico(2);

        vetor.inserir("Ana");
        vetor.inserir("Ana");
        vetor.imprimir();

        // expandir
        vetor.inserir("Ana");
        vetor.imprimir();
        vetor.inserir("Ana");
        vetor.inserir("Ana");
        vetor.inserir("Ana");

        // expandir
        vetor.inserir("Ana");
        vetor.imprimir();
    }
}

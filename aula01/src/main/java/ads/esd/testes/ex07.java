package ads.esd.testes;

import ads.esd.VetorDinamico;

public class ex07 {

    static void main() {

        VetorDinamico vetor = new VetorDinamico(2);


        vetor.inserir("Ana");
        vetor.inserir("Ana");
        vetor.inserir("Ana");
        vetor.inserir("Ana");
        vetor.inserir("Ana");
        vetor.inserir("Ana");
        vetor.imprimir();

        vetor.remover(5);
        vetor.remover(4);
        vetor.remover(3);
        vetor.remover(2);
        vetor.remover(1);
        vetor.remover(0);
        vetor.imprimir();



    }
}


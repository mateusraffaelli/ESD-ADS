package ads.esd.testes;

import ads.esd.VetorObjeto;

public class ex08 {
    public static void main(String[] args) {
        VetorObjeto vetor = new VetorObjeto(10);

        vetor.inserir("Teste");
        vetor.inserir(100);
        vetor.inserir(1.99);

        String palavra = (String) vetor.ler(0);
        int numero = (Integer) vetor.ler(1);
        double preco = (Double) vetor.ler(2);

        String price = (String) vetor.ler(2);
    }
}

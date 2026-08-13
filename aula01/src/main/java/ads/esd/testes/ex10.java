package ads.esd.testes;

import ads.esd.Produto;
import ads.esd.Vetor;

public class ex10 {

    public static void main(String[] args) {
        Vetor<Produto> estoque = new Vetor<>(10);

        estoque.inserir(new Produto(1, "Monitor", 500));
        estoque.inserir(new Produto(2, "Teclado", 100));
        estoque.inserir(new Produto(3, "Mouse", 50));


        estoque.imprimir();
    }
}

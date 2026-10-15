import java.util.Arrays;

/** Missao 1. Edite apenas esta classe. Capacidade fixa, vetor compacto. */
public class Inventario {
    private final int[] dados;
    private int tamanho;

    public Inventario(int capacidade) {
        if (capacidade <= 0) throw new IllegalArgumentException("capacidade deve ser positiva");
        dados = new int[capacidade];
    }
    public int tamanho() { return tamanho; }
    public int capacidade() { return dados.length; }
    public int[] itens() { return Arrays.copyOf(dados, tamanho); }

    public void inserir(int indice, int valor) {
        if (indice < 0 || indice > tamanho) throw new IndexOutOfBoundsException("indice invalido");
        if (tamanho == dados.length) throw new IllegalStateException("inventario cheio");
        // Desloque sem perder os valores anteriores.
        for (int i = tamanho; i > indice; i--) {
            dados[i] = dados[i - 1];
        }
        dados[indice] = valor;
        tamanho++;
    }
    public int remover(int indice) {
        if (indice < 0 || indice >= tamanho) throw new IndexOutOfBoundsException("indice invalido");
        // Criar exceções
        int removido = dados[indice];

        for (int i = indice; i < tamanho; i++) {
            dados[i] = dados[i + 1];
        }
        tamanho--;
        return removido;
    }
}

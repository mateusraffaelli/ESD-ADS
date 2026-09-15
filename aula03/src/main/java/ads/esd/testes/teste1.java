package ads.esd.testes;

import ads.esd.Pilha;

public class teste1 {
    static void main() {
        Pilha<Integer> pilha = new Pilha<>(10);
        System.out.println("A pilha está vazia" + pilha.isEmpty());

        // inserindo dados

        pilha.push(10);
        pilha.push(11);
        pilha.push(12);
        pilha.push(13);
        pilha.push(14);

        System.out.println("A pilha está vazia" + pilha.isEmpty());

        // Removendo dados
        pilha.pop();
        int valor = pilha.pop();
        System.out.println("SSegundo valor desempilhado");
        pilha.pop();
        pilha.pop();
        pilha.pop();
        pilha.pop();
    }
}

package ads.esd;

import java.util.Arrays;public class Agenda {
    private ListaContatos[] listaAlfabetica;

    public Agenda() {
        listaAlfabetica = new ListaContatos[26];

        for (int i = 0; i < listaAlfabetica.length; i++) {
            listaAlfabetica[i] = new ListaContatos(0);
        }
    }

    private int recebeNome(Contato contato) {
        char primeiraLetra = contato.getNome().toUpperCase().charAt(0);
        switch (primeiraLetra) {
            case 'A':
                return 0;
            case 'B':
                return 1;
            case 'C':
                return 2;
            case 'D':
                return 3;
            case 'E':
                return 4;
            case 'F':
                return 5;
            case 'G':
                return 6;
            case 'H':
                return 7;
            case 'I':
                return 8;
            case 'J':
                return 9;
            case 'K':
                return 10;
            case 'L':
                return 11;
            case 'M':
                return 12;
            case 'N':
                return 13;
            case 'O':
                return 14;
            case 'P':
                return 15;
            case 'Q':
                return 16;
            case 'R':
                return 17;
            case 'S':
                return 18;
            case 'T':
                return 19;
            case 'U':
                return 20;
            case 'V':
                return 21;
            case 'W':
                return 22;
            case 'X':
                return 23;
            case 'Y':
                return 24;
            case 'Z':
                return 25;
            default:
                return -1;
        }
    }

    private int recebeNome(String nome) {
        char primeiraLetra = nome.toUpperCase().charAt(0);
        switch (primeiraLetra) {
            case 'A':
                return 0;
            case 'B':
                return 1;
            case 'C':
                return 2;
            case 'D':
                return 3;
            case 'E':
                return 4;
            case 'F':
                return 5;
            case 'G':
                return 6;
            case 'H':
                return 7;
            case 'I':
                return 8;
            case 'J':
                return 9;
            case 'K':
                return 10;
            case 'L':
                return 11;
            case 'M':
                return 12;
            case 'N':
                return 13;
            case 'O':
                return 14;
            case 'P':
                return 15;
            case 'Q':
                return 16;
            case 'R':
                return 17;
            case 'S':
                return 18;
            case 'T':
                return 19;
            case 'U':
                return 20;
            case 'V':
                return 21;
            case 'W':
                return 22;
            case 'X':
                return 23;
            case 'Y':
                return 24;
            case 'Z':
                return 25;
            default:
                return -1;
        }
    }

    public void adicionarContato(Contato contato) {
        int indice = recebeNome(contato);
        listaAlfabetica[indice].adicionarContato(contato);
    }

    public void buscarContato(String atributo) {
        int indice = recebeNome(atributo);
        listaAlfabetica[indice].buscarContato(atributo);
    }

    public void removerContato(Contato contato) {
        int indice = recebeNome(contato);
        listaAlfabetica[indice].removerContato(contato);
    }

    public void atualizarContato(Contato contato) {
        int indice = recebeNome(contato);
        listaAlfabetica[indice].atualizarContato(contato);
    }
}
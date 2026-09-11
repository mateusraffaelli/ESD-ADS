package ads.esd;

public class Agenda {
    private ListaContatos[] listaAlfabetica;

    public Agenda() {
        listaAlfabetica = new ListaContatos[26];

        for (int i = 0; i < listaAlfabetica.length; i++) {
            listaAlfabetica[i] = new ListaContatos(0);
        }
    }

    public int descobreIndice(String nome) {
        char primeiraLetra = nome.toUpperCase().charAt(0);
        int indice = 0;

        for (int i = 0; i < 26; i++) {
            if (i == primeiraLetra - 65){
                indice = i;
            }
        }
        return indice;
    }

    public int descobreIndice(char primeiraLetra) {
        int indice = 0;

        for (int i = 0; i < 26; i++) {
            if (i == primeiraLetra - 65){
                indice = i;
            }
        }
        return indice;
    }

    public boolean adicionarContato(String nome, String telefone, int indice) {
        return listaAlfabetica[indice].adicionarContato(nome, telefone);
    }

    public boolean buscarContato(String nome, int indice) {
        return listaAlfabetica[indice].buscarContato(nome);
    }

    public boolean removerContato(String nome, int indice) {
        return listaAlfabetica[indice].removerContato(nome);
    }

    public boolean atualizarContato(String nome, String telefone, int indice) {
        return listaAlfabetica[indice].atualizarContato(nome, telefone);
    }
}
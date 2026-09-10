package ads.esd;

public class Agenda {
    private Vetor<ListaContatos>[] listaAlfabetica;

    public Agenda() {
        listaAlfabetica = new Vetor[26];

        for (int i = 0; i < listaAlfabetica.length; i++) {
            listaAlfabetica[i] = new Vetor<>(0);
        }


        // A = 0
        // B = 1
        // C = 2
        // ...
        // Z = 25
    }


}

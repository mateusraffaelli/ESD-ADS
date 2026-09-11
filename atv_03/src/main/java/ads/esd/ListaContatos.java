package ads.esd;

public class ListaContatos {
    private Vetor<Contato> contatos;

    public ListaContatos(int quantidade) {
        this.contatos = new Vetor<>(quantidade);
    }

    public boolean adicionarContato(String nome, String telefone){
        for (int i = 0; i < contatos.getTamanho(); i++) {
            if (buscarIgual(nome)){
                // Contato já existe
                return false;
            }
        }

        Contato contato = new Contato(nome, telefone);
        contatos.inserir(contato);
        return true;
    }

    private boolean buscarIgual(String atributo){
        for (int i = 0; i < contatos.getTamanho(); i++) {
            if (contatos.get(i).getNome().equals(atributo) || contatos.get(i).getTelefone().equals(atributo)) {
                return true;
            }
        }
        return false;
    }

    public boolean removerContato(String nome){
        for (int i = 0; i < contatos.getTamanho(); i++) {
            if (buscarIgual(nome)) {
                contatos.remover(i);
                return true;
            }
        }
        return false;
    }

    public boolean buscarContato(String atributo){
        int contador = 0;

        for (int i = 0; i < contatos.getTamanho(); i++) {
            if (contatos.get(i).getNome().startsWith(atributo) || contatos.get(i).getTelefone().startsWith(atributo)) {
                System.out.println(contatos.get(i));
                contador++;
            }
        }
        if (contador == 0){
            //Contato não encontrado
            return false;
        }
        return true;
    }

    public boolean atualizarContato(String nome, String telefone){
        for (int i = 0; i < contatos.getTamanho(); i++) {
            if (nome.equals(contatos.get(i).getNome()) || telefone.equals(contatos.get(i).getTelefone())) {
                //Contato encontrado
                contatos.get(i).setTelefone(telefone);
                return true;
            }
        }
        return false;
    }
}

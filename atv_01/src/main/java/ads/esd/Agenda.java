package ads.esd;


import java.util.Scanner;

public class Agenda {
    Scanner scanner = new Scanner(System.in);
    private Vetor<Contato> contatos;


    public Agenda(int tamanhoVetor) {
        this.contatos = new Vetor(tamanhoVetor);
    }

    public void adicionarContato(Contato contato){
        for (int i = 0; i < contatos.getTamanho(); i++) {
            if (buscarIgual(contato.getNome()) || buscarIgual(contato.getTelefone())){
                System.out.println("Contato já existe");
                return;
            }
        }

        contatos.inserir(contato);
    }

    public void adicionarContato(Contato[] lote){
        for (Contato contato : lote) {
            adicionarContato(contato);
        }
    }


    private boolean buscarIgual(String atributo){
        for (int i = 0; i < contatos.getTamanho(); i++) {
            if (contatos.get(i).getNome().equals(atributo) || contatos.get(i).getTelefone().equals(atributo)) {
                return true;
            }
        }
        return false;
    }

    public void removerContato(Contato contato){
        for (int i = 0; i < contatos.getTamanho(); i++) {
            if (buscarIgual(contato.getNome()) || buscarIgual(contato.getTelefone())) {
                contatos.remover(i);
                System.out.println("Contato excluído");
                return;
            }
        }
    }

    public void buscarContato(String atributo){
        int contador = 0;
        System.out.println("Resultado busca por: " + atributo);

        for (int i = 0; i < contatos.getTamanho(); i++) {
            if (contatos.get(i).getNome().startsWith(atributo) || contatos.get(i).getTelefone().startsWith(atributo)) {
                System.out.println(contatos.get(i));
                contador++;
            }
        }
        if (contador == 0){
            System.out.println("Contato não encontrado");
        }
    }

    public void atualizarContato(Contato contato){
        for (int i = 0; i < contatos.getTamanho(); i++) {
            if (contato.getNome().equals(contatos.get(i).getNome()) || contato.getTelefone().equals(contatos.get(i).getTelefone())) {
                System.out.println("Contato encontrado:");
                System.out.println(contatos.get(i));

                System.out.println("Qual dado você deseja atualizar? (n | t | e)");
                String msg = scanner.next();
                System.out.println("Novo cadastro:");
                String rsp = scanner.next();
                switch (msg) {
                    case "n":
                        contatos.get(i).setNome(rsp);
                        break;
                    case "t":
                        contatos.get(i).setTelefone(rsp);
                        break;
                    case "e":
                        contatos.get(i).setEmail(rsp);
                        break;
                    default:
                        System.out.println("Opção inválida");
                        return;
                }
                System.out.println("Contato atualizado com sucesso");
                System.out.println(contatos.get(i));
                return;
            }
        }
    }

    public void listar(){
        System.out.println("=== LISTA DE CONTATOS ===");
        contatos.imprimir();
    }
}

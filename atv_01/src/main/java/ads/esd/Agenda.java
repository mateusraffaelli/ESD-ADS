package ads.esd;


import java.util.Scanner;

public class Agenda {
    Scanner scanner = new Scanner(System.in);
    private Contato contatos[];
    private int tamanho;

    public Agenda(int tamanhoVetor) {
        this.contatos = new Contato[tamanhoVetor];
        this.tamanho = 0;
    }

    public void adicionar(Contato contato){
        if (tamanho >= contatos.length) {
            System.out.println("Agenda cheia!");
            return;
        }

        for (int i = 0; i < tamanho; i++) {
            if (contato.getNome().equals(contatos[i].getNome()) || contato.getTelefone().equals(contatos[i].getTelefone())){
                System.out.println("Contato já existe");
                return;
            }
        }

        contatos[tamanho] = contato;
        tamanho++;

    }

    public void remover(Contato contato){
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] != null && (contato.getNome().equals(contatos[i].getNome()) || contato.getTelefone().equals(contatos[i].getTelefone()))) {
                contatos[i] = null;
                tamanho--;
                System.out.println("Contato excluído");
                return;
            }
        }
    }

    public void buscar(String atributo){
        int contador = 0;
        System.out.println("Resultado busca por: " + atributo);

        for (Contato contato : contatos) {
            if (contato.getNome().startsWith(atributo) || contato.getTelefone().startsWith(atributo)) {
                System.out.println(contato);
                contador++;
            }
        }
        if (contador == 0){
            System.out.println("Contato não encontrado");
        }
    }

    public void atualizar(Contato contato){
        for (Contato c : contatos) {
            if (contato.getNome().equals(c.getNome()) || contato.getTelefone().equals(c.getTelefone())) {
                System.out.println("Contato encontrado:");
                System.out.println(c);

                System.out.println("Qual dado você deseja atualizar? (n | t | e)");
                String msg = scanner.next();
                System.out.println("Novo cadastro:");
                String rsp = scanner.next();
                switch (msg) {
                    case "n":
                        c.setNome(rsp);
                        break;
                    case "t":
                        c.setTelefone(rsp);
                        break;
                    case "e":
                        c.setEmail(rsp);
                        break;
                    default:
                        System.out.println("Opção inválida");
                        return;
                }
                System.out.println("Contato atualizado com sucesso");
                System.out.println(c);
                return;
            }
        }
    }

    public void listar(){
        System.out.println("=== LISTA DE CONTATOS ===");
        for (Contato contato : contatos) {
            if (contato == null){
                System.out.println("Espaço vazio");
            }else{
                System.out.println(contato);
            }
        }
    }
}

package ads.esd;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda(6);

        Contato c1 = new Contato("Ana", "(11) 98765-4321", "ana@email.com");
        Contato c2 = new Contato("Carlos", "(21) 91234-5678", "carlos@email.com");
        Contato c3 = new Contato("Mariana", "(31) 99888-7766", "mariana@email.com");
        Contato c4 = new Contato("João Pedro", "(41) 97777-2233", "joao.pedro@email.com");
        Contato c5 = new Contato("Beatriz", "(51) 93333-4455", "beatriz@email.com");

        agenda.adicionarContato(c1);
        agenda.adicionarContato(c2);
        agenda.adicionarContato(c3);
        agenda.adicionarContato(c4);
        agenda.adicionarContato(c5);

        Contato c6 = new Contato("Ana Laura", "(12) 98765-4321", "analaura@email.com");
        agenda.adicionarContato(c6);

        agenda.removerContato(c1);
        agenda.removerContato(c4);
        agenda.removerContato(c5);

        Contato[] lote = {
                new Contato("João Pedro", "(41) 97777-2233", "joao.pedro@email.com"),
                new Contato("Beatriz", "(51) 93333-4455", "beatriz@email.com")
        };

        agenda.adicionarContato(lote);

        agenda.buscarContato("João Pedro");
        agenda.buscarContato("(21) 91234-5678");
        agenda.buscarContato("Ana ");

        agenda.atualizarContato(c5);
        agenda.listar();




    }
}
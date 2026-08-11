package ads.esd;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda(6);

        Contato c1 = new Contato("Ana", "(11) 98765-4321");
        Contato c2 = new Contato("Carlos", "(21) 91234-5678", "carlos@email.com");
        Contato c3 = new Contato("Mariana", "(31) 99888-7766");
        Contato c4 = new Contato("João Pedro", "(41) 97777-2233", "joao.pedro@email.com");
        Contato c5 = new Contato("Beatriz", "(51) 93333-4455", "beatriz@email.com");

        agenda.adicionar(c1);
        agenda.adicionar(c2);
        agenda.adicionar(c3);
        agenda.adicionar(c4);
        agenda.adicionar(c5);

        Contato c6 = new Contato("Ana", "(12) 98765-4321", "analaura@email.com");
        agenda.adicionar(c6);


//        Contato[] lote = {
//            new Contato("João Pedro", "(41) 97777-2233", "joao.pedro@email.com"),
//            new Contato("Beatriz", "(51) 93333-4455", "beatriz@email.com")
//        };

//        agenda.adicionar(lote);

        agenda.remover(c1);
        agenda.remover(c2);
        agenda.remover(c3);

        agenda.adicionar(c1);

//        agenda.buscar("João Pedro");
//        agenda.buscar("(21) 91234-5678");
        // agenda.buscar("Ana");

        // agenda.atualizar(c5);
        agenda.listar();




    }
}
package ads.esd;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();

        int i;
        do {
            sb.append("\"--- MENU DA AGENDA DE CONTATOS ---\"");
            sb.append("\n1 - Adicionar Contato (Ordenado)").append("\n2 - Remover Contato");
            sb.append("\n3 - Buscar Contato").append("\n4 - Atualizar Contato").append("\n5 - Sair").append("\nEscolha uma opcao: ");
            i = scanner.nextInt();
        }while (i != 5);

        System.out.println(sb);
        switch (i){
            case 1: {
                System.out.println("Digite o nome do contato:");
                String nomeContato = scanner.nextLine();
                System.out.println("Digite o telefone");
                String telefone = scanner.nextLine();

                Contato contato = new Contato(nomeContato, telefone);
                agenda.adicionarContato(contato);


                // Ou não
                System.out.println("Contato "+ nomeContato +" adicionado com sucesso na letra 'A' (Indice 0)!");
            }
            case 2:{
                System.out.println("Digite o nome do contato a remover:");
                String nomeContato = scanner.nextLine();

//                agenda.removerContato(); fazer um remover por nome

                // Ou não
                System.out.println("Contato "+ nomeContato + " removido com sucesso do Vetor 'A'!");
            }
            case 3: {
                System.out.println("Digite o nome do contato a buscar:");
                String nomeContato = scanner.nextLine();

                agenda.buscarContato(nomeContato);

                // Ou não
                System.out.println("Contato encontrado no Vetor 'A':" );
            }
            case 4:{
                System.out.println("Digite o nome do contato a atualizar:");
                String nomeContato = scanner.nextLine();
                System.out.println("Digite o novo telefone:");
                String telefone = scanner.nextLine();

//                agenda.atualizarContato(); fazer um atualizar por nome

                // Ou não
                System.out.println("Contato "+ nomeContato +" atualizado com sucesso!");
            }
        }
    }
}
package ads.esd;

import java.util.Scanner;

public class Main {
     static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();

        int i;
        do {
            System.out.println("\n--- MENU DA AGENDA DE CONTATOS ---" +
                    "\n1 - Adicionar Contato (Ordenado)" +
                    "\n2 - Remover Contato"+
                    "\n3 - Buscar Contato"+
                    "\n4 - Atualizar Contato"+
                    "\n5 - Sair");
            System.out.print("\nEscolha uma opcao: ");
            i = scanner.nextInt();

            switch (i){
                case 1: {
                    scanner.nextLine();
                    System.out.print("\nDigite o nome do contato: ");
                    String nomeContato = scanner.nextLine();
                    System.out.print("Digite o telefone: ");
                    String telefone = scanner.nextLine();

                    char primeiraLetra = nomeContato.toUpperCase().charAt(0);
                    int indice = agenda.descobreIndice(primeiraLetra);
                    // Erro se não for um nome

                    if (agenda.adicionarContato(nomeContato, telefone, indice)){
                        System.out.println("Contato '"+ nomeContato +"' adicionado com sucesso na letra '"+ primeiraLetra + "' (Indice "+ indice +")!");
                    }else{
                        System.out.println("Erro");
                    }

                }break;
                case 2: {
                    scanner.nextLine();
                    System.out.print("Digite o nome do contato a remover: ");
                    String nomeContato = scanner.nextLine();

                    char primeiraLetra = nomeContato.toUpperCase().charAt(0);
                    int indice = agenda.descobreIndice(primeiraLetra);


                    if (agenda.removerContato(nomeContato, indice)) {
                        System.out.println("Contato '" + nomeContato + "' removido com sucesso do Vetor '" + primeiraLetra + "'!");
                    }else{
                        System.out.println("Erro");
                    }
                }break;
                case 3: {
                    scanner.nextLine();
                    System.out.print("Digite o nome do contato a buscar: ");
                    String nomeContato = scanner.nextLine();

                    char primeiraLetra = nomeContato.toUpperCase().charAt(0);
                    int indice = agenda.descobreIndice(primeiraLetra);

                    System.out.println("Resultado da busca no Vetor '" + primeiraLetra + "':");
                    if (!agenda.buscarContato(nomeContato, indice)) {
                        System.out.println("Erro");
                    }

                }break;
                case 4:{
                    scanner.nextLine();
                    System.out.print("Digite o nome do contato a atualizar: ");
                    String nomeContato = scanner.nextLine();
                    System.out.print("Digite o novo telefone: ");
                    String telefone = scanner.nextLine();

                    char primeiraLetra = nomeContato.toUpperCase().charAt(0);
                    int indice = agenda.descobreIndice(primeiraLetra);


                    if (agenda.atualizarContato(nomeContato, telefone, indice)) {
                        System.out.println("Contato '" + nomeContato + "' atualizado com sucesso!");
                    }else{
                        System.out.println("Erro");
                    }
                }break;
                case 5:{
                    System.out.println("Sistma encerrado");
                }break;
                default:{
                    System.out.println("Número inválido");
                    break;
                }
            }
        }while (i != 5);

    }
}
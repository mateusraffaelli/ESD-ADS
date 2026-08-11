package ads.esd;

import java.util.ArrayList;import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean finalizado;

        Funcionario funcionario1 = new Funcionario("Julio", 2000);
        Funcionario funcionario2 = new Funcionario("Lucas", 2500);
        Funcionario funcionario3 = new Funcionario("Lucas", 3000);

        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(funcionario1);
        funcionarios.add(funcionario2);
        funcionarios.add(funcionario3);

        Gerente gerente = new Gerente("Notch", 7000, funcionarios.size());


        System.out.println("O projeto está finalizado? (s/n)");
        String rsp = scanner.next();
        if (rsp.equalsIgnoreCase("s")){
            finalizado = true;
        }else {
            finalizado = false;
        }

        Projeto projeto = new Projeto("Minecraft Java", gerente, funcionarios, finalizado);

        System.out.println(projeto);

        scanner.close();

    }
}

package ads.esd;

import java.util.Scanner;

public class Main {
    static void main() {
        Labirinto labirinto = new Labirinto();

        while (!labirinto.verificarPosicao()){
            labirinto.imprimir();
            IO.readln("Digite ENTER para continuar");
        }
        labirinto.imprimir();
        System.out.println("Final encontrado");
    }
}

package ads.esd;

import java.util.Scanner;

public class Main {
    static void main() {
        Labirinto labirinto = new Labirinto();

        while (!labirinto.caminhoPossivel()){
            labirinto.imprimir();
            IO.readln("Digite ENTER para continuar");


        }

    }
}

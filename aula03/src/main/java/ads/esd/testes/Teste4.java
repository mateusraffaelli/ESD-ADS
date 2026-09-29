package ads.esd.testes;

import ads.esd.filas.Servidor;

public class Teste4 {
    static void main() {
        Servidor servidor = new Servidor(100, 4, 70);
        servidor.executar(10);
        System.out.println(servidor);
    }
}

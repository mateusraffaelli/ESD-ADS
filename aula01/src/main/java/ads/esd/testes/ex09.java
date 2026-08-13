package ads.esd.testes;

import ads.esd.Caixa;

public class ex09 {
    public static void main(String[] args) {
        Caixa<String> caixaTexto = new Caixa<>();
        caixaTexto.guardar("Olá mundo");
        System.out.println(caixaTexto.abrir());

        Caixa<Integer> caixaNumero = new Caixa<>();
        caixaNumero.guardar(50);
        System.out.println(caixaNumero.abrir());
    }
}

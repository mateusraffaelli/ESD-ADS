package ads.esd;

import java.util.ArrayList;

public class Main {
    static void main() {

        Cliente cliente1 = new Cliente("Julio", "122.323.599-00", "(21)99813-4848");
        Cliente cliente2 = new Cliente("Amanda", "009.953.232-21", "(48)98813-3838");

        Imovel imovel1 = new Imovel("Imóvel à venda", "Av. da Saudade, 590", 1000);
        Imovel imovel2 = new Imovel("Imóvel à venda", "Av. Paulista, 43", 2000);

        Contrato contrato1 = new Contrato("29/07/2026", "31/12/2027", 16000, cliente1, imovel1);
        Contrato contrato2 = new Contrato("01/01/2028", "01/01/2029", 24000, cliente1, imovel2);


        System.out.println(contrato1.exibirNomeInquilino());
        System.out.println(contrato1.exibirDetalhesImovel());
        System.out.println(cliente1.exibirHistorico());

    }
}

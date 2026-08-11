package ads.esd;

import java.util.Random;

public class Contrato {
    private int codigo;
    private String dataInicio;
    private String dataFinal;
    private double valorFinal;
    private Cliente cliente;
    private Imovel imovel;

    public Contrato(String dataInicio, String dataFinal, double valorFinal, Cliente cliente, Imovel imovel) {
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
        this.valorFinal = valorFinal;
        this.cliente = cliente;
        this.imovel = imovel;
        this.codigo = gerarCodigoAleatorio();

        this.cliente.adicionarContrato(this);
    }

    private int gerarCodigoAleatorio(){
        Random random = new Random();
        int centena = random.nextInt(10);
        int dezena = random.nextInt(10);
        int unidade = random.nextInt(10);
        return (centena*100) + (dezena*10) + unidade;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public String getDataFinal() {
        return dataFinal;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public int getCodigo() {
        return codigo;
    }

    public String exibirDetalhesImovel(){
        StringBuilder sb = new StringBuilder();
        sb.append("Detalhes do imóvel: ").append(imovel.getDescricao());
        return sb.toString();
    }

    public String exibirNomeInquilino(){
        StringBuilder sb = new StringBuilder();
        sb.append("Nome Inquilino: ").append(cliente.getNome());
        return sb.toString();
    }
}

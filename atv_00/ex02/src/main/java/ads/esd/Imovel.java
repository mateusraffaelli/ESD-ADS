package ads.esd;

public class Imovel {
    private String descricao;
    private String endereco;
    private double precoAluguel;

    public Imovel(String descricao, String endereco, double precoAluguel) {
        this.descricao = descricao;
        this.endereco = endereco;
        this.precoAluguel = precoAluguel;
    }

    public String getDescricao() {
        return descricao;
    }
}

package ads.esd;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String cpf;
    private String telefone;
    private ArrayList<Contrato> contratos;

    public Cliente(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.contratos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarContrato(Contrato contrato){
        contratos.add(contrato);
    }

    public String exibirHistorico(){
        StringBuilder sb = new StringBuilder();
        for (Contrato c : contratos){
            sb.append("\nCodigo: ").append(c.getCodigo());
            sb.append("\nData de início: ").append(c.getDataInicio());
            sb.append("\nData de Término: ").append(c.getDataFinal());
            sb.append("\nValor Final: R$").append(c.getValorFinal());
        }
        return sb.toString();
    }

}

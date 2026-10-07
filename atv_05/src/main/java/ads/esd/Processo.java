package ads.esd;

public class Processo implements Comparable<Processo> {
    private String nome;
    private int  instrucoesRestantes;
    private int tempoChegada;
    private String status;

    public Processo(String nome, int instrucoes, int tempoChegada) {
        this.nome = nome;
        this.instrucoesRestantes = instrucoes;
        this.tempoChegada = tempoChegada;
        this.status = "PRONTO";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getInstrucoesRestantes() {
        return instrucoesRestantes;
    }

    public void setInstrucoesRestantes(int instrucoesRestantes) {
        this.instrucoesRestantes = instrucoesRestantes;
    }

    public int getTempoChegada() {
        return tempoChegada;
    }

    public void setTempoChegada(int tempoChegada) {
        this.tempoChegada = tempoChegada;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int compareTo(Processo o) {
        return 0;
    }

    public void decrementarInstrucoes() {
        instrucoesRestantes--;
    }
}

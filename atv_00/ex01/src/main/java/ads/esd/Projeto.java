package ads.esd;

import java.util.ArrayList;

public class Projeto {
    private String nome;
    private Gerente gerente;
    private ArrayList<Funcionario> funcionarios;
    private double custo;

    public Projeto(String nome, Gerente gerente, ArrayList<Funcionario> funcionarios,  boolean finalizado) {
        this.nome = nome;
        this.gerente = gerente;
        this.funcionarios = funcionarios;

        gerente.calcularSalario(finalizado);

        for (Funcionario f : funcionarios) {
            f.calcularSalario(finalizado);
            this.custo += f.getSalarioFinal();
        }
        custo += gerente.getSalarioFinal();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Projeto: ").append(nome)
                .append("\nGerente: ").append(gerente.getNome())
                .append("\nSalário gerente: R$").append(gerente.getSalarioFinal());

        for (Funcionario f : funcionarios) {
            sb.append("\nFuncionario: ").append(f.getNome());
            sb.append("\nSalário: R$").append(f.getSalarioFinal());
        }

        sb.append("\nCusto total: R$").append(custo);

        return sb.toString();
    }
}

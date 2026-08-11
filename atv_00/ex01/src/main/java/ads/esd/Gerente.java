package ads.esd;

public class Gerente extends Funcionario{
    private double percentualBonus;

    public Gerente(String nome, double salarioBase, int numFuncionarios) {
        super(nome, salarioBase);
        this.percentualBonus = numFuncionarios * 0.01;
    }

    @Override
    public void calcularSalario(boolean finalizado) {
        double salario = getSalarioBase();

        salario += getSalarioBase() * percentualBonus;

        if (finalizado) {
            salario += getSalarioBase() * 0.10;
        }

        setSalarioFinal(salario);
    }
}

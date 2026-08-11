package ads.esd;

public class Funcionario {
    private String nome;
    private double salarioBase;
    private double salarioFinal;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.salarioFinal = salarioBase;
    }

    public void calcularSalario(boolean finalizado){
        salarioFinal = salarioBase;

        if (finalizado) {
            salarioFinal += salarioBase * 0.10;
        }
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getSalarioFinal() {
        return salarioFinal;
    }

    public void setSalarioFinal(double salarioFinal) {
        this.salarioFinal = salarioFinal;
    }
}



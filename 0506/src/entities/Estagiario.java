package entities;

public class Estagiario extends Funcionario{
    public Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() - 150;
    }
}

package application;

import entities.Estagiario;
import entities.Funcionario;
import entities.Gerente;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Pedro", 2500);
        Gerente gerente = new Gerente("Caio", 8000);
        Estagiario estagiario = new Estagiario("João", 1350);

        System.out.println(funcionario);
        System.out.println(gerente);
        System.out.println(estagiario);
    }
}

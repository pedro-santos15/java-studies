package application;

import entities.Estagiario;
import entities.Funcionario;
import entities.Gerente;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Caio", 8000);
        Estagiario estagiario = new Estagiario("João", 1350);

        System.out.println(gerente);
        System.out.println(estagiario);
    }
}

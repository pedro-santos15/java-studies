package application;

import entities.Calculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora.calcular(5, 2, '+');
        Calculadora.calcular(6, 3, '-');
        Calculadora.calcular(8, 2, '*');
        Calculadora.calcular(10, 2, '/');
        Calculadora.calcular(10, 0, '/');
    }
}

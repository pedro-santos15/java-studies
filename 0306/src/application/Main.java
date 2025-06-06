package application;

import entities.Calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //exemplo de utilização
        Calculadora.calcular(8, 2, '+');
        Calculadora.calcular(6, 3, '-');
        Calculadora.calcular(8, 2, '*');
        Calculadora.calcular(10, 2, '/');
        Calculadora.calcular(10, 0, '/'); //dando erro propositalmente

        //verificacao de entrada
        int entrada = 0;
        while (entrada == 0){
            try {
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                int b = sc.nextInt();
                Calculadora.calcular(a, b, '+');
                entrada = 1;
            } catch (InputMismatchException e){
                System.out.println("Favor informar uma entrada válida!");
            }
        }
    }
}

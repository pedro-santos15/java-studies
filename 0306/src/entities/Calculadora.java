package entities;


public class Calculadora {

    public static double soma(double a, double b) {
        return a + b;
    }

    public static double subtrai(double a, double b) {
        return a - b;
    }

    public static double multiplica(double a, double b) {
        return a * b;
    }

    public static double divisao(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Não é possível realizar divisão por zero");
        } else {
            return a / b;
        }
    }

    public static void calcular(double a, double b, char operacao) {
        switch (operacao) {
            case '+' -> System.out.printf("%.2f%n", soma(a, b));
            case '-' -> System.out.printf("%.2f%n", subtrai(a, b));
            case '*' -> System.out.printf("%.2f%n", multiplica(a, b));
            case '/' -> {
                try {
                    System.out.printf("%.2f%n", divisao(a, b));
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
            default -> System.out.println("Operação invalida!");
        }

    }
}

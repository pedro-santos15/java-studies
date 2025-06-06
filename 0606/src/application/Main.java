package application;

public class Main {
    public static void main(String[] args) {
        try {
            simularFalha();
        } catch (ArithmeticException e){
            System.out.println("Teste funcional de ArithmeticException.");
        }
    }

    public static void simularFalha(){
        throw new ArithmeticException();
    }
}

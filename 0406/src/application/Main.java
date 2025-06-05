package application;

import entities.Produto;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Nescau", 12.40, 3);
        System.out.println(produto);

        Produto produto2 = new Produto("Coca-Cola", 9.99, 5);
        System.out.println(produto2);
    }
}

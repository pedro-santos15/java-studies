package application;

import menu.Menu;

public class Main {
    public static void main(String[] args) {

        System.out.println("Bem vindo ao sistema de gestão de produtos");
        Menu menu = new Menu();
        menu.escolha();

    }
}

package services;

import entities.Produto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CadastroProdutos {

    public static void cadastroProdutos(){
        int entrada = 0;
        while (entrada == 0){
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Informe o nome do produto: ");
                String nome = sc.nextLine();
                System.out.print("Informe o preço do produto: ");
                double preco = sc.nextDouble();
                System.out.print("Informe a quantia em estoque do produto: ");
                int quantidade = sc.nextInt();
                Produto produto = new Produto(nome, preco, quantidade);
                entrada = 1;
            } catch (NullPointerException e){
                System.out.println("Por favor, digite todos os campos");
            } catch (InputMismatchException e){
                System.out.println("Por favor, digite uma entrada válida!");
            }
        }
        System.out.println("Produto cadastrado.");
    }
}

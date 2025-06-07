package services;

import entities.Produto;

import java.util.ConcurrentModificationException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class RemoverProdutos {

    public static void removerProdutos() {
        Scanner sc = new Scanner(System.in);
        ListarProdutos.listarProdutos();
        System.out.print("Digite o nome do produto que você deseja remover: ");
        try {
            String entradaNome = sc.nextLine();
            Produto.getProdutos().removeIf(produto -> produto.getNome().equalsIgnoreCase(entradaNome));
        } catch (InputMismatchException | NullPointerException e) {
            System.out.println("Por favor, digite uma entrada válida!");
            removerProdutos();
        } catch (ConcurrentModificationException e){
            System.out.println("Prosseguindo");
        }
    }
}

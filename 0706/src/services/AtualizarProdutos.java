package services;

import entities.Produto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AtualizarProdutos {

    public static void atualizarProdutos() {
        Scanner sc = new Scanner(System.in);
        ListarProdutos.listarProdutos();
        System.out.print("Digite o nome do produto que você deseja atualizar: ");

        try {
            String entradaNome = sc.nextLine();

            for (Produto produto : Produto.getProdutos()) {
                if (produto.getNome().equalsIgnoreCase(entradaNome)) {
                    System.out.println("O que você deseja atualizar?(nome, preco, quantidade)");
                    String entradaPesquisa = sc.nextLine();

                    switch (entradaPesquisa) {
                        case "nome" -> {
                            System.out.print("Digite o novo nome: ");
                            String nome = sc.nextLine();
                            produto.setNome(nome);
                            System.out.println("Nome atualizado!");
                        }
                        case "preco" -> {
                            System.out.print("Digite o novo preco: ");
                            double preco = sc.nextDouble();
                            produto.setPreco(preco);
                            System.out.println("Preco atualizado!");
                        }
                        case "quantidade" -> {
                            System.out.print("Digite a nova quantia: ");
                            int quantidade = sc.nextInt();
                            produto.setQuantidade(quantidade);
                            System.out.println("Quantidade atualizada!");

                        }
                    }
                }
            }
        } catch (InputMismatchException | NullPointerException e) {
            System.out.println("Por favor, digite uma entrada válida!");
            atualizarProdutos();
        }
    }
}

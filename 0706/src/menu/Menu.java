package menu;

import services.AtualizarProdutos;
import services.CadastroProdutos;
import services.ListarProdutos;
import services.RemoverProdutos;

import java.util.Scanner;

public class Menu {

    public void exibirMenu() {
        System.out.println("1 - Cadastrar novo produto");
        System.out.println("2 - Listar todos os produtos");
        System.out.println("3 - Atualizar produto ja existente");
        System.out.println("4 - Excluir produto");
        System.out.println("0 - Sair");
    }

    public void escolha() {
        Scanner sc = new Scanner(System.in);
        exibirMenu();
        System.out.print("\nO que você deseja? ");
        try {
            int escolha = sc.nextInt();
            while (escolha != 0) {
                switch (escolha) {
                    case 1 -> {
                        CadastroProdutos.cadastroProdutos();
                        System.out.println("\n");
                        exibirMenu();
                        System.out.print("\nO que você deseja? ");
                        escolha = sc.nextInt();
                    }
                    case 2 -> {
                        ListarProdutos.listarProdutos();
                        System.out.println("\n");
                        exibirMenu();
                        System.out.print("\nO que você deseja? ");
                        escolha = sc.nextInt();
                    }
                    case 3 -> {
                        AtualizarProdutos.atualizarProdutos();
                        System.out.println("\n");
                        exibirMenu();
                        System.out.print("\nO que você deseja? ");
                        escolha = sc.nextInt();
                    }
                    case 4 -> {
                        RemoverProdutos.removerProdutos();
                        System.out.println("\n");
                        exibirMenu();
                        System.out.print("\nO que você deseja? ");
                        escolha = sc.nextInt();
                    }
                    default -> throw new IllegalStateException("Valor não esperado: " + escolha);
                }

            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Programa finalizado!");
    }
}

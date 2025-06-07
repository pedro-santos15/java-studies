package services;

import entities.Produto;

public class ListarProdutos {

    public static void listarProdutos(){
        if (Produto.getProdutos().isEmpty()){
            System.out.println("Não há produtos cadastrados");
        } else {
            int i = 1;
            for (Produto produto : Produto.getProdutos()) {
                System.out.println(i + " - " + produto);
                i++;
            }
        }


    }
}

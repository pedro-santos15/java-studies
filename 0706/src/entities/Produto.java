package entities;

import java.util.ArrayList;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    private static final ArrayList<Produto> produtos = new ArrayList<>();

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        produtos.add(this);
    }

    public static ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Produto: " + getNome()
                + "; Preco unitario: " + getPreco()
                + "; Quantidade em estoque: " + getQuantidade();
    }
}

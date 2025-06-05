package entities;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double valorTotal(){
        return preco * quantidade;
    }

    public void adicionarQuantidade(int quantidade){
        this.quantidade += quantidade;
    }

    @Override
    public String toString() {
        return "O produto " + nome
                + " atualmente tem " + quantidade + " unidades"
                + " com valor de " + String.format("%.2f", preco) + " cada"
                + " atualmente com o valor total sendo: " + String.format("%.2f", valorTotal());
    }
}

package meus.OperacoesBasicas.meus_list.Exe2;

public class Item {
    private String nome;
    private double valorProduto;
    private int quantidadeProduto;

    public Item(String nome, double valorProduto, int quantidadeProduto) {
        this.nome = nome;
        this.valorProduto = valorProduto;
        this.quantidadeProduto = quantidadeProduto;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", valorProduto=" + valorProduto +
                ", quantidadeProduto=" + quantidadeProduto +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }
}

package meus.OperacoesBasicas.setCodigos.Ordenacao;

import java.util.Objects;

public class Produto implements Comparable<Produto>{

    private long codigo;
    private double preco;
    private int quantidade;

    public Produto(long codigo, double preco, int quantidade, String nome) {
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
        this.nome = nome;
    }

    private String nome;

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                ", nome='" + nome + '\'' +
                '}';
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return codigo == produto.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }

    @Override
    public int compareTo(Produto p) {
        return nome.compareTo(p.getNome());
    }
}

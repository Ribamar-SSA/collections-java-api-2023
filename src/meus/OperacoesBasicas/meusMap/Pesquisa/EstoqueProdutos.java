package meus.OperacoesBasicas.meusMap.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    @Override
    public String toString() {
        return "EstoqueProdutos{" +
                "estoque1=" + estoque1 +
                '}';
    }

    Map<Integer ,Produto> estoque1;

    public EstoqueProdutos() {
        this.estoque1 = new HashMap<>();
    }

    public void  adicionarProduto(Integer key,Produto value){
        estoque1.put(key,value);
    }

    public void exibirProdutos(){
        System.out.println(estoque1);
    }

    public double calcularValorTotalEstoque(){
        double valorTotal = 0;
        for(Produto p: estoque1.values()){
            valorTotal += p.getQuantidade()*p.getPreco();
        }
        return valorTotal;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro=null;
        double valorMaisCaro=Double.MIN_VALUE;
        for(Produto p : estoque1.values()){
            if(p.getPreco() > valorMaisCaro){
                valorMaisCaro = p.getPreco();
                produtoMaisCaro = p;
            }
        }
        return produtoMaisCaro;

    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double valorProdutoMaisBarato =Double.MAX_VALUE;
        if(!estoque1.isEmpty()){
            for(Produto p: estoque1.values()){
                if(p.getPreco() < valorProdutoMaisBarato){
                    valorProdutoMaisBarato = p.getPreco();
                    produtoMaisBarato = p;
                }
        }
        }
        return  produtoMaisBarato;
    }

    public Produto produtoMaiorQuantidadeValorEstoque(){
        Produto produtoMaisForte = null;
        double maiorValorQUantidade=Double.MIN_VALUE;
        for(Produto p : estoque1.values()){
            if (quantidadeValor(p) > maiorValorQUantidade) {
                maiorValorQUantidade = quantidadeValor(p);
                produtoMaisForte = p;

            }
        }
        return produtoMaisForte;

    }

    private double quantidadeValor(Produto p){
        return p.getPreco()*p.getQuantidade();
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.adicionarProduto(1,new Produto("sabão",3,35));
        estoqueProdutos.adicionarProduto(2,new Produto("cebola",3,8));
        estoqueProdutos.adicionarProduto(3,new Produto("tomate",7,2));
        System.out.println("barato");
        System.out.println(estoqueProdutos.obterProdutoMaisBarato());;
        estoqueProdutos.exibirProdutos();
        System.out.println("caro");

        System.out.println(estoqueProdutos.obterProdutoMaisCaro());

        System.out.println("quantidade vs valor ");
        System.out.println(estoqueProdutos.produtoMaiorQuantidadeValorEstoque());

        System.out.println("valor total");
        System.out.println(estoqueProdutos.calcularValorTotalEstoque());

    }
}

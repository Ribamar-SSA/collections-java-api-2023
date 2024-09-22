package meus.OperacoesBasicas.setCodigos.Ordenacao;

import java.util.*;

public class CadastroProdutos {

    Set<Produto> produtosSet = new HashSet<>();

    public void adicionarProduto(String nome, double preco,int quantidade,long codigo){
        produtosSet.add(new Produto(codigo,preco,quantidade,nome));
    }

    public Set<Produto> exibirPorNome(){
        //o hash set não deixa organizado
        Set<Produto> produtoOrdenadoNome = new TreeSet<>(produtosSet);
        return produtoOrdenadoNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){

        Set<Produto> produtosOrdenadoPreco = new TreeSet<>(new Comparator());
        //adicionar elementos no set para que ele possa ordenar
        produtosOrdenadoPreco.addAll(produtosSet);

        return produtosOrdenadoPreco;
    }




    class Comparator implements java.util.Comparator<Produto> {

        @Override
        public int compare(Produto o1, Produto o2) {
            return Double.compare(o1.getPreco(),o2.getPreco());
        }
    }

    @Override
    public String toString() {
        return "CadastroProdutos{" +
                "produtosSet=" + produtosSet +
                '}';
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        // Adicionando produtos ao cadastro
        cadastroProdutos.adicionarProduto("Smartphone", 2, 1000, 10);
        cadastroProdutos.adicionarProduto("Notebook", 1000, 3, 5);
        cadastroProdutos.adicionarProduto("Mouse", 15, 30, 20);
        cadastroProdutos.adicionarProduto("Teclado", 35, 50, 15);

        // Exibindo todos os produtos no cadastro
        //System.out.println(cadastroProdutos); OK

        // Exibindo produtos ordenados por nome OK
        //System.out.println(cadastroProdutos.exibirPorNome());

        // Exibindo produtos ordenados por preço
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}

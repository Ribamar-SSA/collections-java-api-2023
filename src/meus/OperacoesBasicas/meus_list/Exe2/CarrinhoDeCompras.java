package meus.OperacoesBasicas.meus_list.Exe2;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    List <Item> listaItens;

    public CarrinhoDeCompras() {
        this.listaItens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double valorProduto, int quantidade ){
        this.listaItens.add(new Item(nome,valorProduto,quantidade));
    }

    public void removerItem(String nome){
        List <Item> listaRemover = new ArrayList<>();
        for(Item i:this.listaItens){
            listaRemover.add(i);
        }
        listaItens.removeAll(listaRemover);
    }

    public double calcularValorTotal(){
        double total=0;
        for(Item i: listaItens){
            total += i.getQuantidadeProduto() * i.getValorProduto();
        }
        return total;
    }

    public void exibirItens(){
        System.out.println(listaItens);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDoNeto = new CarrinhoDeCompras();

        carrinhoDoNeto.adicionarItem("xbox",2500,2);
        carrinhoDoNeto.adicionarItem("ps4",5000,2);

        System.out.println(carrinhoDoNeto.calcularValorTotal());
        carrinhoDoNeto.exibirItens();
    }



}

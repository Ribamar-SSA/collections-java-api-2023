package meus.OperacoesBasicas.meus_list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoas {

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public List<Pessoa> ordenarPorIdade(){
        //duplicando o array pessoaList
        List<Pessoa> listaOrdenadaIdade = new ArrayList<>(pessoaList);

        //como metodo e static, eu posso chamar sem criar um objeto da classe
        //implementar a interface do Comparable permite usar esse método top
        Collections.sort(listaOrdenadaIdade);
        return listaOrdenadaIdade;
    }

    public List<Pessoa> ordenarPorIdadeReverse(){
        //duplicando o array pessoaList
        List<Pessoa> listaReverseIdade = new ArrayList<>(pessoaList);

        //como metodo e stati
        // c, eu posso chamar sem criar um objeto da classe
        Collections.reverse(listaReverseIdade);
        return listaReverseIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> listaPessoaOrdenadaAltura = new ArrayList<>(pessoaList);

        Collections.sort(listaPessoaOrdenadaAltura,new ComparatorPessoa());
        return listaPessoaOrdenadaAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas plist = new OrdenacaoPessoas();
        plist.pessoaList.add(new Pessoa("ribamar",21,1));
        plist.pessoaList.add(new Pessoa("fagner",13,4));
        plist.pessoaList.add(new Pessoa("sousa",40,1));
        plist.pessoaList.add(new Pessoa("heitor",17,2.3));

        System.out.println("ordenar por idade");
        System.out.println(     plist.ordenarPorIdade());

        System.out.println("ordem reversa da lista");
        System.out.println(     plist.ordenarPorIdadeReverse());

        System.out.println("ordenar por altura");
        System.out.println(plist.ordenarPorAltura());
        //show de bola hehe

    }
}

//para usar o metodo sort posso usar Pessoa ou qualquer classe super
class ComparatorPessoa  implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa o1, Pessoa o2) {
        return Double.compare(o1.getAltura(),o2.getAltura());
    }
}
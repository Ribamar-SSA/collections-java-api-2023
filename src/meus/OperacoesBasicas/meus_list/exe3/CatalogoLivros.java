package meus.OperacoesBasicas.meus_list.exe3;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> listaLivros = new ArrayList<>();

    public CatalogoLivros() {
        this.listaLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        listaLivros.add(new Livro(titulo,autor,anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List <Livro> listaPorAutor = new ArrayList<>();
        if(! listaLivros.isEmpty()) {
            for (Livro l : listaLivros) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    listaPorAutor.add(l);
                }
            }
        }
        return listaPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervalo = new ArrayList<>();
        if(! listaLivros.isEmpty()) {
            for (Livro l : listaLivros) {
                if (l.getAnoPublicacao()>= anoInicial && l.getAnoPublicacao()<=anoFinal){
                    livrosPorIntervalo.add(l);
                }
            }

        }
        return livrosPorIntervalo;
    }

    public Livro pequisarPorTitulo(String titulo){
        Livro livro = null;

        if(! listaLivros.isEmpty()){
            for(Livro l: listaLivros){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livro = l;
                }
            }
        }
        return livro;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros1 = new CatalogoLivros();

        catalogoLivros1.adicionarLivro("duna","frank",1980);
        catalogoLivros1.adicionarLivro("sherlock holmes","Dole",1850);
        catalogoLivros1.adicionarLivro("duna","frank",1980);
        catalogoLivros1.adicionarLivro("ortodoxia","Chesterton",1940);
        catalogoLivros1.adicionarLivro("o homem","Chesterton",1988);

        System.out.println(catalogoLivros1.pesquisarPorAutor("Chesterton"));
        System.out.println();
        System.out.println(catalogoLivros1.pequisarPorTitulo("duna"));
        System.out.println();
        System.out.println(catalogoLivros1.pesquisarPorIntervaloAnos(1850,1940));
    }
}

package meus.OperacoesBasicas.setCodigos.operacoesBasicas.conjuntoDePalavrasÚnicas;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ConjuntoDePalavrasUnica {

    Set<String > setPlavras;

    public ConjuntoDePalavrasUnica() {
        this.setPlavras = new HashSet<>();
    }

    public void adicionarPalavras(String palavras){
        setPlavras.add(palavras);
    }
    public void removerPalavra(String palavras){
        Set<String> lixo = new HashSet<>();
        if(!setPlavras.isEmpty()){
            for(String s : setPlavras){
                if(s.equalsIgnoreCase(palavras)){
                    lixo.add(s);
                }
            }
        }
        setPlavras.removeAll(lixo);



    }
    public boolean verificarPalavra(String palavra){
        if(setPlavras.contains(palavra)){
            return true;
        }
        return false;
    }
    public void exibirPalavrasUnicas(){
        System.out.println(setPlavras);
    }
}

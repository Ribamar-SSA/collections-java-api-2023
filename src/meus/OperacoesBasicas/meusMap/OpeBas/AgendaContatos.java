package meus.OperacoesBasicas.meusMap.OpeBas;

import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String,Integer> mapAgendaContatos = new HashMap<>();

    public void adicionarContato(String nome, Integer telefone){
        //serve tanto para adicionar, quanto para atualizar
        mapAgendaContatos.put(nome,telefone);
    }

    public void removerContato(String nome){
        if(!mapAgendaContatos.isEmpty()){
            mapAgendaContatos.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(mapAgendaContatos);
    }

    public void pesquisarPorNome(String nome){
        if(!mapAgendaContatos.isEmpty()){
            System.out.println(mapAgendaContatos.get(nome));
        }

    }

    public static void main(String[] args) {
        AgendaContatos agenda1 = new AgendaContatos();

        agenda1.adicionarContato("ribamar",99328239);
        agenda1.adicionarContato("sousa",2352354);
        agenda1.adicionarContato("ribamar",124121);
        //o último é o que será adicionado
        agenda1.adicionarContato("ribamar",86235278);
        agenda1.adicionarContato("jdjwkdwqk",23423235);
        agenda1.adicionarContato("cbvneoc",43654378);

//        agenda1.exibirContatos();
//        agenda1.removerContato("ribamar");
//        agenda1.exibirContatos();

        agenda1.pesquisarPorNome("sousa");
    }
}

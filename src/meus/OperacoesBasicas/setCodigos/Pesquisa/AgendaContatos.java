package meus.OperacoesBasicas.setCodigos.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    Set<Contato> agendaContatos1;

    @Override
    public String toString() {
        return "AgendaContatos{" +
                "agendaContatos1=" + agendaContatos1 +
                '}';
    }

    public AgendaContatos() {
        this.agendaContatos1 = new HashSet<>();
    }

    public void adicionarContato(String nome,int numero){
        agendaContatos1.add(new Contato(nome,numero));
    }

    public  Set<Contato> pesquisarPorNomes(String nome){
        Set<Contato>  contatosPesquisados= new HashSet<>();
        for(Contato c : agendaContatos1){
            if (nome.startsWith(c.getNome())){
                contatosPesquisados.add(c);
            }
        }
        return contatosPesquisados;

    }

    public Contato atualizaNumeroContato(String nome,int novoNumero){
        Contato contatoParaAtualizar = null;
        for(Contato c : agendaContatos1){
            if (c.getNome().equalsIgnoreCase(nome)){
                contatoParaAtualizar=c;
                break;
            }
        }
        contatoParaAtualizar.setNumero(novoNumero);
        return contatoParaAtualizar;
    }

    public static void main(String[] args) {
        AgendaContatos agenda2 = new AgendaContatos();

        agenda2.adicionarContato("ribamar",93025259);
        agenda2.adicionarContato("cristiane",93025259);
        agenda2.adicionarContato("fagner",22);
        agenda2.adicionarContato("heitor",55);

        System.out.println(agenda2);

        agenda2.atualizaNumeroContato("heitor",77);

        System.out.println(agenda2);
    }
}

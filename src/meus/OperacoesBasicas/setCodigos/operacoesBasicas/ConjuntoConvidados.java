package meus.OperacoesBasicas.setCodigos.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadeSet;

    public ConjuntoConvidados() {
        this.convidadeSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codConvidado){
        this.convidadeSet.add(new Convidado(nome,codConvidado));
    }

    public void removerConvidado(int codConvidade){
        Convidado convidadoRemovar = null;
        for(Convidado c : convidadeSet){
            if(c.getCodConvite() == codConvidade){
                convidadoRemovar = c;
                break;
            }
        }
        convidadeSet.remove(convidadoRemovar);
    }
    public void exibirConvidados(){
        System.out.println(convidadeSet);
    }

    @Override
    public String toString() {
        return "ConjuntoConvidados{" +
                "convidadeSet=" + convidadeSet +
                '}';
    }

    public static void main(String[] args) {
        ConjuntoConvidados lista1 = new ConjuntoConvidados();
        lista1.adicionarConvidado("ribamar",1);
        lista1.adicionarConvidado("sousa",2);
        lista1.adicionarConvidado("costa",2);
        lista1.adicionarConvidado("neto",4);
        lista1.adicionarConvidado("jose",5);

        lista1.exibirConvidados();
        lista1.removerConvidado(4);
        System.out.println(lista1);
    }
}

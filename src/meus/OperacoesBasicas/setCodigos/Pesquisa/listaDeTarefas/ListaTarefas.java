package meus.OperacoesBasicas.setCodigos.Pesquisa.listaDeTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    Set<Tarefa> conjuntoTarefas;

    public ListaTarefas() {
        this.conjuntoTarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        conjuntoTarefas.add(new Tarefa(descricao, false));

    }

    public void removarTarefa(String descricao) {
        Tarefa tarefaParaRemover=null;
        if (!conjuntoTarefas.isEmpty()) {
            for (Tarefa t : conjuntoTarefas) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaParaRemover = t;
                    break;
                }
            }
            conjuntoTarefas.remove(tarefaParaRemover);
        }
        if(tarefaParaRemover == null){
            System.out.println("tarefa não encontrada");

        }
    }

    @Override
    public String toString() {
        return "ListaTarefas{" +
                "conjuntoTarefas=" + conjuntoTarefas +
                '}';
    }

    public void exibirTarefas() {
        System.out.println(conjuntoTarefas);
    }

    public int contarTarefas() {
        return conjuntoTarefas.size();
    }

    public Set<Tarefa> obterConcluidas() {
        Set<Tarefa> cfinished = new HashSet<>();

        if (!conjuntoTarefas.isEmpty()) {
            for (Tarefa t : conjuntoTarefas) {
                if (t.isFinished()) {
                    cfinished.add(t);
                }
            }

        }
        return cfinished;
    }

    public Set<Tarefa> obterNaoConcluidas(){
        Set<Tarefa> cunfinished = new HashSet<>();

        if (!conjuntoTarefas.isEmpty()) {
            for (Tarefa t : conjuntoTarefas) {
                if (!t.isFinished()) {
                    cunfinished.add(t);
                }
            }

        }
        return cunfinished;
    }

    public void marcarTarefaConcluida(String descricao){
        if(!conjuntoTarefas.isEmpty()){
            for(Tarefa t : conjuntoTarefas){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setFinished(true);
                }
            }
        }

    }

    public void marcarTarefaPendente(String descricao){
        Tarefa tarefaParaPendente = null;
        if(!conjuntoTarefas.isEmpty()){
            for(Tarefa t : conjuntoTarefas){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaParaPendente = t;
                }
            }
        }
        if(tarefaParaPendente != null){
            if(tarefaParaPendente.isFinished()){
                tarefaParaPendente.setFinished(false);
            }
        }else{
            System.out.println("não há a tarefas solicitada");;
        }
    }

    public void limparListaTarefas(){
        conjuntoTarefas.clear();
    }

    public static void main(String[] args) {
        ListaTarefas lista1 = new ListaTarefas();
        lista1.adicionarTarefa("estudar filosofia");
        lista1.adicionarTarefa("estudar mat");
        lista1.adicionarTarefa("estudar phy");
        lista1.adicionarTarefa("estudar java");
        lista1.adicionarTarefa("estudar ingles");


        lista1.marcarTarefaConcluida("estudar java");
        lista1.marcarTarefaConcluida("estudar ingles");
        lista1.marcarTarefaPendente("estudar mat");
        lista1.marcarTarefaPendente("estudar filosofia");

        System.out.println(lista1.obterConcluidas());
        System.out.println(lista1.obterNaoConcluidas());
        lista1.removarTarefa("estudar phy");
        System.out.println(lista1.obterNaoConcluidas());
    }

}

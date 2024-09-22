package meus.OperacoesBasicas.meus_list.Exe1;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    List<Tarefa> listaTarefas ;

    public ListaTarefas() {
        this.listaTarefas = new ArrayList<Tarefa>();
    }

    public void adicionarTarefa(String descricao){
        this.listaTarefas.add(new Tarefa(descricao));

    }

    public void removerTarefa(String descricao){
        //assim consegue tratar também os que contém repetição
        List <Tarefa> tarefasParaRemover = new ArrayList<Tarefa>();

        for( Tarefa tarefa : this.listaTarefas){
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(tarefa);

            }
        }

        this.listaTarefas.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return this.listaTarefas.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(listaTarefas);

    }


    public static void main(String[] args) {
        ListaTarefas listaTarefas1 = new ListaTarefas();

        listaTarefas1.adicionarTarefa("ribamar testando");
        listaTarefas1.adicionarTarefa("sousa testando");
        listaTarefas1.adicionarTarefa("costa testando");
        listaTarefas1.adicionarTarefa("neto testando");

        listaTarefas1.obterDescricoesTarefas();

        System.out.println("numero total de tarefas : " + listaTarefas1.obterNumeroTotalTarefas());

        listaTarefas1.removerTarefa("costa testando");

        System.out.println("numero total de tarefas : " + listaTarefas1.obterNumeroTotalTarefas());
    }
}

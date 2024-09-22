package meus.OperacoesBasicas.setCodigos.Pesquisa.listaDeTarefas;

public class Tarefa {
    private String descricao;
    private boolean isFinished;

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", isFinished=" + isFinished +
                '}';
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }

    public Tarefa(String descricao, boolean isFinished) {
        this.descricao = descricao;
        this.isFinished = isFinished;
    }
}

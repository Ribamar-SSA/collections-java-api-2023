package meus.OperacoesBasicas.meusMap.Ordenacao;

public class Evento {
    String nomeEvento;
    String nomeAtracao;

    @Override
    public String toString() {
        return "Evento{" +
                "nomeEvento='" + nomeEvento + '\'' +
                ", nomeAtracao='" + nomeAtracao + '\'' +
                '}';
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public String getNomeAtracao() {
        return nomeAtracao;
    }

    public void setNomeAtracao(String nomeAtracao) {
        this.nomeAtracao = nomeAtracao;
    }

    public Evento(String nomeAtracao, String nomeEvento) {
        this.nomeAtracao = nomeAtracao;
        this.nomeEvento = nomeEvento;
    }

    public Evento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }
}

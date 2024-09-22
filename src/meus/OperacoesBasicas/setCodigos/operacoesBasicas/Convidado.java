package meus.OperacoesBasicas.setCodigos.operacoesBasicas;

import java.util.Objects;

public class Convidado {

    private String nome;

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", codConvite=" + codConvite +
                '}';
    }

    private int codConvite;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodConvite() {
        return codConvite;
    }

    public void setCodConvite(int codConvite) {
        this.codConvite = codConvite;
    }

    public Convidado(String nome, int codConvite) {
        this.nome = nome;
        this.codConvite = codConvite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return codConvite == convidado.codConvite;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codConvite);
    }
}

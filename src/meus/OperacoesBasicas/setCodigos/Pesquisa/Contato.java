package meus.OperacoesBasicas.setCodigos.Pesquisa;

import java.util.Objects;

public class Contato {

    private String nome;

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", numero=" + numero +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return numero == contato.numero;
    }

    //o hashCode serve para identificar os objetos com um nome
    // e tem que usar o mesmo atributo no hash e no equals
    //para manter uma consistência
    @Override
    public int hashCode() {
        return Objects.hashCode(numero);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Contato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    private int numero;
}

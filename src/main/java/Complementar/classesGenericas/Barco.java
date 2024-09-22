package main.java.Complementar.classesGenericas;

public class Barco {
    String nome;

    @Override
    public String toString() {
        return "Barco{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public Barco(String nome) {
        this.nome = nome;
    }
}

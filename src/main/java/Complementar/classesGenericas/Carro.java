package main.java.Complementar.classesGenericas;

public class Carro {
    String nome;

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public Carro(String nome) {
        this.nome = nome;
    }
}

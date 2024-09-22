package main.java.Complementar.classesGenericas.Service;

import main.java.Complementar.classesGenericas.Carro;

import java.util.List;

//como eu não sei qual vai ser o tipo genérico
// eu posso colocar o T. Isso permite
// declarar ele nos métodos e atributos

public class RentalServe <T>{
    public RentalServe(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }

    private List<T> objetosDisponiveis;

    public T buscarObjetoDisponivel(){
        System.out.println("buscar objeto");
        T t = objetosDisponiveis.remove(0);
        System.out.println("alugando objeto "+ t);
        return t;
    }

    public void retornarCarroAlugado(T t){
        System.out.println("devolvendo o carro"+t);
        objetosDisponiveis.add(t);
    }
}

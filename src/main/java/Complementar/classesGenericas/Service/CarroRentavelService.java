package main.java.Complementar.classesGenericas.Service;

import main.java.Complementar.classesGenericas.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {
    private List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"),new Carro("fusca")));

    public Carro buscarCarroDisponivel(){
        System.out.println("buscar carro");
        Carro carro = carrosDisponiveis.remove(0);
        System.out.println("alugando carro "+ carro);
        return carro;
    }

    public void retornarCarroAlugado(Carro carro){
        System.out.println("devolvendo o carro"+carro);
        carrosDisponiveis.add(carro);
    }
}

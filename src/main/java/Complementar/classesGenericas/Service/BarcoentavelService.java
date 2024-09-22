package main.java.Complementar.classesGenericas.Service;

import main.java.Complementar.classesGenericas.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoentavelService {
    private List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("BMW"),new Barco("fusca")));

    public Barco buscarBarcoDisponivel(){
        System.out.println("buscar Barco");
        Barco barco = barcosDisponiveis.remove(0);
        System.out.println("alugando Barco "+ barco);
        return barco;
    }
    
    public void retornarBarcoAlugado(Barco barco){
        System.out.println("devolvendo o Barco"+barco);
        barcosDisponiveis.add(barco);
    }
}

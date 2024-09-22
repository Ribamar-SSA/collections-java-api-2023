package main.java.Complementar.classesGenericas.test;

import main.java.Complementar.classesGenericas.Barco;
import main.java.Complementar.classesGenericas.Carro;
import main.java.Complementar.classesGenericas.Service.RentalServe;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest2 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("bmw"),new Carro("fusca")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("lancha"),new Barco("iate")));

        RentalServe<Barco> rentalServe = new RentalServe<>(barcosDisponiveis);
        Barco barco1 = rentalServe.buscarObjetoDisponivel();
        System.out.println(barco1);


    }
}

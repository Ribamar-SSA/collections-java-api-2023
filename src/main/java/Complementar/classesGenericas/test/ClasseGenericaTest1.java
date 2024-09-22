package main.java.Complementar.classesGenericas.test;

import main.java.Complementar.classesGenericas.Carro;
import main.java.Complementar.classesGenericas.Service.CarroRentavelService;

public class ClasseGenericaTest1 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println("alugando por um mês");
        carroRentavelService.retornarCarroAlugado(carro);
    }
}

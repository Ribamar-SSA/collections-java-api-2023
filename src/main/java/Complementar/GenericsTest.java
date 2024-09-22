package main.java.Complementar;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {
    //apesar de estar escrito assim
    //Since its methods accept or return an Object
    // , you are free to pass in whatever you want,
    //provided that it is not one of the primitive types
    List<String> lista = new ArrayList<>();



    /*

    é assim que o java manda para bytecode(type erasure)
    List lista = new ArrayList<>();

    ou seja, eu posso adicionar elementos de outro tipo,mas
    na hora de tratá-los da forma que eu coloquei no tipo aceitável
    não vai funcionar

    */

    List<Cachorro> cachorros = List.of(new Cachorro(),new Cachorro());
    List<Gato> gatos = List.of(new Gato(),new Gato());


    //depois que compila o java não sabe que é uma lista
    // de cachorros, que pode ser
    //referenciada como uma lista de animals, portanto dá erro

    //printConsulta(cachorros);

    //aceitar qualquer tipo de lista que seja um animal
    //contrato:não pode adicionar elementos na lista
    private static void printConsulta(List<? extends Animal> animals){
        for(Animal animal:animals){
            animal.consulta();
        }
    }

    //aceitar lista de qualquer tipo de animal ou qualquer um que seja pai

    private static void printConsultaAnimal(List <? super Animal> animals){
        animals.add(new Cachorro());
        animals.add(new Gato());
    }

}

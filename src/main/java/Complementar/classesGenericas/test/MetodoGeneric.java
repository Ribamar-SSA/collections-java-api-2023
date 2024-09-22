package main.java.Complementar.classesGenericas.test;

import main.java.Complementar.Cachorro;
import main.java.Complementar.Gato;
import main.java.Complementar.classesGenericas.Barco;
import main.java.Complementar.classesGenericas.Carro;

import java.util.ArrayList;
import java.util.List;

public class MetodoGeneric {
    public static void main(String[] args) {
        criarArrayComUmObjeto(new Barco("canoa marota"));
    }

    //criar um metodo que retorna um array do objeto genérico

    //tipo do retorno:void
    //modificador de acesso:private

    //esse <T> é para o compilador saber
    private static <T> void criarArrayComUmObjeto(T t){
        List<T> list = new ArrayList<>();
        list.add(t);
        System.out.println(list);
    }

    // se eu quisesse perceber apenas objetos do tipo Comparable
    //< T extends Comparable>


}

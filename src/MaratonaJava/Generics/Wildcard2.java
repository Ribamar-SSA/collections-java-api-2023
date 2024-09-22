package MaratonaJava.Generics;

import java.util.List;

public class Wildcard2 {

    public static void main(String[] args) {

        List<Cachorro> cachorros  = List.of(new Cachorro(),new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());

        List<Animal> animals = List.of(new Cachorro(),new Gato());
//        dois erros por causa do type erasure
//        printConsulta(cachorros);
//        printConsulta(gatos);

        printConsultaAnimal(animals);

    }

    public static void printConsulta(List<Animal> animalList){
        for(Animal animal : animalList){
            animal.consulta();
        }

    }
    //contrato que só vai deixar ler o que for passado
    public static void printConsultaExtend(List<? extends Animal> animalList){
        for(Animal animal : animalList){
            animal.consulta();
        }

    }




    public static void printConsultaAnimal(List<? super Animal> animalList){

//não é possível isso pq pode ser passado um objecto, por exemplo
//        for(Animal animal : animalList){
//            animal.consulta();
//        }

        //agora posso adiconar gato e
        // cachorro porque implementam de animal
        animalList.add(new Cachorro());
        animalList.add(new Gato());
    }
}

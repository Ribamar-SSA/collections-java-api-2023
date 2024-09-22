package MaratonaJava.Generics;

public class Wildcard {
    public static void main(String[] args) {

        Cachorro[] cachorros = {new Cachorro(),new Cachorro()};
        Gato [] gatinhos = {new Gato(), new Gato()};
        Animal [] animais = {new Cachorro(),new Gato()};

        //para arrays funciona
        printConsulta(cachorros);
        printConsulta(gatinhos);




    }






    public static void printConsulta(Animal[] animals){
        for(Animal animal : animals){
            animal.consulta();
        }

    }
}
abstract class Animal{
    public abstract void consulta();
}
class Cachorro extends Animal{

    @Override
    public void consulta() {
        System.out.println("consultando dog");
    }
}
class Gato extends Animal{

    @Override
    public void consulta() {
        System.out.println("consultando gatinho");
    }
}

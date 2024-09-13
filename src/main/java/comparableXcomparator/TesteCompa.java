package main.java.comparableXcomparator;

public class TesteCompa {
    public static void main(String[] args) {
        Livro livro1 = new Livro("sousa","rib",2005);
        Livro livrox = new Livro("credo","ssa",2003);

        System.out.println(livro1.compareTo(livrox));
    }
}

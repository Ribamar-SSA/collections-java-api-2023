package main.java.generics;

public class Box<T> {
    // T stands for "Type"
    private T variable;

    public void set(T t) {
        this.variable = t; }

    public T get() {
        return variable;
    }

    public static void main(String[] args) {
        Box<String> box1 = new Box<String>();
        Box<String> box2 = new Box<String>();

        box1.set("ribamar");
        //box2.set(1);
        //não permite colocar números
        // porque o parâmetro foi definido

        BoxSemGenerics box3 = new BoxSemGenerics();
        box3.setVariable("ribamar");
        box3.setVariable(1);
        //sem o generics ele deixa colocar qualquer coisa
    }
}

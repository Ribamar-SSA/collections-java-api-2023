package MaratonaJava.ClassesInternas;

public class OuterClass {
    private String name;


    class Inner{
        public void printOuterCLassAtrib(){
            System.out.println(name);
            System.out.println(this);
            System.out.println(OuterClass.this);
        }
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.new Inner();
        Inner inner = outerClass.new Inner();
        inner.printOuterCLassAtrib();
    }
}

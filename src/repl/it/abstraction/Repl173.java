package repl.it.abstraction;

public class Repl173 {
    public static void main(String[] args) {
        //Main main = new Main();

        ParentClass parent = new Main();
        parent.m1();
        parent.m1(10);
    }


    /**
     * Abstraction
     * Create a Parent Class that will have two overloaded abstract methods m1
     *
     * Make Main class as concrete subclass to Parent Class
     *
     * In main method call the methods.
     *
     * Expected Output:
     * m1 without parameters
     * m1 method with parameter
     */


}
abstract class ParentClass{
    abstract void m1(int number);
    abstract void m1();

}
class Main extends ParentClass{

    @Override
    void m1(int number) {
        System.out.println("m1 with parameters");
    }

    @Override
    void m1() {
        System.out.println("m1 without parameters");

    }
}

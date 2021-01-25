package repl.it.superKeyWord;

public class Repl156 {
    public static void main(String[] args) {
        Child1 child = new Child1();
    }

    /**
     * In parent class
     * Create a non argument constructor and write a logic to print "This is Parent constructor"
     *
     * Create a Child Class that will be subclass of the Parent class.
     * Create a constructor without parameter and call parent class constructor expicitly
     *
     * In Main Class.
     * Create and object of Child class and run the application.
     *
     * Expected Output:
     * This is Parent constructor
     */
}
class Parent1{
    Parent1(){
        System.out.println("This is Parent constructor");
    }

}
class Child1 extends Parent1{
    Child1 (){
        super();
    }



}


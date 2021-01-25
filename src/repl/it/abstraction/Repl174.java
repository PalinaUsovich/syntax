package repl.it.abstraction;

public class Repl174 {
    public static void main(String[] args) {
        Parent parent = new MainParentClass();
        parent.m1();
        parent.m2();
    }
    /**
     * Abstraction
     * Create a Parent Class in which you will have 1 implemented method m2 and 1 unimplemented method m1
     *
     * Make Main class to be a derived class from Parent.
     *
     * In main method execute both methods
     *
     * Expected Output:
     * Child class providing implementation
     * Parent class providing implementation
     */

}
abstract class Parent {
    public void m2(){
        System.out.println("Parent class providing implementation");
    }
    public abstract void m1();
}
class MainParentClass extends Parent {

    @Override
    public void m1() {
        System.out.println("Child class providing implementation");
    }


}

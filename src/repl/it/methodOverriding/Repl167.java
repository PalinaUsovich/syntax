package repl.it.methodOverriding;

public class Repl167 {
    public static void main(String[] args) {
        ChildClass child = new ChildClass();
        child.m2();
        child.m3();
        child.m4();

    }
    /**
     * Parent class create 4 methods with different level of access modifiers.
     * In each method print "I am parent public/protected/default/private method".
     *
     * Override methods in child class
     *
     * In Main Class create object of the child class and see which methods are available
     *
     * Expected Output:
     * I am a child public method
     * I am a child protected method
     * I am a child default method
     */
}
class ParentClass{
    private void m1(){
        System.out.println("I am parent private method");

    }
    protected void m2(){
        System.out.println("I am parent protected method");

    }
    void m3(){
        System.out.println("I am parent default method");

    }
    public void m4(){
        System.out.println("I am parent public method");
    }

        }
class ChildClass extends ParentClass{
    protected void m2(){
        System.out.println("I am child protected method");

    }
    void m3(){
        System.out.println("I am child default method");

    }
    public void m4(){
        System.out.println("I am child public method");
    }


}

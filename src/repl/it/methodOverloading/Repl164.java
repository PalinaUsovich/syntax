package repl.it.methodOverloading;

public class Repl164 {
    private void m1(){
        System.out.println("private m1 method");

    }
    private void m1(int param){
        System.out.println("private m1 method with int parameter");

    }

    public static void main(String[] args) {
        Repl164 repl = new Repl164();
        repl.m1();
        repl.m1(10);
    }

    /**
     * Overload private instance method m1
     *
     * Call each method from the main method.
     *
     * Expected Output:
     * private m1 method
     * private m1 method with int parameter
     */
}

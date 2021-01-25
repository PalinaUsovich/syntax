package repl.it.methodOverloading;

public class Repl165 {
    static void m2(){
        System.out.println("static method without parameter");
    }
    static void m2(int num){
        System.out.println("static method with int parameter");

    }

    public static void main(String[] args) {
        m2();
        m2(100);
    }

    /**
     * Overload static method and then execute both overloaded methods.
     *
     * Expected Output:
     * static method without parameter
     * static method with int parameter
     */
}

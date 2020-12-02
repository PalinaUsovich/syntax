package repl.it.staticKeyWord;

public class Repl130 {
    /**
     * For you to do:
     *
     * Create two methods:
     * The first method should be a non-static method that will print out the following message:
     * "Programming is amazing."
     *
     * The second method should be a static method that will print out the following message:
     * "Java is awesome."
     *
     * Execute both methods
     *
     * Expected Output:
     * Programming is amazing.
     * Java is awesome.
     */
    void method1 (){
        System.out.println("Programming is amazing.");
    }
    static void method2(){
        System.out.println("Java is awesome.");
    }

    public static void main(String[] args) {

        method2();
        Repl130 rep = new Repl130();
        rep.method1();

    }
}

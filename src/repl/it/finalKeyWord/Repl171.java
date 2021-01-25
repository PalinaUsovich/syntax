package repl.it.finalKeyWord;

public class Repl171 {
    /**
     * Overload 2 final instance methods:
     *
     * Call them in main method
     *
     * Expected Output:
     * Final method with boolean parameter
     * Final method with String parameter
     */
    final void print1(boolean parameter){
        System.out.println("Final method with boolean parameter");
    }
    final void print1(String parameter){
        System.out.println("Final method with String parameter");
    }

    public static void main(String[] args) {
        Repl171 repl = new Repl171();
        repl.print1("param");
        repl.print1(true);
    }

}

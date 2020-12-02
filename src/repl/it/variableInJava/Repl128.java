package repl.it.variableInJava;

public class Repl128 {
    /**
     * For you to do:
     *
     * Declare a static variable number that will hold an integer value:
     *
     * Access number from the main method and assign value to it.
     * Create an Object of the class, access number in a nonstatic way and assing value of 200.
     *
     * Print out number using class name and using instance
     *
     * Expected Output:
     * 200
     * 200
     */
    static int number ;
    void print(){
        System.out.println(number);
    }

    public static void main(String[] args) {
        Repl128.number = 10;
        Repl128 rep = new Repl128();
        number = 200;

        System.out.println(number);
        rep.print();

    }

}

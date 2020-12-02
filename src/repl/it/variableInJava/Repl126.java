package repl.it.variableInJava;

public class Repl126 {
    /**
     * For you to do:
     *
     * Declare the instance variables to hold:
     * integer values
     * String values
     * double values
     * boolean values
     * float values
     *
     * Access instance variables and then print them all without assigning any values to them.
     * Print variables one by one the same sequence that you declare them.
     *
     * Expected Output:
     * 0
     * null
     * 0.0
     * false
     * 0.0
     */
    int num;
    String string ;
    double dob;
    boolean bool;
    float num2;

    void print(){
        System.out.println(num);
        System.out.println(string);
        System.out.println(dob);
        System.out.println(bool);
        System.out.println(num2);
    }

    public static void main(String[] args) {
        Repl126 repl = new Repl126();
        repl.print();
    }



}

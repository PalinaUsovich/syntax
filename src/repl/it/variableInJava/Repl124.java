package repl.it.variableInJava;

public class Repl124 {
    /**
     * For you to do:
     * declare 3 instance variables to hold an integer, double and char values.
     *
     * Create 2 instances of the class and assign values to variables and the print them
     *
     * Expected Output:
     * 10
     * 10.23
     * a
     * 100
     * 100.23
     * s
     */
    int num1;
    double num2;
    char chaR;
    void print(){
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(chaR);
    }

    public static void main(String[] args) {
        Repl124 repl = new Repl124();
        repl.num1 = 7;
        repl.num2 = 2.3;
        repl.chaR ='p';
        repl.print();

        Repl124 repl1 = new Repl124();
        repl1.num1 = 10;
        repl1.num2 = 12.90;
        repl1.chaR ='a';
        repl1.print();

    }

}

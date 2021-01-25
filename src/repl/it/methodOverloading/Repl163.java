package repl.it.methodOverloading;

public class Repl163 {
   static void display(int num1){
        System.out.println(num1);
    }
    static void display(String word){
        System.out.println(word);
    }
    static void display(double num2){
        System.out.println(num2);
    }

    public static void main(String[] args) {
        display(100);
        display("Syntax Technology");
        display(100.09);
    }

    /**
     * For you to do:
     *
     * Overload instance method display by having different types of parameters
     * Inside each method write the logic to print value of the parameter
     *
     * Call all methods inside your main method
     *
     * Expected Output:
     * 100
     * Syntax Technologies
     * 100.09
     */
}

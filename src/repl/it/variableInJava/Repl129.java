package repl.it.variableInJava;

public class Repl129 {
    /**
     * For you to do:
     *
     * Create a variable that will hold the count of all instances of the Main class
     *
     * Create 3 Object of the class and print value of the count variable;
     *
     * Expected Output:
     * 3
     */
    static  int count ;


    public static void main(String[] args) {

        Repl129 rep = new Repl129();
        count +=1;
        Repl129 rep1 = new Repl129();
        count +=1;
        Repl129 rep2 = new Repl129();
        count +=1;
        System.out.println(Repl129.count);







    }
}

package repl.it.accessModifiers;

public class Repl140 {

    public String name;
    private String city;
    String schoolName;
    protected int batchNumber;

     void display(String n, String c , String sn, int batchNumber){
         name = n;
         city = c;
         schoolName=sn;
         this.batchNumber=batchNumber;

        System.out.println("My name is " + name + " and I live in " +
                city + ". I study at " + schoolName+" in batch " + batchNumber);

    }

    public static void main(String[] args) {
        Repl140 repl140 = new Repl140();
        repl140.display("Palina" ," New York", "Edward school",100);
    }

    /**
     * For you to do
     * In main class please declared the variables using different access modifiers
     * that will hold value for:
     * name
     * city
     * name of the school
     * batch number
     *
     * Create a method to display details in following format:
     * My name is ___ and I live in ___. I study at ___ in batch ___
     *
     * Assign values to the variables and execute method display
     *
     * Expected Output:
     * My name is John and I live in Miami. I study at Syntax in batch 6
     */


}

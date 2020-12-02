package repl.it.variableInJava;

public class Repl123 {
    /**
     * For you to do:
     *
     * Declare 3 instance variables to hold:
     *
     * year, school name and batch #
     *
     * Access variables from the main method and assign specific values to them
     * Print values of your variables in the following format:
     *
     * Expected Output:
     * I am a student of batch 6 studying at Syntax in the year of 2020
     */
    int year;
    int batch;
    String schoolName;
    void print (){
        System.out.println("I am a student of batch " + batch + " studying at " + schoolName + " in the year of " + year);
    }

    public static void main(String[] args) {
        Repl123 repl = new Repl123();
        repl.year = 2020;
        repl.schoolName = "Syntax";
        repl.batch = 8;
        repl.print();


    }
}

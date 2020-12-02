package repl.it.variableInJava;

public class Repl125 {
    /**
     * For you to do:
     *
     * Declare 3 instance variables to hold:
     * name of the country
     * capital
     * population size
     *
     * Create a method to display values of instance variables
     *
     * Create 2 Object, assign values to instance variables, execute method display;
     *
     * Expected Output:
     * The capital of USA is Washington DC and population is 330000000
     * The capital of Kazakhstan is Astana and population is 18500000
     */

    String nameOfTheCountry ;
    String capital;
    int populationSize;

    void display(){
        System.out.println("The capital of " + nameOfTheCountry + " is " + capital + " and the population is " + populationSize + " ");
    }

    public static void main(String[] args) {
        Repl125 repl = new Repl125();
        repl.nameOfTheCountry = "USA";
        repl.populationSize =1000;
        repl.capital = "Washington DC";
        repl.display();

        Repl125 repl1 = new Repl125();
        repl1.capital = "Minsk";
        repl1.populationSize = 5000;
        repl1.nameOfTheCountry = "Belarus";
        repl1.display();

    }

}

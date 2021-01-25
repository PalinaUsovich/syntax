package repl.it.constructor;

public class Repl145 {
    String schoolName;
    int batch;
    int year;
    String lastDayOfClass;
    Repl145(){
        System.out.println("not parameterized constructor");
    }
    Repl145(String schoolName, int batch, int year, String lastDayOfClass){
        this.schoolName = schoolName;
        this.lastDayOfClass = lastDayOfClass;
        this.batch = batch;
        this.year = year;
    }
    void display(){
        System.out.println(schoolName + " " + " " +lastDayOfClass + " " + batch + " " + year + " ");
    }

    public static void main(String[] args) {
        Repl145 repl145 = new Repl145();
        repl145.display();
        Repl145 repl = new Repl145("Syntax", 10,2020,"Monday");
        repl.display();
    }


    /**
     * 1. Complete the SyntaxTechnologies class:
     *
     * Include the following class variables:
     * * schoolName(String)
     * * batch(int)
     * * year(int)
     * * lastDayOfClass(String)
     *
     * Write two constructors:
     * * non-argument constructor
     * * parameterized constructor
     *
     * Create method to display values of instance variables.
     *
     * 2. In Main Class:
     * Create two different objects of the SyntaxTechnologies class using
     * both constructors and call display method.
     *
     * Expected Output:
     * null 0 0 null
     * Syntax 6 2020 07/30/2020
     */
}

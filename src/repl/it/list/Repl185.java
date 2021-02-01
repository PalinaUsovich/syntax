package repl.it.list;

import java.util.ArrayList;

public class Repl185 {
    /**
     * ArrayLists
     * Create an array list that will hold String Objects
     * Find out wether array list is empty or not.
     * Add String value "Syntax" to it
     * Find out wether array list is empty or not.
     *
     * Expected Output:
     * true
     * false
     */
    public static void main(String[] args) {
        ArrayList<String> string = new ArrayList<>();
        System.out.println(string.isEmpty());
        string.add("Syntax");
        System.out.println(string.isEmpty());
    }
}

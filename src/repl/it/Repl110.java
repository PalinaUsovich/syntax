package repl.it;

public class Repl110 {
    /**
     * For you to do
     * Instantiate and StringBuffer class
     * Append Value "Hello" to it
     * Append value "World" to it.
     * Print in UPPERCASE.
     *
     * Expected Output:
     * HELLO WORLD
     */
    public static void main(String[] args) {


    StringBuffer string = new StringBuffer();
    string.append("Hello ");
    string.append("World");
        System.out.println(string.toString().toUpperCase());
}
}

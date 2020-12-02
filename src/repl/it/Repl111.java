package repl.it;

public class Repl111 {
    /**
     * How would you reverse a String using StringBuilder Class
     * Given String = "Hello Friends"
     *
     * Expected Output:
     * sdneirF olleH
     */
    public static void main(String[] args) {
        StringBuilder string = new StringBuilder("Hello Friends");
        string.reverse();
        System.out.println(string);
    }
}

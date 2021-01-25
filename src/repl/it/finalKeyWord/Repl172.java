package repl.it.finalKeyWord;

public class Repl172 {
    /**
     * For you to do:
     *
     * Create an instance final method that will reverse a String and return that new String
     *
     * Call method from the main method
     *
     * Expected Output:
     * olleh
     */
    public final String reverse(String word){
        String newString = "";
        for(int i = word.length()-1; i>=0; i--){
             newString = newString +word.charAt(i);
        }
        return newString;
    }

    public static void main(String[] args) {
        Repl172 repl = new Repl172();
        System.out.println(repl.reverse("hello"));
    }
}

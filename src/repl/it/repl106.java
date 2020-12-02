package repl.it;

public class repl106 {
    /**
     * For you to do:
     *
     * Inputs:
     * String word;
     *
     * Write a for loop that will loop through every character of a word and print out each character, each on a separate line
     *
     *  Sample inputs/outputs:
     * In: hello
     * h
     * e
     * l
     * l
     * o
     *
     *
     */
    public static void main(String[] args) {
        String word = "Hello!";
        char [] words = word.toCharArray();
        for(int i = 0; i< words.length; i++){
            System.out.println(words[i]);

        }

    }
}

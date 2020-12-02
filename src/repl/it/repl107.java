package repl.it;

public class repl107 {
    /**
     * Given the following inputs:
     * String s;
     *
     * Write a for loop that will print out each letter of the string s, separated by spaces, on the same line.
     *
     * Sample input/outputs:
     * In: hello
     * h e l l o
     *
     * In: covert
     * c o v e r t
     *
     * In: blasphemy
     * b l a s p h e m y
     */
    public static void main(String[] args) {
        String word = "Hello";
       char[] string = word.toCharArray();
        for(int i = 0; i<string.length; i++ ){
            System.out.print(string[i] +" ");

        }


    }
}

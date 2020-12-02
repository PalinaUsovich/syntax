package repl.it;

public class Repl104 {
    public static void main(String[] args) {
        /**
         *   Given the following inputs:
         * String s;
         *
         * Write a for loop that will print out the reverse of the string.
         *
         * Sample input/outputs:
         * In: manhattan
         * nattahnam
         *
         * In: processor
         * rossecorp
         *
         * In: racecar
         * racecar
         */


        String s = "manhattan";
        String rev = "";

        int length = s.length();
        for(int i = length-1; i>=0; i--){
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);

        /**
         * Inputs:
         * String word;
         *
         * Write a for loop that will print out every other letter in a String, starting with the first letter.
         * These letters should be printed all on one line with no space in between.
         *
         * Sample input/outputs
         * In: hello
         * hlo
         *
         * In: SSyynnttaaxxTTeecchhnnoollooggiieess
         * SyntaxTechnologies
         */
        String word = "SSyynnttaaxxTTeecchhnnoollooggiieess";
        String modifiedString = "";
        for(int i = 0; i<word.length(); i+=2){
            modifiedString = modifiedString + word.charAt(i);
        }
        System.out.println(modifiedString);

        /**
         * Inputs:
         * String word;
         *
         * Write a for loop that will loop through every character of a word and print out each character,
         * each on a separate line
         *
         *  Sample inputs/outputs:
         * In: hello
         * h
         * e
         * l
         * l
         * o
         *
         * In: zimbabwe
         * z
         * i
         * m
         * b
         * a
         * b
         * w
         * e
         *
         * In: wow!
         * w
         * o
         * w
         * !
         */
       char [] mod = s.toCharArray();
        for(int i =0; i<s.length(); i++){
            System.out.println(mod[i]);

        }

    }
}

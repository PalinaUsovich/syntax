package repl.it;

import java.util.Scanner;

public class Repl109 {
    /**
     * For you to do:
     * <p>
     * There is a code that takes input as a String.
     * Write a program that will print out only vowels of that string
     * <p>
     * Sample input/outputs:
     * In: howdyho
     * oo
     * <p>
     * In: huehuehuehue
     * ueueueue
     * <p>
     * In: poopoo what idk what im doing
     * ooooaiaioi
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER WORD");
        String word = sc.nextLine();
        for (int i = 0; i < word.length(); i++) {
            char l = Character.toLowerCase(word.charAt(i));
            if (l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u') {
                System.out.print(word.charAt(i));

            }
        }
    }
}

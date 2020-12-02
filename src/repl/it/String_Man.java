package repl.it;

import java.util.Scanner;

public class String_Man {
    public static void main(String[] args) {
        /**
         * For you to do:
         *
         * Create a String given="Hello Syntax friends".
         * Using String methods from given String create new String "Welcome Syntax family"
         *
         * Expected Output:
         * Welcome Syntax family
         */
        String giv = "Hello Syntax friends";
        String[] newStr = giv.split(" ");

        newStr[0] = "Welcome ";
        newStr[2] = " family";
        System.out.println(newStr[0] +newStr[1] + newStr[2] );

        Scanner sc =  new Scanner(System.in);

        /**
         * Write code that will take in a String input and check to see if it is a palindrome or not.
         *
         * A palindrome means that the characters are the same forwards and backwards, ignoring spaces.
         *
         * Examples of palindromes:
         * racecar
         * was it a car or a cat I saw
         * never odd or even
         * rats live on no evil star
         *
         * Your check should be case insensitive too.  For example, "Bob" is a palindrome, despite the first B being capitalized.
         *
         * Your program will print out "true" if it's a palindrome and "false" if not.
         */
        System.out.println("Input string ");
        String input = sc.nextLine();
        String rev = "";

        int length = input.length();

        for(int i = length-1; i >= 0; i --){
            rev = rev + input.charAt(i);
        }
            if(input.equals(rev)){
                System.out.println(input + " is a palindrome");
            }else{
                System.out.println(input + " is not palindrome");
            }





    }
}

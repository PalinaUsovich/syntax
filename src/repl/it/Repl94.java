package repl.it;

import java.util.Scanner;

public class Repl94 {
    /**
     * Create String str1= syntax technologies and convert into SYNTAX TECHNOLOGIES
     * Create String str2=  SYNTAX TECHNOLOGIES and convert into syntax technologies
     *
     * Expected Output:
     * SYNTAX TECHNOLOGIES
     * syntax technologies
     */
    public static void main(String[] args) {
        String string1 = "syntax technologies";
        String string2 = "SYNTAX TECHNOLOGIES";
        System.out.println(string1.toUpperCase());
        System.out.println(string2.toLowerCase());

        /**
         * For you to do:
         * Create a String "name" and assign the value "Timmy" to it.
         * Find out how many characters are there in the given String.
         */
        String name =  "Timmy";
        int count = 0;

        for(int i = 0; i<name.length(); i++){
            if(name.charAt(i)!=' '){
                count = count+1;
            }
        }
        System.out.println(count);
        /**
         * For you to do:
         *
         * Validate if the string ends with "u" prints the boolean value accordingly.
         * Validate if the string ends with "world" prints the boolean value accordingly.
         * Validate if the string ends with "are" prints the boolean value accordingly.
         * Validate if the string ends with "you" prints the boolean value accordingly.
         */
        String s = "Hello how are you";
        System.out.println(s.endsWith("u"));
        System.out.println(s.endsWith("world"));
        System.out.println(s.endsWith("are"));
        System.out.println(s.endsWith("you"));

        /**
         * For you to do:
         *
         * Print out the position of the first occurrence of "c".
         * Print out the position of the first occurrence of " ".
         * Print out the position of the first occurrence of the variable target1.
         * Print out the position of the first occurrence of the variable target2.
         *
         * Expected Output:
         * 4
         * 11
         * 6
         * -1
         */

            String str = "abracadabra alakazam";
            String target1 = "dab";
            String target2 = "ABRA";
        System.out.println(str.indexOf('c'));
        System.out.println(str.indexOf(" "));
        System.out.println(str.indexOf(target1));
        System.out.println(str.indexOf(target2));
        /**
         * For you to do:
         *
         * Create a String given="I love Java classes at Syntax"
         * Retrieve 2 Strings from given String and print them
         *
         * Expected Output:
         * classes at Syntax
         * I love Java
         */
        String given = "I love Java classes at Syntax";
        String str1 = given.substring(12);
        String str2 = given.substring(0,11);

        System.out.println(str1);
        System.out.println(str2);
        /**
         * For you to do:
         *
         * Using Scanner class input string value.
         * Print out the following: "The first 3 letters of ___ is ___"
         *
         * For example, if the input is "banana", your output should be: "The first 3 letters of banana is ban".
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER word");
        String word = sc.nextLine();
        System.out.println("The first 3 letters of " + word +" is " +word.substring(0,3));

/**
 * You have Scanner class to input string value.
 *
 * If language is Java it should print the:
 * "Java is a programming language".
 *
 * If language is C it should print the:
 * "C is a procedural programming language"
 *
 * If language is C++ it should print the:
 * "C++ is a middle-level programming language"
 *
 * If any other should print:
 * "Doesn't match any programming language"
 */

        System.out.println("Enter any programming language");
        String progLang = sc.nextLine();
        switch(progLang){
            case "Java":
                System.out.println(progLang+ " is a programming language");
                break;
            case "C":
                System.out.println(progLang +" is a procedural programming language ");
                break;
            case "C++":
                System.out.println(progLang + " is a middle-level programming language");
                break;
            default:
                System.out.println("Doesn't match any programming language");

        }
        /**
         * For you to do:
         *
         * Based on the user inputs program should give a correct answer.
         *
         * If browser is Chrome or Chrome or CHROME or ChRoMe it should print the:
         * "Proceed with Chrome browser"
         *
         * If browser is firefox, FIREFOX or FireFOX it should print the:
         * "Proceed with Firefox browser"
         *
         * If browser is IE, ie or iE it should print the:
         * "Proceed with IE browser"
         *
         * If any other browser it should print the:
         * "Invalid browser"
         */
        System.out.println("Enter browser name ");
        String browser = sc.nextLine();

       if(browser.equalsIgnoreCase("chrome")){

       }else if(browser.equalsIgnoreCase("FireFox")){

       }else if(browser.equalsIgnoreCase("IE")){

       }else {
           System.out.println("Invalid browser");
       }
        System.out.println("Proceed with "+browser +" browser");
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
        String newStr = "";
        newStr = giv.substring(7,12);
        System.out.println(newStr);
    }

    }


package repl.it.accessModifiers;

public class Repl142 {
    static String newString;

    public static String alphabetical(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.contains(" ")) {
                newString = newString.concat(" ");

            } else if (str.charAt(i) == 'z') {
                newString = newString.concat("a");

            }

        }
        return newString;
    }


    /**
     * Create a method that will be available to all classes in your project with
     * following specifications:
     * <p>
     * Returns:
     * a String
     * Name:
     * alphabetical
     * Parameters:
     * a String called str
     * Purpose:
     * Return a string that is composed of each letter as long as the letter is later
     * on in the alphabet
     * than its previous one.  You can assume actual parameters are lowercase.
     * See below examples.
     * <p>
     * Additional Info:
     * You can use < and > to compare characters (not Strings), where characters later on in
     * the alphabet are "greater".  Examples:
     * 'a' < 'b' ==> True
     * 'a' < 'a' ==> False
     * 'a' > 'b' ==> False
     * <p>
     * Examples:
     * alphabetical("hello") ==> "hlo"
     * alphabetical("software") ==> "stwr"
     * alphabetical("language") ==> "lnug"
     * <p>
     * Expected Output:
     * hlo
     * stwr
     * lnug
     */
    public static void main(String[] args) {
        System.out.println(alphabetical("hello")); //"hlo"
        System.out.println(alphabetical("software"));
        System.out.println(alphabetical("language"));
    }
}



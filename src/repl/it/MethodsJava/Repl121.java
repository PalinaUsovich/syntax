package repl.it.MethodsJava;

public class Repl121 {
    /**
     * Write a method header on line two with the following specs:
     *
     * Returns:
     * a String
     * Name:
     * spaceOut
     * Parameters:
     * a String
     *
     * Then complete the method by programming the following behavior
     * Insert spaces after every character in the String s, then return the new string.
     * See below examples (note the space at the end as well).
     *
     * Examples:
     * spaceOut("hello") ==> "h e l l o "
     * spaceOut("technology") ==> "t e c h n o l o g y "
     */
    public static String spaceOut(String a){
        char[] newString = a.toCharArray();
        for(int i = 0; i< newString.length; i++){
            System.out.print(newString[i] +" ");

        }
        return newString.toString();
    }

    public static void main(String[] args) {
        spaceOut("hello");
    }
}

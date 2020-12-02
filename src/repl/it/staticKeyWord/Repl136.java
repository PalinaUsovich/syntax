package repl.it.staticKeyWord;

public class Repl136 {
    /**
     * Create a static method with the following specs:
     *
     * Returns:
     * an integer
     * Name:
     * countA
     * Parameters:
     * a String called s
     * Purpose:
     * count the number of occurrences of 'a' or 'A' within s
     *
     * Examples:
     * countA("aaa") ==> 3
     * countA("aaBBdf8k3AAadnklA") ==> 6
     *
     * Hint: How do you write a for loop to loop through every letter of a string?
     * You've done this multiple times already :)
     */
    static int countA(String s){
        char[] array = s.toCharArray();
        int count =0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)== 'a' || s.charAt(i)=='A'){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String string = "FamiliaAAAAAaaa";
        System.out.println(countA(string));
    }
}

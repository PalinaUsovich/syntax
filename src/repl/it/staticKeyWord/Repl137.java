package repl.it.staticKeyWord;

public class Repl137 {
    /**
     * Write a method with the following specs:
     *
     * Returns:
     * an integer
     * Name:
     * countVowels
     * Parameters:
     * a String called s
     * Purpose:
     * count the number of vowels in the string s.  Assume s is all lowercase.
     *
     * Examples:
     * countVowels("obama") ==> 3
     * countVowels("happy friday! i love weekends") ==> 9
     */
    int countVowels(String s){
        int count =0;
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='a' || ch=='o' || ch=='u' || ch=='i' || ch=='e' ){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String string = "ObamaAA";
       Repl137 repl = new Repl137();
        System.out.println(repl.countVowels(string.toLowerCase()));
    }
}

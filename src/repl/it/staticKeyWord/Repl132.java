package repl.it.staticKeyWord;

public class Repl132 {
    /**
     * Create a static method with the following specification
     *
     * Return Type: String
     * Method Name: mixString
     * Parameters:
     * a String called s1
     * a String called s2
     *
     * Then inside method write logic that will return the strings combined,
     * one letter at a time, starting with s1.  See example below for an example.
     *
     * NOTE: s1 and s2 should be of equal lengths:
     *
     * s1 ==> "12345"
     * s2 ==> "abcde"
     * mixString(s1,s2) ==> "1a2b3c4d5e"
     */
    static String mixString(String s1, String s2){

        StringBuilder sb = new StringBuilder();
        if(s1.length() == s2.length()){
            for(int i=0; i<s1.length(); i++){
               sb.append(s1.charAt(i));
               sb.append(s2.charAt(i));
            }
        }else{
            System.out.println("Strings length must be the same");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(mixString("11111","22222"));
    }
}

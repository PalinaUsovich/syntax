package oops.string.charAt;

public class CharAt {
    public static void main(String[] args) {
        String word = "never";
        char c = word.charAt(3);
        System.out.println(c);
        System.out.println(word.charAt(0));

        for(int i = 0; i<word.length(); i++){
            System.out.println(word.charAt(i));
        }
    }
}

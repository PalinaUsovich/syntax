package oops.string;

public class SubstringMethod {
    public static void main(String[]args){
        String word = "Never say never";
        System.out.println(word.substring(5));// will ignore first 5 characters, not indexes
        System.out.println(word.substring(1));
        System.out.println(word.substring(3,8));//will ignore every charac before 3, and will print
                                                //charac after 3 till 8, and ignore everything after 8
        System.out.println(word.substring(1,5) + " " + word.substring(11,15));

    }
}

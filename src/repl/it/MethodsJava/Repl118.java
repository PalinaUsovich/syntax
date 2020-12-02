package repl.it.MethodsJava;

public class Repl118 {
    /**
     * Create a method that will accept a String as a parameter and
     * return new String all in upper case
     *
     * Call method
     *
     * Expected Output:
     * TEST
     */
    public static String m1(String string ){
       return string.toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(m1("test"));
    }
}

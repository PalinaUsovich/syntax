package repl.it.MethodsJava;

public class Repl113 {
    /**
     * For you to do
     *
     * 1. Create method name it as newLine
     * 2. Add print statement inside method body as "newLine method implementation"
     * 3. Call newLine method three times
     *
     * Expected Output:
     * newLine method implementation
     * newLine method implementation
     * newLine method implementation
     */
    public static void newLine(){
        System.out.println("newLine method implementation");
    }

    public static void main(String[] args) {
        newLine();
        newLine();
        newLine();

         for (int i =0; i < 3; i++){
             newLine();
         }
    }
}

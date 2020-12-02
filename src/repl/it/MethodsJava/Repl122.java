package repl.it.MethodsJava;

public class Repl122 {
    /**
     * Write a method header with the following specs:
     *
     * Returns:
     * a String
     * Name:
     * censorLetter
     * Parameters:
     * a String
     * a char
     *
     * Then complete the method by programming the following behavior
     * Replace all instances of given character with a "*" within the given String.
     * See below examples.
     *
     * Examples:
     * censorLetter("computer science",'e') ==> "comput*r sci*nc*"
     * censorLetter("trick or treat",'t') ==> "*rick or *rea*"
     */
    public static String censorLetter(String inputs, char chaR){
        String string ="";
        for(int i =0; i < inputs.length(); i++){
           string =inputs.toLowerCase().replace(chaR, '*');

        }
        return string;
    }

    public static void main(String[] args) {
        System.out.println(censorLetter("Palina",'a'));
    }
}

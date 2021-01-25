package repl.it.accessModifiers;

public class Repl143 {
    /**
     * For you to do:
     *
     * Create the maxLength method that will accept String array of words
     * and return the word with the largest length.
     *
     * Method should visible only within same package!
     *
     * Expected Output:
     * this is long
     */
      static String maxLength(String[] words){
         String maxString = "";
         int length=0;

         for(int i =0; i<words.length; i++){
             if(words[i].length()>length){
                 length = words[i].length();
                 maxString = words[i];
             }
         }
         return maxString;
     }

    public static void main(String[] args) {
        String[] arr = {"hey","yolo","hi","this is long"};
        System.out.println(maxLength(arr));
    }


}

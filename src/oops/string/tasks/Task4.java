package oops.string.tasks;

import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        String string = "see you next time";
        String reversedString = " ";
        String[] array = string.split(" ");


        for(String ar:array){
            String word = ar;
            String reverseWord = "";


        for (int j = word.length()-1; j >= 0; j--)
        {
            /* The charAt() function returns the character
             * at the given position in a string
             */
            reverseWord = reverseWord + word.charAt(j);

        }
            reversedString = reversedString + reverseWord + " ";

        }
        System.out.println(string);
        System.out.println(reversedString);
    }


}




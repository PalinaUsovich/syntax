package repl.it.staticKeyWord;

import java.util.Arrays;

public class Repl133 {
    /**
     * For you to do:
     * <p>
     * Complete the mystery method so that it takes in an integer array as a parameter,
     * and then modifies each element based on whether it's even or odd.
     * If the number is even, divide it by 2.  If it's odd, multiply it by 10.
     * <p>
     * Expected Output:
     * 10 1 30 2 50
     */
    static void mystery(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
          if(ar[i] %2 ==0){
              ar[i] = ar[i]/2;
          }else{
              ar[i] = ar[i]*10;
          }

        }
        System.out.println(Arrays.toString(ar));
    }

        public static void main (String[]args){
            int[] a = {1, 2, 3, 4, 5};
            mystery(a);
            // should print out 10 1 30 2 50
        }
    }


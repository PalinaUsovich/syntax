package repl.it;

import java.util.Scanner;

public class Repl108 {
    /**
     * For you to do:
     * Create an array of names that will hold 5 String elements.
     * Names must be taking from a user.
     *
     * Print out the first three characters of each element of the array, one per line.
     *
     * Note: every array element must be at least 3 characters long.
     *
     * Input Example:
     * John
     * Jane
     * Jimmy
     * Mike
     * Emily
     *
     * Expected Output:
     * Joh
     * Jan
     * Jim
     * Mik
     * Emi
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 names to an array");
        String[] arr = new String[5];
         for(int i = 0; i<arr.length; i++ ){
             arr[i] = sc.nextLine();
         }
         for(int i = 0; i<=arr.length-1; i++){
             System.out.println(arr[i].substring(0,3));
         }

    }
}

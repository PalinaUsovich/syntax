package repl.it.list;

import java.util.ArrayList;
import java.util.Scanner;

public class Repl190 {
    /**
     * Using Scanner class add 5 elements into ArrayList and then print
     * all elements from that ArrayList all in 1 line
     *
     * Numbers in:
     * 4
     * 62
     * 8
     * 5
     * 4
     *
     * Expected Output:
     * 4 62 8 5 4
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0; i < 5; i++){
            System.out.println("enter number:");
            list.add(sc.nextInt());
        }
        for(Integer intr: list){
            System.out.println(intr);
        }



    }
}

package repl.it.list;

import java.util.ArrayList;

public class Repl187 {
    /**
     * ArrayList Loop
     * Create an arrayList of type Integer.
     *
     * add below values.
     * 111
     * 111
     * 111
     * 999
     * 999
     * 999
     *
     * Print all the values of List 1 by 1:
     *
     * Expected Output:
     * 111
     * 111
     * 111
     * 999
     * 999
     * 999
     */
    public static void main(String[] args) {
        ArrayList<Integer> intArrayList = new ArrayList<>();
        intArrayList.add(10);
        intArrayList.add(20);
        intArrayList.add(50);
        intArrayList.add(30);
        intArrayList.add(80);
        for(int i = 0; i < intArrayList.size();i++){
            System.out.println(intArrayList.get(i));
        }
    }

}

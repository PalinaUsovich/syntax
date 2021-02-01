package repl.it.list;

import org.openqa.selenium.json.JsonOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Repl186 {
    /**
     * Create a array list that will hold Integer Objects:
     * Add below elements to it.
     * 111
     * 222
     * 333
     * 444
     * 555
     * 666
     *
     * Print first, third and fifth element from your array
     *
     * Expected Output:
     * 111
     * 333
     * 555
     */
    public static void main(String[] args) {
        ArrayList<Integer> intArrayList = new ArrayList<>();
        intArrayList.add(10);
        intArrayList.add(20);
        intArrayList.add(50);
        intArrayList.add(30);
        intArrayList.add(80);

        System.out.println(intArrayList.get(0));
        System.out.println(intArrayList.get(2));
        System.out.println(intArrayList.get(4));
    }
}

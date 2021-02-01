package repl.it.list;

import java.util.LinkedList;

public class Repl192 {
    /**
     * Create Linked List that will store first 10 numbers of fibonacci series
     *
     * Print number from Linked List 1 by 1 all in 1 line
     *
     * Expected Output:
     * 0 1 1 2 3 5 8 13 21 34
     */
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        int next;
        int a = 0, b = 1;
        int count = 10;
        list.add(a);
        list.add(b);
            for(int i=2; i < count; i++){
                next=a +b;
                a=b;
                b=next;
                list.add(next);
            }

            System.out.println(list);
    }
}

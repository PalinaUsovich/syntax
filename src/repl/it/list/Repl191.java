package repl.it.list;

import java.util.LinkedList;

public class Repl191 {
    /**
     * Create a Linked List that will store Integer Objects from 50-100.
     * Once Linked List is created remove all numbers that are not divisible by 3.
     *
     * Print Linked List
     *
     * Expected Output
     * [51, 54, 57, 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99]
     */
    public static void main(String[] args) {


    LinkedList<Integer> list = new LinkedList<>();
    for(int i = 50; i <= 100; i++){
        list.add(i);
    }
   for(int i = 0; i < list.size();i++){
       if(list.get(i) % 3 != 0){
           list.remove(i);

       }
   }
        System.out.println(list);
}
}
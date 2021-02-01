package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        list.add(18.99);
        list.add(16.99);
        list.add(20.88);
        Iterator<Double> itr = list.iterator();
        System.out.println(itr.hasNext());
        System.out.println(itr.next());
        System.out.println(itr.hasNext());
        System.out.println(itr.next());
        System.out.println(itr.hasNext());
        System.out.println(itr.next());
//        System.out.println(itr.hasNext());
//        System.out.println(itr.next()); // CE no such element exception,no more elements left

    }

}

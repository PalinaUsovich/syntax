package collection.hashset;

import java.util.Set;
import java.util.TreeSet;

public class TreesetDemo {
    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("apple");
        treeSet.add("orange");
        treeSet.add("grape");
        treeSet.add("Kiwi");
        treeSet.add("apple");
        System.out.println(treeSet);


        Set<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(12);
        numbers.add(100);
        numbers.add(98);
        numbers.add(70);
        numbers.add(12);
        System.out.println(numbers);
    }


}
//does nor allow duplicates
//the result is sorted always(from smallest to largest)


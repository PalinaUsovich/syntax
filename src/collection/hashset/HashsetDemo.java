package collection.hashset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashsetDemo {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();
        hashSet.add("apple");
        hashSet.add("orange");
        hashSet.add("grape");
        hashSet.add("Kiwi");
        hashSet.add("apple");
        System.out.println(hashSet);
    }

}
//does not garantee to save the order of elements
//does not allow duplicates
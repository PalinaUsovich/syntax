package collection.hashset;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("apple");
        linkedHashSet.add("orange");
        linkedHashSet.add("grape");
        linkedHashSet.add("Kiwi");
        linkedHashSet.add("apple");
        System.out.println(linkedHashSet);
    }
}
//does not allow double elements(same )
//keeps the order of elements

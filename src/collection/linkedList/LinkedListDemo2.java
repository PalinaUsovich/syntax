package collection.linkedList;

import java.util.LinkedList;

public class LinkedListDemo2 {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();

        cities.add("Tampa");
        cities.add("Brooklyn");
        cities.add("Manhattan");
        cities.add("LA");
        cities.add("SanDiego");
        System.out.println(cities);
        cities.addFirst("Minsk");
        cities.addLast("Warsaw");
        cities.add(5,"Moscow");
        System.out.println(cities);
    }
}

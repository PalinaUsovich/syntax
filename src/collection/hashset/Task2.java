package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        Set<String> cities = new LinkedHashSet<>();
        cities.add("New York");
        cities.add("Tokyo");
        cities.add("Minsk");
        cities.add("Buenos Aires");
        cities.add("Brooklyn");
        cities.add("Almaty");
        cities.add("Arlengton");
        cities.add("Jersey city");

        Iterator<String> itr = cities.iterator();
        while(itr.hasNext()){
            String next = itr.next();
            if(next.startsWith("A")){
                itr.remove();
            }
        }

        System.out.println(cities);

    }
}

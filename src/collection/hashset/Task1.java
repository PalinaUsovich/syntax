package collection.hashset;

import java.util.Set;
import java.util.TreeSet;

public class Task1 {
    public static void main(String[] args) {
        Set<String> countries = new TreeSet<>();
        countries.add("Belarus");
        countries.add("Russia");
        countries.add("USA");
        countries.add("Malta");
        countries.add("Poland");
        countries.add("Germany");
        System.out.println(countries);
        for(String country: countries){
            System.out.println(country);
        }
    }
}

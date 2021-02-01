package collection;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDrinksTask {
    String replacement = "water";

    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("cola");
        drinks.add("sprite");
        drinks.add("fanta");
        drinks.add("jin");

        System.out.println(drinks);
//        for (String drink : drinks) {
//            if (drink.contains("e") || drink.contains("a")) {
//                drinks.set(drinks.indexOf(drink),"water");
//            }
//        }
        Iterator<String> itr = drinks.iterator();
        while(itr.hasNext()){
            if(itr.next().equals("jin")){
                itr.remove();
            }
        }
        System.out.println(drinks);
    }
}
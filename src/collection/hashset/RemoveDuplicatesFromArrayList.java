package collection.hashset;

import java.util.*;

public class RemoveDuplicatesFromArrayList {
    public static void main(String[] args) {
        ArrayList<String> aList = new ArrayList<>();
        ArrayList<String> newList = new ArrayList<>();
        aList.add("John");
        aList.add("Ben");
        aList.add("John");
        aList.add("Kate");
        aList.add("Logan");

        for(String name: aList){
            if(!newList.contains(name)){
                newList.add(name);
            }
        }
        System.out.println(newList);
        System.out.println(aList);
//        Set<String> set = new TreeSet<>();//or HashSet
//        for(String name : aList){
//            set.add(name);
//        }
//        System.out.println(set);


    }

}

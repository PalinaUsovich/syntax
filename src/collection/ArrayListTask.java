package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTask {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Tanya");
        stringArrayList.add("Stepa");
        stringArrayList.add("Palina");
        stringArrayList.add("Lisa");
        stringArrayList.add("Anton");
        System.out.println(stringArrayList.isEmpty());
        System.out.println(stringArrayList.contains("Palina"));
        System.out.println(stringArrayList.size());
      //  System.out.println(stringArrayList);

        ArrayList<String> stringList2 = new ArrayList<>();
        stringList2.add("Kolya");
        stringList2.add("Mari");
        stringList2.add("Kate");
        stringList2.addAll(stringArrayList);
        Collections.sort(stringArrayList);
        stringList2.remove(0);
        stringList2.retainAll(stringArrayList);
        //stringList2.removeAll(stringList2);
        System.out.println(stringList2);
    }
    }


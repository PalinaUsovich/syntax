package collection;

import java.util.ArrayList;

public class ArrayListContains {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Tanya");
        arrayList.add("Stepa");
        arrayList.add("Palina");
        arrayList.add("Lisa");
        arrayList.add("Anton");
        arrayList.add("Lola");
        arrayList.add("Mia");
        arrayList.add("Flora");
        arrayList.add("Devid");

        ArrayList<String> arrayList2 = new ArrayList<>(15);
        arrayList2.add("Lola");
        arrayList2.add("Mia");
        arrayList2.add("Flora");
        arrayList2.add("Devid");
        arrayList2.add("lisa");
        System.out.println(arrayList.containsAll(arrayList2));
    }


}

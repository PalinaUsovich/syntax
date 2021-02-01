package collection;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> dynamicArray = new ArrayList<>();
        dynamicArray.add("Palina");
        dynamicArray.add("Ani");
        dynamicArray.add("Kate");
        dynamicArray.add("Lola");
        dynamicArray.add("Eva");
        boolean isEmpty = dynamicArray.isEmpty();
        System.out.println("is it empty? "+isEmpty);
        boolean isPresent = dynamicArray.contains("Palina");
        System.out.println("is Palina present? "+isPresent);
        System.out.println(dynamicArray.size());
        System.out.println(dynamicArray);

    }
}

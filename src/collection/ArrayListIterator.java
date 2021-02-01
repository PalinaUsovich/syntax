package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {
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

        for(String name: arrayList){
            System.out.println(name);
        }
        System.out.println("===========================using normal for loop===================================");
        for(int i = 0; i< arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
        System.out.println("=======================using while loop=====================================");
        int index = 0;
        while(index<arrayList.size()){
            System.out.println(arrayList.get(index));
            index++;
        }
        System.out.println("=================iterator===============================================");
        Iterator<String> iterator= arrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}

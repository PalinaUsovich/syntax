package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListOfEvenNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= 50; i += 2) {
            numbers.add(i);
        }
        System.out.println(numbers);
        Iterator<Integer> itr = numbers.iterator();
        while(itr.hasNext()){
            if(itr.next() % 5 == 0){
                itr.remove();
            }
        }
        System.out.println(numbers);
    }


}





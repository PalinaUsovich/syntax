package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTask1 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Honda");
        cars.add("Audi");
        for( String car: cars){
            System.out.println(car);
        }
        for(int i = 0; i <cars.size(); i++){
            System.out.println(cars.get(i));
        }
       Iterator<String> iterator = cars.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}

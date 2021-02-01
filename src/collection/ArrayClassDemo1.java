package collection;

import java.util.ArrayList;

public class ArrayClassDemo1 {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        list.add(14.90);
        list.add(15.90);
        list.add(15.90);
        System.out.println(list);
        //replace the value at specified index
        list.set(1,20.80);
        System.out.println(list);
//        list.remove(0);
//        System.out.println(list);

        for(int i = list.size()-1; i>=0; i--){
            System.out.println(list.get(i));
        }


    }
}

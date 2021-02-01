package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrauDemoClass3 {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        list.add(18.99);
        list.add(16.99);
        list.add(20.88);
        list.add(30.88);
        list.add(23.11);
        list.add(21.99);
        list.add(10.99);

        Iterator<Double> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

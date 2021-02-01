package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayClassDemo2 {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        list.add(18.99);
        list.add(16.99);
        list.add(20.88);
        list.add(30.88);
        list.add(23.11);
        list.add(21.99);
        list.add(10.99);
//        for(int i = 0; i < list.size(); i++){
//            if(list.get(i)<20){
//                list.remove(i);
//            }
//        }
        System.out.println(list);//unexpected results or runtime exception
        Iterator<Double> itr = list.iterator();
        while(itr.hasNext()){

            if(itr.next()<20){
                itr.remove();
            }
        }
        System.out.println(list);
    }
}

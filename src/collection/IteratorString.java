package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorString {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Tampa");
        list.add("Brooklyn");
        list.add("Manhattan");
        list.add("LA");
        list.add("SanDiego");
        System.out.println(list);

        Iterator<String>itr = list.iterator();
        while(itr.hasNext()){
            if(itr.next().endsWith("n")){
                itr.remove();
            }
        }
        System.out.println(list);
    }

}

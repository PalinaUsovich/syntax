package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListTask2 {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();

        words.add("love");
        words.add("hope");
        words.add("belief");
        words.add("destiny");
        Iterator<String> iterator = words.iterator();
        while(iterator.hasNext()){
            String word = iterator.next();
            if(word.endsWith("e")){
                iterator.remove();
            }

        }
        System.out.println(words);




    }

}
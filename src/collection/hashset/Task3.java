package collection.hashset;

import com.google.common.hash.HashingOutputStream;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) {
        Set<Students> students = new HashSet<>();
        students.add(new Student1("Steve", 345678));
        students.add(new Student2("Pamela", 3456789));
        students.add(new Student3("Kris", 12345));
        Iterator<Students> itr = students.iterator();
        while(itr.hasNext()){
            Students st = itr.next();
            st.getName();

        }
//        for( Students st: students){
//            st.getName();
//        }
    }
}

package collection;

import java.util.ArrayList;

public class MultiDimensionArrays {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> outerArrayLists = new ArrayList<>();
        ArrayList<Integer> innerArrayList1 = new ArrayList<>();
        innerArrayList1.add(10);
        innerArrayList1.add(20);
        innerArrayList1.add(30);
        outerArrayLists.add(innerArrayList1);
        ArrayList<Integer> innerArrayList2 = new ArrayList<>();
        innerArrayList2.add(100);
        innerArrayList2.add(200);
        innerArrayList2.add(300);
        outerArrayLists.add(innerArrayList2);
        System.out.println(outerArrayLists);



    }
}


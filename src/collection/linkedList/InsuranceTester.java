package collection.linkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class InsuranceTester {
    public static void main(String[] args) {

        ArrayList<Insurance> list = new ArrayList<>();
        list.add(new Pet("pet insurance", "dog"));
        list.add(new Car("car insurance","BMW"));
        list.add(new Health("health insurance"));

        Iterator<Insurance> itr = list.iterator();
        while (itr.hasNext()) {
            Insurance insurance = itr.next();
            insurance.getQuote();
            insurance.cancelInsurance();
        }
//        for(Insurance ins: list){
//            ins.getQuote();
//            ins.cancelInsurance();
//        }
//        for(int i = 0; i < list.size(); i ++){
//            list.get(i).cancelInsurance();
//            list.get(i).getQuote();
//        }

        }

    }



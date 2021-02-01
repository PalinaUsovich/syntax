package collection.linkedList;

import java.util.ArrayList;
import java.util.Iterator;

public class CardTester {
    public static void main(String[] args) {

        ArrayList<Card> list = new ArrayList<>();
        list.add(new AMEX("AMEX"));
        list.add(new Mastercard("Mastercard"));
        list.add(new Chase("Chase"));
        System.out.println("==================enhanced loop==============================");
        for(Card card : list){
            card.wisdrawMoney(90);
            card.depositMoney();
        }
        System.out.println("=================== for loop =============================");
        for(int i = 0; i < list.size(); i ++){
            list.get(i).depositMoney();
            list.get(i).wisdrawMoney(9887);
        }
        System.out.println("==================iterator===============================");
        Iterator<Card> itr = list.iterator();
        while(itr.hasNext()){
            Card c = itr.next();
            c.wisdrawMoney(890);
            c.depositMoney();
        }




        }

    }


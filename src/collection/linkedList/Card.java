package collection.linkedList;

public abstract class Card {
    String creditCardType;
    Card(String creditCardType){
        this.creditCardType = creditCardType;

    }

    abstract void depositMoney();

    void wisdrawMoney(double amount){
        System.out.println(amount + creditCardType + " wisdraw method");

   }

}
class Mastercard extends Card{

    Mastercard(String creditCardType) {
        super(creditCardType);
    }

    @Override
    void depositMoney() {
        System.out.println(creditCardType + " deposit method");
    }
}
class AMEX extends Card{

    AMEX(String creditCardType) {
        super(creditCardType);
    }

    @Override
    void depositMoney() {
        System.out.println(creditCardType + " deposit money method");

    }
}
class Chase extends Card{

    Chase(String creditCardType) {
        super(creditCardType);
    }

    @Override
    void depositMoney() {
        System.out.println(creditCardType + " deposit method");
    }
}

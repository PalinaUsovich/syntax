package oops.inheritance.methodOverriding;

public class CreditCard {
    double balance;
    double interest;

    CreditCard(double balance, double interest){
        this.balance = balance;
        this.interest = interest;
    }

    double calculateInterest(){

       return balance*interest;


    }
    public static void print(){
        System.out.println("I am print static  method in parent class and i do not need object to be called");

    }

}

class Visa extends CreditCard{

    Visa(double balance, double interest) {
        super(balance,interest);
    }
    public static void print(){
        System.out.println("I am an overridden method in child class");

    }


}

class AX extends CreditCard{


    AX(double balance, double interest) {
        super(balance, interest);
    }

    double calculateInterest(){

        return balance*interest*3;
    }



    public static void main(String[] args) {
        CreditCard card = new CreditCard(10000,15);
        System.out.println(card.calculateInterest());
        card.print();


        AX ax = new AX(20000,15);
        System.out.println(ax.calculateInterest());

        Visa visa = new Visa(5000,10);
        System.out.println(visa.calculateInterest());
        visa.print();







    }
}

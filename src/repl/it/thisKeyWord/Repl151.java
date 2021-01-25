package repl.it.thisKeyWord;

public class Repl151 {
    /**
     * In ShoppingStore class:
     * Create variables as below.
     * item,
     * price,
     * quantity
     *
     * Create a constructor to initialize instance variables.
     *
     * Create a method with name itemTotalPrice.
     * write a logic to to calculate the total values of items in stock. and print the result.
     * return the total value.
     *
     * In Main Class.
     * Create two Object of ShoppingStore and pass the parameters to Constructor.
     * then using each object call the method itemTotalPrice.
     * Store the returned value of each object.
     * Calculate sum of both object and print the result.
     *
     * Output:
     * Blanket Total Value 99.98
     * Mattress Total Value 439.18
     * You purchased 539.16 Today
     *
     *
     * Assignment Goals: Clean Code, proper naming convention, Choosing Variable Datatype,
     */
    String item;
    double price;
    int quantity;
    Repl151(String item,double price,int quantity){
        this.item = item;
        this.price = price;
        this.quantity = quantity;
    }

    public double itemTotalPrice(){
        System.out.println(item + " " + price + " " + quantity );
        return price;
    }


}
class Store{
    public static void main(String[] args) {
        Repl151 item1 = new Repl151("Hat",100.0, 2);
        item1.itemTotalPrice();
        Repl151 item2 = new Repl151("Dress",50.0,2);
        item2.itemTotalPrice();

        double total = item1.price + item2.price;
        System.out.println("total value " + total + " Today");




    }

}

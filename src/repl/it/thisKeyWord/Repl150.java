package repl.it.thisKeyWord;

public class Repl150 {
    /**
     * Instructions from your teacher:
     * In carObject class:
     * Create instance variables as below.
     * model
     * price,
     * quantity
     *
     * Create a constructor that will initialize instance variables.
     *
     * Create a method with name carStockValue. Write logic to calculate
     * the total values of cars in stock and print the result.
     *
     * run the application in Main Class
     *
     * Expected Output:
     * Toyota 2019 Stock Value 2500000.0
     * BMW 2019 Stock Value 652980.0
     *
     * Assignment Goal. Clean Code, This Keyword, Method Creation, Mathematic Operations.
     */
    String model;
    double price;
    int quantity;

    Repl150 (String model,double price,int quantity){
        this.model = model;
        this.price = price;
        this.quantity = quantity;
    }
     void carStockValue(int stockValue){
        stockValue+=quantity;
        System.out.println(model + " Stock value " + stockValue + " " + price );
    }


}
class MainMain{
    public static void main(String[] args) {
        Repl150 car1 = new Repl150(" Toyota 2019",200000,30);
        car1.carStockValue(9);

        Repl150 car2 = new Repl150(" BMW 2002", 500,1);
        car2.carStockValue(10);

    }

}

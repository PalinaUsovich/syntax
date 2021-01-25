package repl.it.constructor;

public class Repl146 {
    String make;
    String model;
    int numOfDoors;
    double topSpeed;
    double price;

    Repl146(String make, String model, int numOfDoors, double topSpeed, double price){
        this.make = make;
        this.model = model;
        this.numOfDoors = numOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;

    }
    Repl146(String make, String model,double topSpeed, double price){
        this.make = make;
        this.model = model;
        this.topSpeed = topSpeed;
        this.price = price;

        numOfDoors = 4;

    }
    Repl146(double topSpeed, double price, int numOfDoors){
        this.topSpeed = topSpeed;
        this.price = price;
        this.numOfDoors = numOfDoors;
        this.model = "unknown";
        this.make = "unknown";

    }
    Repl146(String make, String model, int numOfDoors){
        this.topSpeed = 90.0;
        this.price = 0.0;
        this.make = make;
        this.model = model;
        this.numOfDoors = numOfDoors;

    }
    void display(){
        System.out.println(make + " " + model + " " + numOfDoors + " " + topSpeed +" "+ price );
    }

    public static void main(String[] args) {
        Repl146 repl =  new Repl146("Toyota", "Prius",4,300.0,100000.0);
            repl.display();
        Repl146 repl1 =  new Repl146("Toyota", "Prius",300.0,20000.0);
        repl1.display();
        Repl146 repl2 =  new Repl146(300.0, 50000,4);
        repl2.display();
        Repl146 repl3 =  new Repl146("Toyota","Prius",4);
        repl3.display();

    }

    /**
     *  1. Complete the Car.java class:
     * Create the following variable (Choose proper datatype)
     * * make
     * * model
     * * numberOfDoors
     * * topSpeed
     * * price
     * following the proper naming convention for variables.
     *
     * Write four constructors:
     * * The first constructor(with all parameters)
     * * A secondary constructor Have all parameters except numberOfDoors. (numberOfDoors value should assign to 4 inside constructor)
     * * A third constructor Have all parameters except make and model . (make and model value should assign to "unknown" inside constructor)
     * * A fourth constructor Have all parameters except topSpeed and price;(topSpeed value should assign to "90" and price value should be assign to 0 inside constructor)
     *
     * Create a display method in Cars class to print the class variable value in console.
     *
     * 2. Test your code with the Main.java class:
     * Create several Car objects using all Constructors.
     * then call display method with each object.
     *
     * Output:
     * Toyota Prius 4 120 30000.0
     * Toyota Prius 4 120 30000.0
     * unknown unknown 4 120 30000.0
     * Toyota Prius 4 90 0.0
     */
}

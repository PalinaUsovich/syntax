package oops;

public class Garage {
    public static void main(String[] args) {
        Car car1 = new Car();
         car1.color = "Black";
         car1.make = "BMW";
         car1.size = 4;
         car1.numberOfDoors = 4;

         Car car2 = new Car();
         car2.numberOfDoors = 2;
         car2.size = 2;
         car2.color = "Grey";
         car2.make = "Audi";


        System.out.println("car1 make : " + car1.make);
        System.out.println("car2 make : "+ car2.make);
    }
}

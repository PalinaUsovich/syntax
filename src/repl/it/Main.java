package repl.it;

public class Main {
    String carColor ;
    String carMake;
    int carYear;

    public static void main(String[] args) {
        Main main = new Main();

        main.carColor = "Black";
        main.carMake = "BMW";
        main.carYear = 2020;
        System.out.println("Car color is "+ main.carColor +
                " and the year is " + main.carYear +
                " and car model is " + main.carMake);

        Main car1 = new Main();
        car1.carMake = "Audi";
        car1.carYear = 2000;
        car1.carColor = "White";

        System.out.println("Car color is "+car1.carColor +
                " and the year is " + car1.carYear +
                " and car model is " + car1.carMake);


    }

    /**
     * Create a class named 'Main' with specific attributes.
     * Create two objects of that class in which you will be assigning the following values and then print them.
     * carColor='Black'
     * carYear=2019
     * carMake='BMW'
     *
     * carColor='White'
     * carYear=2018
     * carMake='Toyota'
     *
     * Expected Output:
     * Car color is Black and car year is 2019 and car model is BMW
     * Car color is White and car year is 2018 and car model is Toyota
     */
}

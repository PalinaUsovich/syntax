package oops.finalKeyWord;

public class ComputerTester {
    public static void main(String[] args) {
        Computer[] arrayOfAllaComputers = new Computer[4];
        arrayOfAllaComputers[0] = new Lenovo("Lenovo");
        arrayOfAllaComputers[1] = new Apple("Apple");
        arrayOfAllaComputers[2] = new HP("HP");
        arrayOfAllaComputers[3] = new Dell("Dell");

//        Computer[] allCompInOneVariable = {new Apple("Apple"),
//                new Lenovo("Lenovo"),new Dell("Dell"), new HP("HP")};
        print(arrayOfAllaComputers);

        Lenovo lenovo = new Lenovo("Lenovo");
        Apple apple = new Apple("Apple");
        lenovo.tabletMode();
    }
    public static void print(Computer[]computer){
        for(Computer comp:computer){
            comp.shutDown();
            comp.storage();
            comp.transfer();

        }
    }
}

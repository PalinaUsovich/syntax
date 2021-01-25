package oops.inheritance.methodOverloading;

public class Task3 {
    private void details(){
        System.out.println("no arguments");

    }
    private void details(int year, String name){
        System.out.println("int year, String name");

    }
    private void details(String name, int year){
        System.out.println("String name, int year");

    }
    private void details(int year, String name , int SSN){
        System.out.println("int year, String name , int SSN");

    }

    public static void main(String[] args) {
        Task3 task3 = new Task3();
        task3.details();
        task3.details(1995,"Palina");
        task3.details(1995,"Palina",83833);
        task3.details("Palina", 1234);

    }
}

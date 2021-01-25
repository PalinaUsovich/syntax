package oops.inheritance.methodOverloading;

public class Overloading {
    //!!!!!you can not overload by changing the return type or access modifiers
    // cannot overload by making method static for example, cannot overload fields
    //you can only overload methods and constructors
    //only signature is matter (name and parameters)


    void print(){
        System.out.println("No arguments");
    }

    void print(String name, int year){
        System.out.println("String name, int year");
    }
    void print(int year, String name){
        System.out.println("int year, String name");

    }
    void print(String name){
        System.out.println("String name");

    }
    void print(double number){
        System.out.println("double number");

    }

    public static void main(String[] args) {
        Overloading overloading = new Overloading();
        overloading.print();
        overloading.print("palina",1995);
        overloading.print(1995,"PALINA");
        overloading.print("Palina");
        overloading.print(2.2);

    }
}

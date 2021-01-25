package oops.interfacePack;

public interface MyInterface {
    //before java 8
    String name = " Palina";
     void print ();

     //after java 8
    static void printNumber(){
        System.out.println("745834838");
    }
     default void printName(){
         //these default methods are used to support lambdas
    }

}


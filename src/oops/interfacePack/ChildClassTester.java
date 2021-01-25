package oops.interfacePack;

public class ChildClassTester {
    public static void main(String[] args) {
        MyInterface myInterface = new ChildMyInterface() ;
         myInterface.print();

         //MyInterface.name = "Palina";  fields can not be reassigned as they are always final
        }
    }



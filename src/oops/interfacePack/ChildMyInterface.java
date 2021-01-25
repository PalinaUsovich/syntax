package oops.interfacePack;

import oops.MyLaptop;

public class ChildMyInterface implements MyInterface,MyInterface2{
    @Override
    public void print() {
        System.out.println(" My name is Palina and i am QA engineer");
    }

    @Override
    public void printAddress() {
        System.out.println("2276 East Brooklyn");
    }
}

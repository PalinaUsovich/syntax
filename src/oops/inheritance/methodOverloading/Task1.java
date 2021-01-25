package oops.inheritance.methodOverloading;

import com.sun.xml.internal.xsom.XSUnionSimpleType;

import java.util.Scanner;

public class Task1 {

    public Task1(){
        System.out.println("I love programming languages");
    }

    public Task1(String language){
        System.out.println("I love " + language);
    }

    public static void main(String[] args) {
        Task1 task = new Task1();
        Task1 task1 = new Task1("java");


    }
}

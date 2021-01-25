package oops.polymorphism.casting;

public class Dog {
    void bark(){
        System.out.println("Dog is barking");
    }
    void sleep(){
        System.out.println("Dog is sleeping");
    }
    void eat(){
        System.out.println("Dog is eating");
    }
    void appearance(){
        System.out.println("I do not have any appearance i am general dog");
    }
}
class Cockapoo extends Dog{
    void appearance(){
        System.out.println("I have long hair");
    }
    void sleep(){
        System.out.println("I sleep 16 hours");
    }
}
class JackRussel extends Dog{
    void appearance(){
        System.out.println("I jump high");
    }
    void special(){
        System.out.println("I love other dogs");
    }
    void behaivior(){
        System.out.println("I like hanting");
    }
}

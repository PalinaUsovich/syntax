package oops;

public class Dog_main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.age = 4;
        dog1.breed = "Russel Terrier";
        dog1.name = "Eva";
        dog1.isHealthy = false;

        if(dog1.isHealthy){
             dog1.play();
         }else{
             dog1.bark();
         }

    }
}

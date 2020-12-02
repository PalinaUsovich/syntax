package repl.it;

public class Task3 {
    /**
     * Create a Class Main
     *
     * In this class, you should specify the following attributes: breed, name, color, and following behaviors: bark(), run(), play().
     * Create 3 different objects of it: Husky, Bulldog, Labrador with specific attributes and behaviors.
     *
     * The output of the program should be as following:
     *
     * Husky can bark
     * Husky can run
     * Husky can play
     * Bulldog can bark
     * Bulldog can run
     * Bulldog can play
     * Labrador can bark
     * Labrador can run
     * Labrador can play
     */
    String breed;
    String color;
    String name;

    void bark(){
        System.out.println(breed + "can bark");
    }
    void run(){
        System.out.println(breed + "can run");
    }
    void play(){
        System.out.println(breed + "can play");

    }

    public static void main(String[] args) {
        Task3 dog1 = new Task3();
        dog1.breed = "Russel ";
        dog1.bark();




        Task3 dog2 = new Task3();
        dog2.breed = "Husky ";
        dog2.run();


        Task3 dog3 = new Task3();
        dog3.breed = "Bulldog ";
        dog3.play();


    }


}

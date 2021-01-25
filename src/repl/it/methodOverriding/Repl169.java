package repl.it.methodOverriding;

public class Repl169 {
    public static void main(String[] args) {
//        Cat cat = new Cat("Cat");
//        Kitten1 kit1 = new Kitten1("Kitten1");
//        Kitten2 kit2 = new Kitten2("Kitten2");
//        Kitten3 kit3 = new Kitten3("Kitten3");

        Animal[] animals = new Animal[4];
        animals[0] = new Cat("Cat");
        animals[1] = new Kitten1("kitten1");
        animals[2] = new Kitten2 ("kitten2");
        animals[3] = new Kitten3 ("kitten3");

        for(Animal an:animals){
            an.sleep();
            an.eat();
        }

    }
    /**
     * Create a class Animal in which define instance variable type, constructor that will
     * initialize instance variables and 2 methods eat and sleep.
     *
     * Create a subclass Cat in which override method sleep
     *
     * Create 3 Kitten subclasses of a Cat class and override method eat
     * for 1 kitten - eats milk
     * for 2 kitten - eats snack
     * for 3 kitten - eats everything
     *
     * In main method create object of Cat class and all 3 kittens classes and store
     * into an array of Animals. Call available methods:
     *
     * Expected Output:
     * Cat eats
     * Cat sleeps a lot
     * kitten1 eats milk
     * kitten1 sleeps a lot
     * kitten2 eats snacks
     * kitten2 sleeps a lot
     * kitten3 eats everything
     * kitten3 sleeps a lot
     */
}
class Animal{
    String type;
    void eat(){

    }
    void sleep(){

    }

    Animal(String type){
        this.type = type;
    }

}
class Cat extends Animal{

    Cat(String type) {
        super(type);
    }


    void sleep() {
        System.out.println(type + " Sleeps a lot");
    }
    void eat(){
        System.out.println(type + " Eats");
    }

}
class Kitten1 extends Cat{

    Kitten1(String type) {
        super(type);
    }
    void eat(){
        System.out.println(type + " eats milk");
    }



}
class Kitten2 extends Cat{

    Kitten2(String type) {
        super(type);
    }


    void eat() {
        System.out.println( type + " eats snacks");
    }
}
class Kitten3 extends Cat{

    Kitten3(String type) {
        super(type);
    }

    @Override
    void eat() {
        System.out.println(type + " eats everything");
    }
}

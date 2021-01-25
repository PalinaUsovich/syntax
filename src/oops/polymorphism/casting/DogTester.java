package oops.polymorphism.casting;

public class DogTester {
    public static void main(String[] args) {
        //all 4 methods can be accessed
        //type of box and type of object are the same ,no extra cost
        Dog dog = new Dog();
        dog.sleep();
        dog.bark();
        dog.appearance();
        dog.eat();
        //in box DOG we store JackRussel object(we must pay some cost) which can
        //gives us possibility of compile time(CE) error
        //we can not access all methods from JackRussel class
        //if we try to store a parent into a child we will get a
        //run time error(RE),
        //if we try to store child into a parent we may pay cosy(compile time error)
        //CE will not be4 able to access the additional methods
        //from our child class this is the cost

        dog = new JackRussel();//type of object and box are different, no cost
        dog.appearance();
        //at this point we are moving DOG OBJECT into dog box again
        //no cost, types are the same
        //if we uncomment this will get an error
        //if we try this JackRussel russel = (JackRussel)dog;

        //dog = new Dog();
        dog.appearance();

        //we create a box of type JackRussel and saying Java
        //to go to Dog variable and extract JackRussel object from there
        //and to store it into russel variable , which java will
        //allow us bc box and object will be of the same type, no cost
        /**
         * //we can extract the content of box/variable/container
         *         and we store these in the box but we must follow all of the above
         *         rules
         */

        JackRussel russel = (JackRussel)dog;
        russel.behaivior();
        russel.special();

    }
}

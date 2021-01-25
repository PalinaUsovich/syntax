package oops.finalKeyWord;
class smartMachine{
    public void smart(){
        System.out.println("I am a smart machine");
    }
}

public class Computer {
    String brand;
    Computer(String brand){
        this.brand = brand;
    }

    void shutDown(){
        System.out.println(brand + " can shut down");
    }
    void transfer(){
        System.out.println(brand + " can transfer data");
    }
    void storage (){
        System.out.println(brand + " can store data");
    }

}
class Apple extends Computer {
    Apple(String brand) {
        super(brand);
    }

    @Override
    void shutDown() {
        System.out.println("Shut down faster");
    }

    @Override
    void storage() {
        System.out.println("Saves the data in a different way");
    }

    @Override
    void transfer() {
        super.transfer();
    }
}


class Lenovo extends Computer{
    Lenovo(String brand) {
        super(brand);
    }
    void tabletMode(){
        System.out.println(brand + " can also be used as tablet");
    }
}



class HP extends Computer{

    HP(String brand) {
        super(brand);
    }
    void secure(){
        System.out.println(brand + " can be unlocked fingerprints ");
    }
}

class Dell extends Computer {

    Dell(String brand) {
        super(brand);
    }
}

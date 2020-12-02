package oops;

public class Laptop {
    String make;
    String model;
    int hardDriveCapacity;
    int RAMCapacity;
    String color;
    String processor;
    String GPU;
    int storage;

    void turnOn(){
        System.out.println("Its turned on");

    }
    void playMusic(){
        System.out.println("Playing music");
    }
    void browseInternet(){
        System.out.println("Browsing Internet");
    }
    void videoCall(String id){
        System.out.println("Video calling to " + id);
    }

    String giveModel(){
        return model;
    }
    int getRAMCapacity(){
        return RAMCapacity*2;
    }
    int upfradeRam(int newRAMUnit){
        return newRAMUnit*RAMCapacity;
    }

}

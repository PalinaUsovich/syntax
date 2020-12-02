package oops;

public class MyLaptop {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.color = "Black";
        laptop.model = "pro 16";
        laptop.RAMCapacity = 16;
        laptop.make = "Mac";
        laptop.storage =  1;
        laptop.GPU = "Nvidia RTX 3090 12GB DDR6x";

        laptop.browseInternet();
        System.out.println(laptop.giveModel());
        laptop.videoCall("1234");
        laptop.playMusic();
        laptop.turnOn();
        System.out.println(laptop.getRAMCapacity());
        System.out.println(laptop.upfradeRam(2));
    }
}

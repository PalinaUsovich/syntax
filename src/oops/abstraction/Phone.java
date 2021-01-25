package oops.abstraction;

abstract public class Phone {
    public void makeCalls(){
        System.out.println("Phone makes calls");
    }
    public void sendText(){
        System.out.println("phone sends txt");
    }
    public abstract void viewPicture();
    public abstract void unlock();

}
class Iphone extends Phone{

    @Override
    public void viewPicture() {
        System.out.println("we can checkout the photos using the photos app");
    }

    @Override
    public void unlock() {
        System.out.println("unlock with face");
    }
}
class Samsung extends Phone{

    @Override
    public void viewPicture() {
        System.out.println("to vies pics use the Gallary app");
    }

    @Override
    public void unlock() {
        System.out.println("unlock using password");
    }
}

package repl.it.abstraction;

public class Repl175 {
    public static void main(String[] args) {
        Tea [] tea = {new LemonTea("Lemon Tea "),new ChaiTea(" Chai Tea ")};
        for(Tea t : tea){
            t.addSugar();
        }
    }
    /**
     * Abstraction
     * Create a Super Class Tea that will have:
     * instance variable teaType;
     * constructor that will initialize
     * unimplemented method addSugar(),
     *
     * Create 2 subclasses of Tea as Lemon Tea and Chai Tea.
     *
     * In main class create an object of 2 Child and assign them to Parent reference type.
     * Execute method addSugar from both classes.
     *
     * Expected Output:
     * For Lemon Tea we need 2 spoons of sugar
     * For Chai Tea we need 1 spoon of sugar
     */

}
abstract class Tea{
    String teaType;
    Tea(String teaType){
        this.teaType = teaType;
    }
    abstract void addSugar();
}
class LemonTea extends Tea{

    LemonTea(String teaType) {
        super(teaType);
    }

    @Override
    void addSugar() {
        System.out.println("For " + teaType + " we need 2 spoons of sugar");
    }
}
class ChaiTea extends Tea{


    ChaiTea(String teaType) {
        super(teaType);
    }

    @Override
    void addSugar() {
        System.out.println("For " + teaType + " we need 1 spoon of sugar");
    }
}

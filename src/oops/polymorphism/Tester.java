package oops.polymorphism;

public class Tester {
    public static void main(String[] args) {
//        PalinaParents palinaParents = new Palina();
//
//        palinaParents = new Kate();
//        palinaParents = new Roma();

        PalinaParents[] familyArray = new PalinaParents[3];
        familyArray[0] = new Palina();
        familyArray[1] = new Kate();
        familyArray[2] = new Roma();
        print(familyArray);

    }
    public static void print(PalinaParents[] palinaParents){
        for(PalinaParents pp: palinaParents){
            pp.eat();
            pp.sleep();
        }
    }
}

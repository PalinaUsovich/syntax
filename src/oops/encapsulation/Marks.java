package oops.encapsulation;

public abstract class Marks {
    abstract double getPercentage();



}
class A extends Marks{
    int mathMark,litMark,artMark;

    A (int mathMark,int litMark, int artMark){
        this.artMark = artMark;
        this.litMark = litMark;
        this.mathMark = mathMark;
    }

    @Override

    double getPercentage() {
        double average = 0;
        int [] marks = {mathMark,litMark,artMark};
        int length = marks.length;
        for(int i :marks){
           average+=i;

        }
        average = average/length;

        return average;
    }
}
class B extends A{
    int itMark;

    B(int mathMark, int litMark, int artMark,int itMark) {
        super(mathMark, litMark, artMark);
        this.itMark = itMark;
    }


//    double getPercentage() {
//        double average = 0;
//        int [] marks = {mathMark,litMark,artMark,itMark};
//        int length = marks.length;
//        for(int i :marks){
//            average+=i;
//        }
//        average = average/length;
//
//        return average;
//    }


}
class MainClass{
    public static void main(String[] args) {
        Marks marks = new A(10,10,10);
        System.out.println(marks.getPercentage());
        marks = new B(20,10,20,20);
        System.out.println(marks.getPercentage());
    }
}

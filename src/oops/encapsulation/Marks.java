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
        double average
        int [] marks = {mathMark,litMark,artMark};
        for(int i = 0; i<=marks.length; i++){

        }
        double average = mathMark + litMark + artMark %;
        return average;
    }
}
class B extends A{
    int itMark;

    B(int mathMark, int litMark, int artMark,int itMark) {
        super(mathMark, litMark, artMark);
        this.itMark = itMark;
    }

    @Override
    double getPercentage() {
        return 0;
    }
}

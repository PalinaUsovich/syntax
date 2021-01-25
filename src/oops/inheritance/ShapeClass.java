package oops.inheritance;

public class ShapeClass {
    double radius;
    ShapeClass(double radius){
        this.radius = radius;
        System.out.println("From Shape class radius init");
    }


}
class CircleClass extends ShapeClass{
    double p ;
    double areaResult;

    CircleClass(double radius){
        super(radius);
        this.p = 3.14;


    }
    void calculateArea(){
        areaResult = (radius*radius) * p;
        System.out.println("Area size: " + areaResult);
    }

    public static void main(String[] args) {
        CircleClass circleClass = new CircleClass(6);
        circleClass.calculateArea();
    }



}

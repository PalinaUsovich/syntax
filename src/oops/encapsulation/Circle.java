package oops.encapsulation;

public class Circle implements Shape {


    @Override
    public void calculateArea() {

    }

    @Override
    public void calculatePerimiter() {

    }
}

class Square implements Shape {


    @Override
    public void calculateArea() {

    }

    @Override
    public void calculatePerimiter() {

    }
}
class Main{
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.calculateArea();
        shape.calculatePerimiter();
        shape = new Square();
        shape.calculateArea();
        shape.calculatePerimiter();
    }
}

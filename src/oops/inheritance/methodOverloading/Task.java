package oops.inheritance.methodOverloading;

public class Task {
    double area;

    public double calculateArea(double length, double width){
        System.out.println("A=l*w");
        return area = length*width;

    }
    public double calculateArea(int side){
        System.out.println("A=s*s");
        return area = side * side;

    }
    public double calculateArea(double length, double width, double height){
        System.out.println("A= l*w*h");
        return area = length * width + height;


    }

    public static void main(String[] args) {
        Task task = new Task();
        System.out.println(task.calculateArea(4));
        System.out.println(task.calculateArea(2.2,6.0));
        System.out.println(task.calculateArea(5.0,2.5,12));
    }

}

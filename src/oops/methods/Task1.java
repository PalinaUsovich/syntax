package oops.methods;

public class Task1 {
    public static double largerNum(double num1, double num2){
        if(num1 == num2){
            System.out.println("Equals");
        }
        if(num1>num2){
            return num1;
        }else {
            return num2;
        }
    }

    public static void main(String[] args) {
        System.out.println(Task1.largerNum(1,1));
    }
}

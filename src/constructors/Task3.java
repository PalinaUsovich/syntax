package constructors;

public class Task3 {
    int num1;
    String string;
    double num2;

    private Task3(){
        this.num1 = num1;

        System.out.println("Private constructor");
    }
    Task3(String s){
        string = s;
        System.out.println("Default constructor");
    }
    public  Task3(double num2){
        this.num2 = num2;
        System.out.println("Public constructor");

    }

    public static void main(String[] args) {
        Task3 task3 = new Task3();
        Task3 task2 = new Task3("palina");
        Task3 task1 = new Task3(2.5);

    }
}

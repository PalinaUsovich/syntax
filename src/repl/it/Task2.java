package repl.it;

public class Task2 {
    String name ;
    int roll_no;

    public static void main(String[] args) {
        Task2 task = new Task2();
        task.name = "John";
        task.roll_no = 2;
        System.out.println("Name is " + task.name + " and the number is "+ task.roll_no);

    }

    /**
     * Create a class 'Main' (please do not make it public as Repl will give you an error)
     * Inside class declare a String variable 'name' and integer variable 'roll_no'.
     *
     * Create an object of the class and assign the value of 2 to roll_no and value of "John" to name
     *
     * Your program should print the following:
     * Name is John and roll number is 2
     */


}

package repl.it.encapsulation;

public class Repl182 {
    public static void main(String[] args) {
        Demo demo = new Demo();
        System.out.println("Employee Age: " + demo.getAge());
        System.out.println("Employee Name: "+demo.getName());

    }
    /**
     * Create Class EncapsulationDemo
     *
     * create two variable as shown below.
     * private String empName=John;
     * private int empAge=30;
     *
     * Create only getters methods for each variable.
     *
     * Print the values of each variable as shown below.
     *
     * Expected Output:
     * Employee Name: John
     * Employee Age: 30
     */
}
class Demo{
    private String empName = "John";
    private int empAge = 30;

    public String getName(){
        return empName;
    }
    public int getAge(){
        return empAge;
    }
}

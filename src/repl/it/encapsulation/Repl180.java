package repl.it.encapsulation;

public class Repl180 {
    public static void main(String[] args) {
        EncapsulationDemo encapsulationDemo = new EncapsulationDemo();
        encapsulationDemo.setNameAge("Palina",25);
        encapsulationDemo.getNameAge();
    }
    /**
     * Encapsulation
     * Create Class EncapsulationDemo
     * create two variable as shown below.
     *
     * private String empName;
     * private int empAge;
     *
     * Create the getter/setter methods for each variable.
     *
     * In Main Class and main method.
     * Using setter methods assign the values as "John" and "30"
     * Using getter methods print the values as below outputs.
     *
     * Expected Output:
     * Employee Name: John
     * Employee Age: 30
     */

}
class EncapsulationDemo{
    private String empName;
    private int empAge;


    public void setNameAge(String empName, int empAge){
        this.empAge = empAge;
        this.empName = empName;
    }
    public void getNameAge(){
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Age: " + empAge );
    }
}

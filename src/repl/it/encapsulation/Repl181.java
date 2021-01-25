package repl.it.encapsulation;

public class Repl181 {
    public static void main(String[] args) {
        EncapsDemo encap = new EncapsDemo();
        encap.setter("Stephan",25);
        encap.getter();
    }
    /**
     * Encapsulation
     * Create Class EncapsulationDemo that will have 2 variables empName and empAge;
     * Create the getter/setter methods for each variable.
     *
     * In Main Class and main method
     *
     * Using setter methods assign the values as "Mario" and "32"
     * Using getter methods print the values as below outputs.
     *
     *  Expected Output:
     * Employee Name: Mario
     * Employee Age: 32
     */


}
class EncapsDemo{
    private String empName;
    private int empAge;

    public void setter(String empName,int empAge){
        this.empAge = empAge;
        this.empName = empName;
    }
    public void getter(){
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Age: " + empAge);
    }
}

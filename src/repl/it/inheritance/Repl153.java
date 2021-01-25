package repl.it.inheritance;

public class Repl153 {
    public static void main(String[] args) {
        Employee emp = new Employee("Joe Smith",35,35000);
        emp.print();

        Student student = new Student("Adam Smith",15,100,10);
        student.print();

        Retiree ret = new Retiree("Frank Smith",90,150000, 10,"tour");
        ret.print();

    }


    /**
     * 1. Create four classes (Person, Employee, Student, Retiree)
     *
     * * Have properties
     * For Person: name(String)
     * For Person: lastName(String)
     * For Person: age(int)
     * For Employee: salary(int)
     * For Student: grade(int)
     * For Retiree: seniorActivity(String)
     *
     * At Employee, Student, Retiree Class have a print method
     * in each that prints the properties in line as shown in the output
     *
     * Create multilevel inheritance: Person --> Employee --> Student --> Retiree
     *
     * From your Main class create objects of the Employee, Student
     * and Retiree classes and call the print method.
     *
     *
     * Expected Output:
     * Joe Smith 35 35000
     * Adam Smith 15 10
     * Frank Smith 15 tour
     */
}
class Person {
    String name;
    int age;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }


}
class Employee extends Person{
    int salary;
    Employee(String name,int age, int salary){
        super(name,age);

        this.salary = salary;

    }
    void print(){
        System.out.println(name + " " + age + " " + salary);

    }


}
class Student extends Employee{

    Student(String name, int age, int salary, int grade){
        super(name,age, salary);

        this.grade = grade;

    }
    int grade;
    void print(){
        System.out.println(name + " " + age + " " + grade);

    }

}
class Retiree extends Student {
    Retiree(String name, int age,int salary, int grade, String seniorActivity){
        super(name,age,salary,grade);


        this.seniorActivity = seniorActivity;

    }
    String seniorActivity;
    void print(){
        System.out.println(name + " " + age + " " + seniorActivity);

    }

}


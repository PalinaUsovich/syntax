package constructors;

public class Employees {
     int age;
     String name;
     char grade;
    double decimalNumber;

    Employees(){
        System.out.println("I will be calling everytime you create an object of this class");
    }

    Employees(int getValue, String getName, char getGrade){
        System.out.println("I am initializing you fields");

        if(getValue>80 | getValue<18){
            System.out.println("You should not be working, please retire or wait to be 18yo");
        }else{
            age = getValue;
            name = getName;
            grade = getGrade;
        }

    }

     void print(){
        System.out.println("num " + age+ " name " +name + " character " + grade);

    }

    public static void main(String[] args) {
        Employees employees = new Employees();
        //employees.print();
        employees.age = 2;
        System.out.println(employees.age);

        //not using constructor


        Employees employees2 = new Employees(25,"Palina",'A');
        System.out.println(employees2.name);
        //using constructor

    }

}

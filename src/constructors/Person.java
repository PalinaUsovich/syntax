package constructors;

public class Person {

    int age;
    double salary;
    String name;
    String address;
    int numberOfKids;
    String phoneNumber;
    double weight;

    Person(int age, String name, double salary, String address){
        System.out.println(" i am the first constructor");
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;

        System.out.println(age + name + salary );
    }
    Person(int age, String name, double salary, String address, String phoneNumber){
        this(age, name, salary, address);
        this.phoneNumber = phoneNumber;
        System.out.println("I am the second constructor , have 4 fields mandatory");
        System.out.println(age + name + salary );

    }

    public static void main(String[] args) {
       // Person person1 = new Person(20, "eva",23.2,"Space");
        Person person = new Person(25,"Stephan",10000.00,"Brooklyn","8275383");
    }

}

package collection.hashset;

public  class Students {
    String name;
    int studentID;
    Students(String name, int studentID){
        this.name = name;
        this.studentID = studentID;

    }
     void getName(){
        System.out.println("Student name is : " + name);
    }
}
class Student1 extends Students{

    Student1(String name, int studentID) {
        super(name, studentID);
    }


}
class Student2 extends Students{

    Student2(String name, int studentID) {
        super(name, studentID);
    }


}
class Student3 extends Students{

    Student3(String name, int studentID) {
        super(name, studentID);
    }


}

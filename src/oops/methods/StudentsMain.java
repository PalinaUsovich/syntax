package oops.methods;

public class StudentsMain {
    public static void main(String[] args) {
        Students student1 = new Students();
        student1.ID = 10;
        student1.name = "Palina";
        Students.numOfStudents++;

        Students student2 = new Students();
        student2.ID = 20;
        student2.name = "Eva";
        Students.numOfStudents++;


        Students student3 = new Students();
        student3.name = "Stephan";
        Students.numOfStudents++;

        Students.printInfo();


    }
}

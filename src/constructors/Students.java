package constructors;

public class Students {

    String studentName;
    int grade1;
    int grade2;
    int grade3;
    double average;

    Students(String name, int mark1, int mark2, int mark3){

        studentName = name;
        grade1 = mark1;
        grade2 = mark2;
        grade3 = mark3;



    }
    void printGradeAverage(){
        average=(grade1 + grade2 + grade3)/3;
        System.out.println(studentName + " " +average);
    }
    void printSubject1Mark(){
        System.out.println("subject 1 grade "+grade1);
    }

}

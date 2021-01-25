package constructors;

public class StudentsExecute {
    public static void main(String[] args) {
        Students student1 = new Students("Palina",10,20,10);
        student1.printGradeAverage();
        student1.printSubject1Mark();
        Students student2 = new Students("Kiril",19,80,20);
        student2.printGradeAverage();
        Students student3 = new Students("Lola",50,60,70);
        student3.printGradeAverage();
        Students student4 = new Students("Kevin",10,10,10);
        student4.printGradeAverage();
        Students student5 = new Students("Jim",20,20,20);
        student5.printGradeAverage();

    }
}

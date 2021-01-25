package constructors.thiskeyWord;

public class StudentClass {
    String name;
    String address;

    StudentClass(String name , String address){

        this.address = address;
        this.name = name;

    }
    void displayInfo(){

        System.out.println(name + " " + address);
    }

    public static void main(String[] args) {
        StudentClass student = new StudentClass("Palina", "Brooklyn");
        student.displayInfo();
    }

}

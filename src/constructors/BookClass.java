package constructors;

public class BookClass {
    String bookName;
    int studentNumber;

    BookClass(String bookName, int studentNumber){
        this.bookName = bookName;
        this.studentNumber = studentNumber;
        System.out.println("Book name is <" + bookName+"> student number is " + studentNumber);
    }
    BookClass(){
        System.out.println("Welcome to Book class");
    }
}

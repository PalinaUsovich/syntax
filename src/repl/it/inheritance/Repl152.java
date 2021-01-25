package repl.it.inheritance;

import repl.it.thisKeyWord.Repl151;

public class Repl152 {


    public static void main(String[] args) {

        B b = new B();
        b.print("B");
        b.print();

    }

    /**
     * 1. Create Three classes (Main, A, B):
     *
     * Have a method that prints out the following
     * For A:  "Class A"
     * For B:  "Class B"
     *
     * Make B extend A
     *
     * From your Main class create an object of the B class and call the methods.
     *
     * Output:
     *
     * Class A
     * Class B
     */


}
class A  {
  void print (){
      System.out.println("Class A" );
  }



}
class B extends A{
    void print (String b){
        System.out.println("Class " + b);
    }


}

package repl.it.superKeyWord;

public class Repl159 {
    public static void main(String[] args) {
        BB b = new BB();
        b.display();
    }
    /**
     * Create class A
     * declare variable int i=10;
     *
     * Create class B  extends A
     * declare variable int i=20;
     *
     * create a method to display value of variable i from both classes
     *
     * In Main Class create an object of subclass and call method display
     *
     * Expected Output:
     * 20
     * 10
     */
}
class AA{
    int i = 10;
}

class BB extends AA{
    int i = 20;

    void display(){
        System.out.println(i);
        System.out.println(super.i);

    }



}

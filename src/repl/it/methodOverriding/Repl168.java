package repl.it.methodOverriding;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import oops.polymorphism.Kate;
import oops.polymorphism.Palina;
import oops.polymorphism.PalinaParents;
import oops.polymorphism.Roma;

public class Repl168 {
    public static void main(String[] args) {
        Subclass1 sub1 = new Subclass1();
        Subclass2 sub2 = new Subclass2();
        Subclass3 sub3 = new Subclass3();

        ParentWord[] subclassArray = new ParentWord[3];
        subclassArray[0] = sub1;
        subclassArray[1] = sub2;
        subclassArray[2] = sub3;

        for(ParentWord sb: subclassArray){
            sb.hello();

        }
    }
    /**
     * Create a method hello() in parent class that will print
     * "method in Parent class" then override  that method is 3
     * Subclasses implementing login to print "method in Child1/Child2/Child3 class"
     *
     * In Main Class create 3 object of the child classes and store in into
     * an array and call method hello():
     *
     * Expected Output:
     * method in Child1 class
     * method in Child2 class
     * method in Child3 class
     */
}
class ParentWord{
    void hello(){
        System.out.println("methodHello in Parent class");
    }
}
class Subclass1 extends ParentWord{
    void hello(){
        System.out.println("method in Child1 class");
    }

}
class Subclass2 extends ParentWord{
    void hello(){
        System.out.println("method in Child2 class");
    }
}
class Subclass3 extends ParentWord{
    void hello(){
        System.out.println("method in Child3 class");
    }
}

package repl.it.interfaceRepl;

public class Repl178 implements ChildInterface {
    @Override
    public void parentMethod() {
        System.out.println("Parent Method-welcome to Syntax");
    }

    @Override
    public void childMethod() {
        System.out.println("Child Method-hello Syntax");
    }

    public static void main(String[] args) {
        Repl178 repl  = new Repl178();
        repl.childMethod();
        repl.parentMethod();
    }

    /**
     * ***Follow steps carefully
     * Step 1: Create Parent Interface as
     * ParentInterface that
     * will have undefined method parentMethod
     * without parameters.
     * Step 2: Create an Interface as ChildInterface
     * that will be a child interface of Parent
     * Interface and will have a method childMethod
     * without parameters.
     *
     * Step 3: Inherit the Main class to Child Interface.
     * Step 4: Execute both methods
     * Expected Output:
     * Parent Method-welcome to Syntax
     * Child Method-hello Syntax
     */
}


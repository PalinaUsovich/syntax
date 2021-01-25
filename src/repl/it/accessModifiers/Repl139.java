package repl.it.accessModifiers;

public class Repl139 {
    /**
     * For you to do:
     * Please create methods with different access modifiers
     * (one for each access modifier) and call them properly in main method one by one
     *
     * In each method write the logic accordingly like for
     * private method write the logic in the println Statement as
     * "This is Private Method" accordingly for rest of the methods that have different
     * access modifiers should be a total of 4 outputs, please make sure they are in the
     * same order that is printed below.
     *
     * Expected Output:
     * This is Private Method
     * This is Default Method
     * This is Protected Method
     * This is Public Method
     */
    public static void publicMethod(){
        System.out.println("This is private method");
    }
    private static void privateMethod(){
        System.out.println("This is private method");
    }
    static void defaultMethod(){
        System.out.println("This is Default method");
    }
    protected static void protectedMethod(){
        System.out.println("This is protected method");

    }

    public static void main(String[] args) {
        publicMethod();
        privateMethod();
        defaultMethod();
        protectedMethod();
    }


}

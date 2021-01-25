package repl.it.interfaceRepl;

public interface MyInterface {
    void m1();
    void m2();
}
class Main implements MyInterface {

    @Override
    public void m1() {
        System.out.println("implementation of method1");
    }

    @Override
    public void m2() {
        System.out.println("implementation of method2");
    }
}

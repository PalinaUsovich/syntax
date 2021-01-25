package repl.it.interfaceRepl;

public interface Outputs {

    void display(double result);

}
interface Functions extends Outputs {
    double adding(double firstNum, double secondNum);
    double subtracting (double firstNum, double secondNum);
    double multiply(double firstNum, double secondNum);
    double dividing(double firstNum, double secondNum);

}

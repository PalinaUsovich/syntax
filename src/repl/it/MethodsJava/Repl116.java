package repl.it.MethodsJava;

import com.sun.org.apache.xml.internal.security.utils.UnsyncBufferedOutputStream;

public class Repl116 {
    /**
     * For you to do :
     *
     * Step1: Create three methods that will accept 2 in parameters on integer type
     * Step2: Write the logic in methods to perform actions below:
     *
     * The first method for multiplication
     * The second method for addition
     * The third method for subtraction
     *
     * Step3: execute all methods
     *
     * 1. for the addition method add two numbers to make 30
     * 2. for multiplication multiply two numbers to make 30
     * 3. for Subtraction subtract two numbers to equal 20
     *
     * Expected Output:
     * Addition 30
     * Multiplication 30
     * Subtraction 20
     */

    public static void m1(int num1, int num2){
        System.out.println("Addition " +(num1 + num2));
    }
    public static void m2(int num1, int num2){
        System.out.println("Maltiplication " +(num1 * num2));

    }
    public static void m3(int num1, int num2){
        System.out.println("Substraction :" + (num1-num2));

    }

    public static void main(String[] args) {
        m1(15,15);
        m2(6,5);
        m3(50,30);
    }
}

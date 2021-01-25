package repl.it.methodOverloading;

public class Repl162 {

     int num = 100;


    /**
     * Create 3 overloaded methods to perform subtraction of  2, 3 and 4 numbers
     * In main method execute all 3 methods to match the output:
     *
     * Expected Output
     * 40 (should come from subtracting 4 numbers)
     * 30 (should come from subtracting 3 numbers)
     * 20 (should come from subtracting 2 numbers)
     */
    int subtracting(int a, int b){
        return  num - a - b;
    }
    int subtracting(int a, int b, int c){
        return  num - a - b - c;
    }
    int subtracting(int a, int b, int c, int d){
        return  num - a - b - c - d;
    }

    public static void main(String[] args) {
        Repl162 repl = new Repl162();
        System.out.println(repl.subtracting(50,10));
        System.out.println(repl.subtracting(50,10,10));
        System.out.println(repl.subtracting(50,10,10,10));

    }
}

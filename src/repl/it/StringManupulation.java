package repl.it;

public class StringManupulation {
    /**
     * For you to do:
     * Create a String named s1 = "hello"  check weather string is empty or not
     * Create a String named s2 = ""  check weather string is empty or not
     *
     * Expected Output:
     * false
     * true
     */
    public static int countOddNum(int number){
        int sum =0;

        for(int i = 0; i<=number; i+=2){
            sum = sum + i;

        }
        System.out.println("sumEvenTox(" + number + ")==>" + sum);
        return sum;
       

    }

    public static void main(String[] args) {
        StringManupulation z = new StringManupulation();
       z.countOddNum(5);

    }


}

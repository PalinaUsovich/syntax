package oops.methods;

public class Tsk2 {
    public static String evenOdd(int num){
        String answer ="";

        if(num % 2 == 0){
            answer ="Even";
        }else{
            answer = "Odd";
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Tsk2.evenOdd(10));
    }
}

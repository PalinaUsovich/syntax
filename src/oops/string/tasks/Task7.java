package oops.string.tasks;

public class Task7 {
    public static String reverse(String s){
//       String reversed ="";
//        for(int i =s.length()-1; i>=0; i--){
//            reversed = reversed + s.charAt(i);
//
//        }


        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.reverse().toString();


       // return reversed;

    }



    public static void main(String[] args) {
////        String st = "Palina";
//        System.out.println(Task7.reverse(st));
        String a = Task7.reverse("Palina");
        System.out.println(a);
    }
}

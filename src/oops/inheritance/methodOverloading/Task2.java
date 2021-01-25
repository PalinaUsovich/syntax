package oops.inheritance.methodOverloading;

public class Task2 {
      static  void call(int phoneNumber){
         System.out.println("int phoneNumber");
    }
      static void call(int phoneNumber, int suffix){
         System.out.println("int phoneNumber, int suffix");

    }
      static void call(int suffix, int phoneNumber,String name){
        System.out.println("int suffix, int phoneNumber");

    }

    public static void main(String[] args) {

        Task2.call(65847);
        //OR
        call(7574647,1);
        call(4747,1);
    }





}

package oops.string.tasks;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        String nameForBoy = "Lucas";
        String nameForGirl = "Penelope";
        Scanner sc = new Scanner(System.in);
        System.out.println("Mom's first  name?");
        String momName = sc.nextLine();
        System.out.println("Dad's first  name?");
        String dadName = sc.nextLine();
        System.out.println("Boy or Girl");
        String babyGender = sc.nextLine();
        if(babyGender.equalsIgnoreCase("boy")){
            System.out.println("Suggested baby name: " + nameForBoy);
        }else{
            System.out.println("Suggested baby name: " + nameForGirl);
        }


    }
}

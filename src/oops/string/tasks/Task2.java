package oops.string.tasks;

import java.util.Scanner;

public class Task2 {
    public void acceptUserPassword(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter userName");
        String userName = sc.nextLine();
        System.out.println("Enter password");
        String password = sc.nextLine();
        System.out.println("Confirm password");
        String confirmedPassword = sc.nextLine();



        if(userName.isEmpty() || password.isEmpty() ){
            System.out.println("Username and password cannot be empty!");

        }else{
            if(password.length()<8){
                System.out.println("Password is too short, must be at least 8 characters");

            }else {
                if(password.contains(userName)){
                    System.out.println("cannot contain userName");

                }else{
                    if(!password.equals(confirmedPassword)){
                        System.out.println("Passwords do no match");

                    }else{
                        System.out.println("Your username and password has been created");
                    }
                }
            }

        }


        }


    }


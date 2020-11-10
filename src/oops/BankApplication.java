package oops;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class BankApplication {
    public static void main(String[] args) {
        Account palinasAccount = new Account();
           palinasAccount.userName = "Palina";
           palinasAccount.password = "01936";
           palinasAccount.balance = 10;
           palinasAccount.limit = 200;
           palinasAccount.typeOfAccount = "Checking";
           boolean isLoggedIn = palinasAccount.login("Palina", "01936");
        System.out.println(isLoggedIn);
        if(isLoggedIn){
            System.out.println("Welcome to Syntax account");
        }else{
            System.out.println("Invalid user name or password");
        }

        double transferMoney = palinasAccount.transaction(0);

        if(transferMoney==0){
            System.out.println("Insufficient balance");
        }else {
            System.out.println(transferMoney + " transferred");
        }
       // System.out.println(palinasAccount.transaction(11));



    }
}

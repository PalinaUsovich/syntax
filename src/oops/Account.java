package oops;

public class Account {
    String accountId;
    String userName;
    String password;
    double balance;
    double limit;
    boolean isBlocked;
    String typeOfAccount ;

    boolean login(String enteredUserName, String enteredPassword) {
        if(userName.equals(enteredUserName) && password.equals(enteredPassword)){
            return true;
        }else{
            return false;
        }
    }
    double transaction(double transferMoney){
      if(transferMoney>balance){
          return-1;
       }else{
          balance = balance - transferMoney;
      }return transferMoney;
    }



}

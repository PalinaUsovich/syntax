package repl.it.encapsulation;

public class Repl183 {
    public static void main(String[] args) {
        Account account = new Account();
        account.setValues(67345873,"Lola","lola@gmail.com",2000.0);
        account.getValues();
    }
    /**
     * Create Class Account
     * Create the below variables:
     * acc_no;
     * name;
     * email;
     * double amount;
     *
     * Create the getter/setter methods for each variable.
     *
     * In Main Class and the main method.
     * Using setter methods assign the values as:
     * acc_no = 7560504000
     * name = Sumair
     * email = sumair@syntax.com
     * amount = 50000.0
     * Using getter methods print the values as below output.
     *
     * Expected Output:
     *
     * 7560504000 Sumair sumair@syntax.com 50000.0
     *
     */
}
class Account{
    private int accountNumber;
    private String name;
    private String email;
    private double amount;
    public void setValues(int accountNumber,String name,String email,double amount){
        this.accountNumber = accountNumber;
        this.name = name;
        this.email = email;
        this.amount = amount;
    }
    public void getValues(){
        System.out.println(accountNumber + " " + name + " " + email + " " + amount );
    }

}

package oops.inheritance;

public class UserClass {
    String name;
    String mobileNumber;

//

    UserClass(String name, String mobileNumber){
        this.mobileNumber = mobileNumber;
        this.name = name;
        System.out.println("From UserClass");
    }

}



class UserInfo extends UserClass {
    String userAddress;

    UserInfo(String name, String mobileNumber,String userAddress){
       super(name, mobileNumber);
        this.userAddress = userAddress;
        System.out.println("From userInfo class");
    }

    void details(){
        System.out.println("User name " + name + " User number " + mobileNumber + "User address " + userAddress);

    }
    public static void main(String[] args) {
        UserInfo user = new UserInfo("Palina", "227637865", " 2276 East");
        user.details();


    }


        }








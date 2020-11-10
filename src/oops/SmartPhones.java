package oops;

public class SmartPhones {
    String brand;
    String operSystem;

    void call(String phoneNumber){
        System.out.println("Phone calls" + phoneNumber );
        if(phoneNumber.length() == 5){
            System.out.println("dialling the number");
        }else{
            System.out.println("Wrong number");
        }
    }

    void takePics(){
        System.out.println("Phone takes pics");
    }
    public void text(String text){
        System.out.println(brand + " sends text: " + text);
    }

}

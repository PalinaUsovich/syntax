package oops.string.charAt;

public class Task3 {
    public static void main(String[] args) {

        String string = "Pillow!";

        if(!string.isEmpty()){
            if(string.length()%2==0 && string.length()>=3){
                System.out.println(string.charAt(3));
            }else{
                System.out.println("Length is not even number");
            }
        }
        for(int i = string.length()-1; i>=0; i--){
            System.out.println(string.charAt(i));
        }
    }
}

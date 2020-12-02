package oops.methods;

public class HelloInDifflanguages {
    public static String Hello(String languages){
        String output = "";
        if(languages.equalsIgnoreCase("spanish")){
            output = "Hola";
        }else if(languages.equalsIgnoreCase("russian") ){
            output = "Привет";
        }else if(languages.equalsIgnoreCase("english")){
            output = "Hello";
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println(HelloInDifflanguages.Hello("russian"));
    }
}

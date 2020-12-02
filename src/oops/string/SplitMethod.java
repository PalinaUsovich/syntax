package oops.string;

public class SplitMethod {
    public static void main(String[] args) {


    String names = "Palina8* Eva*& Stephan";
    String[] array = names.split("[^A-Za-z]");//for learning more about regex W#scool regex
    for (String name:array){
        System.out.println(name);
    }

}
 }
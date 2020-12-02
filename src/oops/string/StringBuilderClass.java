package oops.string;

public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello world");
        stringBuilder.append(", Palina");
       // stringBuilder.replace(0,stringBuilder.length(),"By");
        System.out.println(stringBuilder);
    }

}

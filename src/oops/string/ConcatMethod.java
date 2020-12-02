package oops.string;

public class ConcatMethod {
    public static void main(String[] args) {
        String firstName = "Palina";
        String lastName = " Usovich";
        String completeName = firstName.concat(lastName);
        System.out.println(completeName);
        String name = "Stephan";
        String name1 = null;
        System.out.println(firstName.concat(name1));
        System.out.println(firstName+lastName+name1);

    }
}

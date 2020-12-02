package oops.string;

public class EqualsIgnoreCase {
    public static void main(String[] args) {
        String dogName = "Eva";
        String catName = "EVA";
        System.out.println(dogName.equalsIgnoreCase(catName));
        System.out.println(catName.equalsIgnoreCase(dogName));

    }
}

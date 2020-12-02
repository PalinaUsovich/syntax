package oops.string;

public class EqualsMethod {
    public static void main(String[] args) {
        String day = "Day";
        String night = "Night";
        String day1 = "Day";
        System.out.println(day.equals(day1));
        System.out.println(day.equals(night));
        System.out.println(day==day1);

        String name = new String ("Palina");
        String name2 = new String("Katya");
        String name3 = new String("Palina");
        System.out.println(name.equals(name2));
        System.out.println(name.equals(name3));
        System.out.println(name==name3);


    }
}

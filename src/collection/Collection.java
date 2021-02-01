package collection;



import java.util.Arrays;

public class Collection {
    public static void main(String[] args) {
        int initialSize = 3;
        String[] names = new String[initialSize];
        names[0] = "Palina";
        names[1] = "Ali";
        names[2] = "Stephan";

        System.out.println(names.length);
        names = expandArray(names);
        names[3] = "Dora";
        System.out.println(names.length);
        System.out.println(Arrays.toString(names));

    }

    public static String[] expandArray(String[] oldArray) {
        String[] newArray = new String[oldArray.length * 2];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        return newArray;
    }
}

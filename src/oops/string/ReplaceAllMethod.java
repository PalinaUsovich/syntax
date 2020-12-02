package oops.string;

public class ReplaceAllMethod {
    public static void main(String[] args) {
        String mix = "215hello 89 World74659 *****&";
        System.out.println(mix.replaceAll("[0-9]",""));
        System.out.println(mix.replaceAll("[a-z]",""));
        System.out.println(mix.replaceAll("[a-z A-Z]",""));
        System.out.println(mix.replaceAll("[^A-Za-z0-9]",""));
        System.out.println(mix.replaceAll("\\s+",""));//replacing space


    }
}

package oops.string.tasks;

public class Task3 {
    public static void main(String[] args) {
        String string = "I love you";
        String newString = string.replaceAll("\\s+","");
        System.out.println(newString);
        String new1string = string.replace(" ","");
        System.out.println(new1string);
        String comb = new String("87465-=&%$3New York");
        String newComb = comb.replaceAll("[^A-z a-z]","");
        System.out.println(newComb.length());


        String a = "Is it Saturday? Is it Raining? Do we have a java class?";
        String b = a.replaceAll("[A-Z a-z]","");
        System.out.println(b.length());

        String sen = "Is it Saturday? Is it Raining? Do we have a java class?  yes.";
        System.out.println(sen.replaceAll("[\\sA-Za-z0-9]","").length());

    }
}

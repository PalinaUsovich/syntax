package oops.string.tasks;

public class Task8 {
    private static String vowelOnly(String s){
        String newStr = "";
        for(int i =0; i<s.length(); i++ ){
            char ch = s.charAt(i);
            if(ch =='a' || ch =='o' || ch=='u' || ch=='e'|| ch=='i'){
                newStr = newStr+ch;
            }

        }
       // return newStr;
       return s.replaceAll("[^AEIUOaeiuo]","");


    }

    public static void main(String[] args) {
        String string = " Palina";
        System.out.println(vowelOnly(string));
        System.out.println(vowelOnly("cucumbEr"));
    }

}

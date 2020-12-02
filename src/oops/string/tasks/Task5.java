package oops.string.tasks;

public class Task5 {
    public static void main(String[] args) {
        String str = "Pillow talk ";
//        for(int i = str.length()-1; i>=0; i-- ){
//            System.out.println(str.charAt(i));
//        }
       String [] reversed  = str.split(" ");
       String reversedString = "";

        for(int i = 0; i < reversed.length; i ++){
          String word = reversed[i];
          String reversedWord = "";

          for(int j = word.length()-1; j >= 0; j--){
              reversedWord += word.charAt(j);
          }
          reversedString+=reversedWord +" ";
        }

        System.out.println(str);
        System.out.println(reversedString);





    }
}

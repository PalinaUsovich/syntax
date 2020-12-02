package oops.methods;

public class IsPalindromeTask {
    public static boolean isPalindrome(String string){
        boolean palindrome;
        String reversedString = "";
        for(int i =string.length()-1;i>=0; i--){
            reversedString = reversedString + string.charAt(i);
        }
        System.out.println(reversedString);
        if(reversedString.equals(string)){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(IsPalindromeTask.isPalindrome("raceca"));
    }
}

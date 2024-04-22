package homework.HW1;


public class Palindrome{

    public static boolean isPalindrome(String s){

        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
        //System.out.println(s);
        int length = s.length();
        boolean palindrome = true;

        for(int i = 0; i < length/2; i++){
            if(s.charAt(i) != s.charAt(length - 1 - i)){
                palindrome = false; 
                break;
            }
        }
        return palindrome;
    }

    public static void main(String[] args) {
        String myPalindrome = "#^!/race car";

        System.out.println("Palindrome: " + isPalindrome(myPalindrome));
    }


}
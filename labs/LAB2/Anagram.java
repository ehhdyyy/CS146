package labs.LAB2;
import java.util.*;

public class Anagram {

    public static boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()){
            return false;
        }else{
            s = s.toLowerCase();
            t = t.toLowerCase();

            char sArray[] = s.toCharArray();
            char tArray[] = t.toCharArray();

            Arrays.sort(sArray);
            Arrays.sort(tArray);

            for(int i = 0; i < sArray.length; i++){
                if(sArray[i] != tArray[i]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "rtvxv";
        String t = "xvrtA";

        System.out.println(isAnagram(s,t));
    }
}

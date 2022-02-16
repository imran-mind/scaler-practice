package MathsProblems;

import java.util.Locale;

public class ValidPalindrome {
    public static boolean isAlphaNumeric(String s) {
        return s != null && s.matches("^[a-zA-Z0-9]*$");
    }
    public static String getCompressedStr(String s){
        String newStr = "";
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(isAlphaNumeric(s.charAt(i)+"") ){
                newStr = newStr + s.charAt(i)+"";
            }
        }
        return newStr;
    }

    public static String reverseString(String s){
        String r = "";
        for(int i=s.length()-1; i>=0; i--){
            r = r + s.charAt(i);
        }
        return r;
    }
    public static boolean isPalindrome(String s){
        String originalStr = getCompressedStr(s).toLowerCase(Locale.ROOT);
        String reverseStr = reverseString(originalStr);
        if(originalStr.equals(reverseStr)){
            System.out.println("string is palindrome");
        }else{
            System.out.println("string is not palindrome");
        }
//        System.out.println(str);
        return false;
    }
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
//        String str = "race a car";
//        String str = " ";
        isPalindrome(str);
    }
}

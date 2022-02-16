package MathsProblems;

import java.util.ArrayList;
import java.util.List;

public class PalindromeNum {


    /*
    * Example 1:

    Input: x = 121
    Output: true
    Explanation: 121 reads as 121 from left to right and from right to left.
    Example 2:

    Input: x = -121
    Output: false
    Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
    Example 3:

    Input: x = 10
    Output: false
    Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
    * */
    public static boolean isPalindrome(int x) {
        String str = x+"";
        String rev = "";
        for(int i=str.length()-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        return str.equals(rev);
    }
    public static void main(String[] args) {
        int x = 11;
        System.out.println(isPalindrome(x));
    }
}

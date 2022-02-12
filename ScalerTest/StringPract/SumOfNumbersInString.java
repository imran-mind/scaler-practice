package StringPract;

import java.util.regex.Pattern;

//https://practice.geeksforgeeks.org/problems/sum-of-numbers-in-string-1587115621/1

//Example 1:
//
//        Input:
//        str = 1abc23
//        Output: 24
//        Explanation: 1 and 23 are numbers in the
//        string which is added to get the sum as
//        24.
public class SumOfNumbersInString {

    public static long findSum(String str) {
        int num =0;
        int sum =0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) >= '0' && str.charAt(i)<='9'){
                num = num * 10 + Integer.parseInt(str.charAt(i)+"");
            }else {
                sum = sum + num;
                num = 0;
            }
        }
        return sum+ num;
    }

    public static void main(String[] args) {
        String s ="i3aimran87sh";
        System.out.println();
        System.out.println("ans "+findSum(s));
//        System.out.println(Integer.parseInt("a"));
    }
}

package MathsProblems;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CountingBits {

//    Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.
//338. Counting Bits
//
//  https://leetcode.com/problems/counting-bits/
//    Example 1:
//
//    Input: n = 2
//    Output: [0,1,1]
//    Explanation:
//            0 --> 0
//            1 --> 1
//            2 --> 10
//    Example 2:
//
//    Input: n = 5
//    Output: [0,1,1,2,1,2]
//    Explanation:
//            0 --> 0
//            1 --> 1
//            2 --> 10
//            3 --> 11
//            4 --> 100
//            5 --> 101

    public static int binaryCount(int n){
        if(n==0 || n==1){
            return n;
        }
        int c=0;
        while (n>0){
            int rem = n%2;
            c = c + rem;
            n = n/2;
        }
        return c;
    }
    public static int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i=0; i<=n; i++){
            ans[i] = binaryCount(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Arrays.toString(countBits(n)));
    }
}

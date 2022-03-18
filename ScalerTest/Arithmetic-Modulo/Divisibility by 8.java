/*
Divisibility by 8

Problem Description
You are given a number A in the form of a string. Check if the number is divisible by eight or not.

Return 1 if it is divisible by eight else, return 0.


Problem Constraints
1 <= length of the String <= 100000
'0' <= A[i] <= '9'


Input Format
The only argument given is a string A.


Output Format
Return 1 if it is divisible by eight else return 0.


Example Input
Input 1:
A = "16"
Input 2:

A = "123"


Example Output
Output 1:
1
Output 2:

0


Example Explanation
Explanation 1:
 16 = 8 * 2
Explanation 2:

123 = 15 * 8 + 3
*/
public class Solution {
    public int solve(String A) {
        int i=A.length()-1;
        int ans = 0;
        int j = 0;

        for(int k =i ; k>=0; k--){
            if(j<3){
                int val = A.charAt(k) - '0';
                int op =  (val%8 * 1<<j);
                // System.out.println(op);
                ans = ans + op ;
            }else{
                break;
            }
            j++;
        }
        // System.out.println("ans"+ans);
        
        if(ans%8 == 0)
            return 1;
        else return 0;
    }
}

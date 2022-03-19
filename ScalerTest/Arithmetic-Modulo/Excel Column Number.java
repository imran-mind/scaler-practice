/*https://www.scaler.com/academy/mentee-dashboard/class/19185/assignment/problems/74?navref=cl_tt_nv*/
public class Solution {
    public int titleToNumber(String A) {
        int n = A.length();
        int ans = 0;
        // int p = n;
        for(int i=0; i<n; i++){
            int asc = (A.charAt(i) - 65) + 1;
            ans = ans + (asc * (int) Math.pow(26,n-i-1));
            // p--;
        }
        return ans;
    }
}

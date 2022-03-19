/*https://www.scaler.com/academy/mentee-dashboard/class/19185/assignment/problems/14605/?navref=cl_pb_nv_tb*/
public class Solution {
    public int findMod(String A, int p) {
        int n = A.length();
        long ans = 0;
        long exp = 1;
        long mod = p;
        for(int i=n-1; i>=0; i--){
            int v = A.charAt(i) - '0';
            ans = ans + (v % mod * exp) % mod;
            ans = ans % p;
            exp = (exp * 10) % p;
            // System.out.println("rem "+ans);
        }
        return (int) ans;
    }
}

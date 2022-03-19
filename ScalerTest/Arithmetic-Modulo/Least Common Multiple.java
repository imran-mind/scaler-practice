/*https://www.scaler.com/academy/mentee-dashboard/class/19185/homework/problems/11261?navref=cl_tt_nv*/
public class Solution {
    int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
     
    public int LCM(int a, int b) {
        return (a / gcd(a, b)) * b;
    }
}

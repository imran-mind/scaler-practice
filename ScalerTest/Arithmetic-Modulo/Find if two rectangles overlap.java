/*https://www.scaler.com/academy/mentee-dashboard/class/19185/homework/problems/4104?navref=cl_tt_nv*/
public class Solution {
    public int solve(int A, int B, int C, int D, int E, int F, int G, int H) {
        int x1 = Math.max(A, E);
        int y1 = Math.max(B, F);
        int x2 = Math.min(C, G);
        int y2 = Math.min(D, H);
        if(x1 < x2 && y1 < y2)
            return 1;
        return 0;
    }
}

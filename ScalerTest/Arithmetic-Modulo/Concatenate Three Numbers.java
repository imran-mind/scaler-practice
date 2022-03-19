/*https://www.scaler.com/academy/mentee-dashboard/class/19185/homework/problems/10198?navref=cl_tt_nv*/
public class Solution {
    public int solve(int A, int B, int C) {
       int[] arr = new int[3];
       arr[0] = A;
       arr[1] = B;
       arr[2] = C;
       Arrays.sort(arr);
       StringBuilder b = new StringBuilder();
       b.append(arr[0]);
       b.append(arr[1]);
       b.append(arr[2]);
       int ans = Integer.parseInt(new String(b));
    //    System.out.println(ans);
       return ans;
    }
}

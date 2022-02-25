package array;

import java.util.Arrays;

public class RangSumQuery {

    public static long[] rangeSum(int[] A, int[][] B) {
        int bLen = B.length;
        long[] ans = new long[bLen];
        int n = A.length;

        long[] ps = new long[n];
        ps[0] = A[0];
        for(int i=1; i<n; i++){
            ps[i] = ps[i-1] + A[i];
        }
        int k=0;
        for(int j=0; j<bLen; j++){
            int s = B[j][0] - 1; // 0
            int e = B[j][1] - 1; // 3
            if(s == 0){
                ans[k] = ps[e];
            }else{
                ans[k] = ps[e] - ps[s-1];
            }
            k++;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 2};//{1, 2, 3, 4, 5};
        int[][] b ={{1,1},{2,3}} ;//{{1,4},{2,3}};
        long[] ans = rangeSum(arr,b);
        System.out.println(Arrays.toString(ans));
    }
}

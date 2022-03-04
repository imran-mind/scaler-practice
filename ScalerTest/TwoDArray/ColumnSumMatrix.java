package TwoDArray;

import java.util.Arrays;

public class ColumnSumMatrix {
    public static int[] solve(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        int[] res = new int[m];

        for(int j=0; j<m; j++){
            int sum =0;
            for(int i=0; i<n; i++) {
//                System.out.print(A[i][j] + " ");
                sum = sum + A[i][j];
            }
            res[j] = sum;
//            System.out.println(sum);
        }
        return res;
    }
    public static void main(String[] args) {
        int[][] A = {{1,2,3,4}, {5,6,7,8}, {9,2,3,4}};//{{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        int[] arr = solve(A);
        System.out.println(Arrays.toString(arr));

    }
}

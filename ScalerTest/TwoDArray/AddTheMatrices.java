package TwoDArray;

import java.util.Arrays;

public class AddTheMatrices {

    public static int[][] solve(int[][] A, int[][] B) {
        int n = A.length;
        int m = A[0].length;
        int[][] res = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
//                System.out.println(A[i][j]);
                res[i][j] = A[i][j] + B[i][j];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[][] A = {{1}, {6}, {2} ,{3}, {10}, {1}, {3}};//{{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        int[][] B = {{1}, {6}, {7}, {3}, {8}, {1}, {2}};//{{9, 8, 7},{6, 5, 4},{3, 2, 1}};
        int[][] arr = solve(A,B);
        for(int i=0; i< arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}

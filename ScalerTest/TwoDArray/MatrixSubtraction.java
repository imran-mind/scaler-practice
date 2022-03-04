package TwoDArray;

import java.util.Arrays;

public class MatrixSubtraction {
    public static int[][] solve(int[][] A,int[][] B) {
        int n = A.length;
        int m = A[0].length;
        int[][] res = new int[n][m];

        for(int j=0; j<m; j++){
            for(int i=0; i<n; i++) {
                res[i][j] = A[i][j] - B[i][j];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[][] A = {{1,2,3}, {4,5,6}, {7,8,9}};//{{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        int[][] B = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};//{{1, 2, 3},{4, 5, 6},{7, 8, 9}};

        int[][] arr = solve(A,B);
        for(int i=0; i< arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }

    }
}

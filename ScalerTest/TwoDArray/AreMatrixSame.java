package TwoDArray;

public class AreMatrixSame {

    public static int solve(int[][] A, int[][] B) {
        int n = A.length;
        int m = A[0].length;
        for(int i=0; i<n; i++){

            for(int j=0; j<m; j++){

                if(A[i][j] != B[i][j])
                    return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int[][] A = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        int[][] B = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        System.out.println(solve(A,B));
    }
}

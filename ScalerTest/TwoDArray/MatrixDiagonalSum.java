package TwoDArray;

public class MatrixDiagonalSum {

    public static int diagonalSum(int[][] mat) {
        int sum = 0;

        for(int i = 0; i < mat.length; i++){

            for(int j = 0; j <= i; j++){
                if(i == j) {
                    sum = sum + mat[i][j];
//                    System.out.println("1st mat[" + i + "][" + j + "] " + mat[i][j]);
                }
            }
        }
        int n = mat.length-1; // 2
        int m = n; // 2 1

        for(int i = 0; i <= n; i++) {
            if(i != m){
//                System.out.println("2nd mat[" + i + "][" + m + "] " + mat[i][m]);
                sum = sum + mat[i][m];
            }
            m--;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,1,1,1},{1,1,1,},{1,1,1,1},{1,1,1,1}};
//        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//        int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
        int sum = diagonalSum(arr);
        System.out.println("Mat sum => "+sum);
    }
}

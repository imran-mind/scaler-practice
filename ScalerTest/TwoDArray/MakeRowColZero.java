package TwoDArray;

import java.util.Arrays;

/*You are given a 2D matrix A, make all the elements in a row or columns zero if A[i][j] == 0 Specifically.
* Make entire ith row and jth column zero*/
public class MakeRowColZero {

    public static void markZero(int[][] mat){

        int n = mat.length;
        int m = mat[0].length;
        boolean[] row = new boolean[n];
        boolean[] col = new boolean[m];

        for(int i=0; i<n; i++){
            row[i] = false;
        }
        for(int i=0; i<m; i++){
            col[i] = false;
        }

        for(int i=0; i<n; i++){

            for(int j=0; j<m; j++){

                if(mat[i][j] == 0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        for(int i=0; i<n; i++){

            for(int j=0; j<m; j++){

                if(row[i]== true | col[j] == true){
                    mat[i][j] = 0;
                }
            }
        }

        System.out.println(Arrays.toString(row));

        System.out.println(Arrays.toString(col));

    }

    public static void main(String[] args) {
        int[][] mat = {{0,2,3,4},{5,6,7,1},{9,2,1,4}};
        markZero(mat);
        for(int i=0; i<mat.length; i++){
            System.out.println(Arrays.toString(mat[i]));
        }

    }
}

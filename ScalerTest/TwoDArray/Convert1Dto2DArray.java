package TwoDArray;

import java.util.Arrays;

public class Convert1Dto2DArray {

    public static void display2DArray(int[][] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static int[][] construct2DArray(int[] original, int m, int n) {

        int[][] twoDArray = new int[m][n];
        int mat = m * n;
        if(mat != original.length)
            return new int[0][0];
        int k = 0;
        for(int i=0; i<m; i++){

            for(int j=0; j< n; j++){
                twoDArray[i][j] = original[k];
                k++;
            }
        }
        System.out.println(Arrays.toString(twoDArray));
        return twoDArray;
    }

    public static void main(String[] args) {
      int[] arr =  {1,2};
      int m =1, n = 1;
      int[][] twoDArr = construct2DArray(arr, m, n);
      display2DArray(twoDArr);
    }
}

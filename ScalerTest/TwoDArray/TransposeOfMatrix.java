package TwoDArray;

import java.util.Arrays;

public class TransposeOfMatrix {

    public static void display2DArray(int[][] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }

//    it means change row to column and column to row
    public static void transposeOfMatrix(int[][] arr){
        int n = arr.length;

        for(int i=0; i<n; i++){

            for(int j=0; j<i; j++){
                // swap logic
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        display2DArray(arr);
        transposeOfMatrix(arr);
        System.out.println("------------");
        display2DArray(arr);
    }
}

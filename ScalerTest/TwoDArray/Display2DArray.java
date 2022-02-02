package TwoDArray;

import java.util.Arrays;

public class Display2DArray {

    public static void display2DArray(int[][] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static void wavePrintOf2DArray(int[][] arr){
        int rows = arr.length;
        int cols = arr[0].length;
        System.out.println(cols);
        for(int c=0; c<cols; c++){

            if(c % 2 == 0){
                for(int r=0; r<rows; r++){
                    System.out.print(arr[r][c]+" ");
                }
            }else {
                for(int r=rows-1; r>=0; r--){
                    System.out.print(arr[r][c]+" ");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        wavePrintOf2DArray(arr);
//        display2DArray(arr);
    }
}

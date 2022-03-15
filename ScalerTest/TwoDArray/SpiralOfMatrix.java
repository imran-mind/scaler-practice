package TwoDArray;

import java.util.ArrayList;
import java.util.Arrays;

public class SpiralOfMatrix {

    /*
    * Right -> Left => Top ++
    * Top -> Botton => Right --
    * Left -> Right => Bottom --
    * Bottom -> Top => Left ++
    * */
    public static ArrayList spiralOfMat(int[][] a, int r, int c){
        int top = 0;
        int bottom = r-1;
        int left = 0;
        int right = c-1;
        ArrayList<Integer> ans = new ArrayList<>();
        while (top<=bottom && left<=right){
            //Right to Left => Top++
            for(int i=left; i<=right; i++){
                ans.add(a[top][i]);
            }
            top++;

            //Top -> Botton => Right --
            for(int i=top; i<=bottom; i++){
                ans.add(a[i][right]);
            }
            right--;

            if(top <= bottom){
                for(int i=right; i>=left; i--){
                    ans.add(a[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom; i>=top; i--){
                    ans.add(a[i][left]);
                }
                left++;
            }
        }

        return ans;
    }


    // Given an integer A, generate a square matrix filled with elements from 1 to A^2 in spiral order
    public static int[][] matrixInSpiralOrderOptimizedApproach(int A){
        int counter = 1;
        int[][] mat = new int[A][A];
        int i=0,j=0;

        while (A>1){
            //Left ro Right , row is constant
            for(int k=1; k<A; k++){
                mat[i][j] = counter;
                counter++;
                j++;
            }
            //Top to Bottom , col is constant
            for(int k=1; k<A; k++){
                mat[i][j] = counter;
                counter++;
                i++;
            }
            //Left to Right, row is constant
            for(int k=1; k<A; k++){
                mat[i][j] = counter;
                counter++;
                j--;
            }
            for(int k=1; k<A; k++){
                mat[i][j] = counter;
                counter++;
                i--;
            }
            A = A - 2;
            i++;
            j++;
        }
        if(A == 1){
            mat[i][j] = counter;
        }
        return mat;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int r = 4, c= 4;
//        ArrayList<Integer> ans = spiralOfMat(arr,r,c);

//        System.out.println(ans);
        int[][] mat = matrixInSpiralOrderOptimizedApproach(4);

        for(int i=0; i<mat.length; i++){
            System.out.println(Arrays.toString(mat[i]));
        }
    }
}

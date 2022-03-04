package TwoDArray;

import java.util.ArrayList;
import java.util.Arrays;

public class GenerateSpiralMatrix {

    public static int[][] spiralOfMat(int A){
        int n= A*A;
        int[][] mat = new int[A][A];
        int[] items = new int[n];

        for(int i=1; i<=n; i++){
            items[i-1] = i;
        }
        int r = A, c= A;
//        System.out.println(Arrays.toString(items));
        int top = 0;
        int bottom = r-1;
        int left = 0;
        int right = c-1;
        int k=0;
//        ArrayList<Integer> ans = new ArrayList<>();
        while (top<=bottom && left<=right){
            //Right to Left => Top++
            for(int i=left; i<=right; i++){
//                ans.add(a[top][i]);
                mat[top][i] = items[k];
                k++;
            }
            top++;

            //Top -> Botton => Right --
            for(int i=top; i<=bottom; i++){
//                ans.add(a[i][right]);
                mat[i][right] = items[k];
                k++;
            }
            right--;

            if(top <= bottom){
                for(int i=right; i>=left; i--){
//                    ans.add(a[bottom][i]);
                    mat[bottom][i] = items[k];
                    k++;
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom; i>=top; i--){
//                    ans.add(a[i][left]);
                    mat[i][left] = items[k];
                    k++;
                }
                left++;
            }
        }

        return mat;
    }
    public static void main(String[] args) {

//        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        int A = 4;
        int[][] arr = spiralOfMat(A);
        for(int i=0; i< arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}

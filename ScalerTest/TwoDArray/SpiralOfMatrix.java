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
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int r = 4, c= 4;
        ArrayList<Integer> ans = spiralOfMat(arr,r,c);

        System.out.println(ans);
    }
}

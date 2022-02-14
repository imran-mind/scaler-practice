package array;

import java.util.Arrays;

public class MoveZeroToEnd {
    public  static void moveZerotoEnd(int[] a){
        int count = 0;
        int n = a.length;
        for(int i=0; i<n; i++){
            if(a[i] != 0){
                a[count++] = a[i];
            }
        }
        while (count < n){
            a[count++] = 0;
        }
        System.out.println(count);
        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args) {
        int[] ar ={0,1,0,3,12};//{0,1,-2,3,4,0,5,-27,9,0};
        moveZerotoEnd(ar);
    }
}

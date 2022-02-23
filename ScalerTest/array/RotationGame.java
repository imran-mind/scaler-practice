package array;

import java.util.Arrays;

public class RotationGame {
    public static void revese(int[] arr,int i, int j){
        while(i<j){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
            j--;
        }
    }
    /*
    * First reverse full array 0 to n
    * Reverse 0 to k-1 array
    * Reverse k to n-1 array
    * */
    public static void main(String[] args) {
        int[] arr = {1,2, 3, 4};
        int n = 4;
        int k = 2;

        k = k % n;
        revese(arr, 0, n-1);
        revese(arr,0, k-1);
        revese(arr,k, n-1);
        System.out.println(Arrays.toString(arr));
//        for(int i=0; i<n; i++){
//            System.out.print(arr[i]+" ");
//        }
    }
}

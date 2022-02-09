package array;

import java.util.Arrays;

public class RotateArrayByKth {

//    O(n^2) Approach
    public static void rotate(int[] arr, int k){
        if (k < 0 ) {
            return;
        }
        int n = arr.length;
        for(int p=1; p<=k; p++){

            int last= arr[n-1];
//            System.out.println(arr[n-1]);

            for(int i=n-2; i>=0; i--){
//                temp = arr[i];
                arr[i+1] = arr[i];
            }
            arr[0] = last;
        }
    }

    public static void reverse(int[] arr, int low, int high){
        while(low < high){
            //swapping logic
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
    public static void rotateEff(int[] arr,int k){
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 16;
//        rotate(nums,k);
        rotateEff(nums,k);
        System.out.println("rotated "+ Arrays.toString(nums));
    }
}

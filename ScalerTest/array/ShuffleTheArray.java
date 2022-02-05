package array;

import java.util.Arrays;

public class ShuffleTheArray {
    public static int[] shuffle(int[] nums, int n) {
        int m = nums.length;
        int[] arr = new int[m];

        int k=0;
        int slow = 0;
        int fast = n;
        while (slow<n){
            arr[k] = nums[slow];
            arr[k+1] = nums[fast];
            System.out.println("slow "+slow + "fast "+fast );
            k = k+2;
            slow++;
            fast++;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] a = {7,5,9,7,5,8,10,4,3,3,2,5,9,10};
        int n = 7;
//        int[] a = {2,5,1,3,4,7};
//        int[] a = {1,2,3,4,4,3,2,1};
//        int[] a = {1,1,2,2};
//        int n = 3;
//        int n = 4;
//        int n = 2;
        int[] ans =shuffle(a,n);
        System.out.println(Arrays.toString(ans));

    }
}

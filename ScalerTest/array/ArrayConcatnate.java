package array;

import java.util.Arrays;

public class ArrayConcatnate {

    public static int[] arrayConcatenate(int[] nums){
        int n = nums.length;
        int[] ans = new int[n*2];

        int i = 0;
        while (i < n){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
            i++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] a = {1,2,1};
        int[] arr = arrayConcatenate(a);
        System.out.println(Arrays.toString(arr));
    }
}

package array;

import java.util.Arrays;

public class ArrayConcatenation {
    public static int[] getConcatenation(int[] nums) {
        int[] newArr = new int[nums.length * 2];
        int n = newArr.length;

        int k = 0;
        for(int i=0; i<n/2; i++){
                newArr[i] = nums[k];
                k++;
                System.out.println(Arrays.toString(newArr));
        }
        k = 0;
        for(int i=n/2; i<n; i++ ){

            newArr[i] = nums[k];
            k++;
        }
        return newArr;
    }
    public static void main(String[] args) {
        int[] a = {1,2,1};//
        System.out.println(Arrays.toString(getConcatenation(a)));
    }
}

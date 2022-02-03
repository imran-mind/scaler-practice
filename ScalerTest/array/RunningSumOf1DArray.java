package array;

import java.util.Arrays;

public class RunningSumOf1DArray  {

    public static int[] runningSum(int[] nums) {
        int[] arr = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            int sum = 0;
            for(int j=0; j <= i; j++){
                System.out.print("nums["+i+"] "+nums[j]);
                sum = sum + nums[j];
            }
            System.out.println();
            arr[i] = sum;
        }

        return arr;
    }
    public static void main(String[] args) {
        int[] arr= {1,2,3,4};
//        int[] arr= {8000,9000,2000,3000,6000,1000};

        int[] ans =  runningSum(arr);
        System.out.println(Arrays.toString(ans));
    }
}

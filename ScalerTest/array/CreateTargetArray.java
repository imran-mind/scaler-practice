package array;

import java.util.Arrays;

public class CreateTargetArray {

    public static int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        int[] res = new int[n];
        for(int i=0; i<n; i++){
            res[i] = -1;
        }
        for(int i=0; i<n; i++){
            int idx = index[i];
            if(res[idx] >= 0){
//                System.out.println("nums[i] "+nums[i] + " Idx "+idx);
//                res[idx] = nums[i];
//                System.out.println(Arrays.toString(res));

                for(int j=n-1; j>idx; j--){
//                    System.out.println(res[j] + " " +res[j-1]);
//                    int temp = nums[j];
                    res[j] = res[j-1];
                }
//                System.out.println(Arrays.toString(res));
                res[idx] = nums[i];
            }else{
                res[i] = nums[idx];
//                res[i] = nums[i];

            }
        }
        return res;
    }
    public static void main(String[] args) {
//        int[] nums = {0,1,2,3,4};
//        int[] index = {0,0,0,0,0};
//        int[] nums = {1,2,3,4,0};
//        int[] index = {0,1,2,3,0};
//        int[] nums = {0,1,2,3,4};
//        int[] index = {0,1,2,2,1};
//        int[] nums = {0,1,0};
//        int[] index = {0,1,0};
        int[] nums = {1};
        int[] index = {0};

        int[] ans = createTargetArray(nums, index);
        System.out.println(Arrays.toString(ans));
    }
}

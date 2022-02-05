package array;

import java.util.ArrayList;
import java.util.Arrays;

public class SmallestIndexWithEqualValue {


    public static int smallestEqual(int[] nums) {

        int ans = -1;

//        int[] arr = new int[nums.length];
        ArrayList<Integer> list = new ArrayList<>();
//        int k=0;
        for(int i=0; i<nums.length; i++){
            int rem = i % 10;
            if(nums[i] == rem){
                list.add(i);
//                k++;
            }
        }
        System.out.println(list);
        if(list.size()==0)
            return ans;

        int min = list.get(0);

        for(int i=1; i<list.size(); i++){
            if(list.get(i) < min){
                min = list.get(i);
            }
        }
        return min ;//>= 0 ? ans : -1;
    }

    public static void main(String[] args) {
        int[] arr= {0,1,2};
//        int[] arr= {4,3,2,1};
//        int[] arr= {1,2,3,4,5,6,7,8,9,0};
//          int[] arr = {7,8,3,5,2,6,3,1,1,4,5,4,8,7,2,0,9,9,0,5,7,1,6};
        System.out.println(smallestEqual(arr));
    }
}

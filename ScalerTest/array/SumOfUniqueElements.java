package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumOfUniqueElements {

    public static int sumOfUnique(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        System.out.println(map.toString());
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            int v = nums[i];
            if(map.get(v) == 1){
                sum = sum + v;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};//{1,1,1,1,1}; //{1,2,3,2};
        System.out.println(sumOfUnique(a));
    }
}

package array;



// write your code here...// write your code here...
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.



//Example 1:
// {
//     7: 0,
//     2: 1,
//        -2: 2,
//        -6, 3
// }
// 15 (10 + 5) (0,1)
// tv-arr[idx] = y => hm.
// idx = 0, 15-10 = 5 => hm => if present.
// [10,5,12,13] =>15
// i = 0;
// 15-10 == 5 -> 1
// {10:0, 5:1, 12:2, 13: 3}

// {5:0, 10:1, 3:2, 2:3}

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

// 3 sum , you are given an array find 3 element , which add up t target.
// [7,10,5,2,1,2] target 8 , (1,2,5) true or false


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class TwoValSumInArray{
    public static int[] compareTargetNum(int[] nums, int target){
        Map<Integer,Integer> map = new HashMap<>(); // O(N)
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], i);
        }
        System.out.println(map);
        for(int i=0; i<nums.length; i++){ // O(N) + O(N) = 2 O(N)
            int diff = target - nums[i];
            // int val =  map.get(diff); // 1 , Null;
            if(map.get(diff) != null){ // O(1)
                ans[0] = i;
                ans[1] = map.get(diff);
                break;
            }
        }

        return ans;
    }
    public static void main(String[] args){
        int[] nums = {2,7,11,15};//{12,7,11,15,2};
        int target = 9;
        int[] ans = compareTargetNum(nums, target);
        System.out.println(Arrays.toString(ans));
    }
}

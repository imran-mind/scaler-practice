package Hashing;

import java.util.*;

public class LongestSubarraySum {
    public static ArrayList<Integer> longestSubarraySumZero(ArrayList<Integer>  A){
        ArrayList<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> hashMap = new HashMap<>();
        int n = A.size();
        int[] ps = new int[n];
        int len = Integer.MIN_VALUE;
        int s = 0;
        int e = 0;
        ps[0] = A.get(0);
        for(int i=1; i<n; i++){
            ps[i] = ps[i-1] + A.get(i);
        }

        hashMap.put(0,-1);
        for(int i=0; i<n; i++){
            if(hashMap.containsKey(ps[i])){
                int prevIndex = hashMap.get(ps[i]);
                int diff = i - prevIndex;
                if(diff > len){
                    len = diff;
                    s = prevIndex;
                    e = i;
                }
                System.out.println("s "+s+" e "+e);
            }else{
                hashMap.put(ps[i], i);
            }
        }
        for(int i=s+1; i<=e; i++){
            ans.add(A.get(i));
        }
//       System.out.println(Arrays.toString(ps));

        return ans;
    }

    public static void main(String[] args) {
        //{-8, 8, -1, -16, -28, -27, 15, -14, 14, -27, -5, -6, -25, -11, 28, 29, -3, -25, 17, -25, 4, -20, 2, 1, -17, -10, -25};
        int[] nums = {1, 2, -3, 3};//{1,2,-2,4,-4};//{ 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };//{1, 2, -3, 3};//////
        //{10, 13, -1, 8, 29, 1, 24, 8, 21, 20, 21, -23, -21, 0};  // {0, -10, 20, 3, 23, 10, -20, 2, 19, -29, 0 }; //{-19, 8, 2, -8, 19, 5, -2, -23 };//
//        int[] arr1 = {15, -2, 2, -8, 1, 7, 10, 23};//{8,-19, 8 ,2, -8, 19, 5, -2, -23};//;//{1,2,-2,4,-4};//{1, 2, -3, 3};//;//{1,2,-2,4,-4};//{10, 5, 3, 4, 3, 5, 6};//{1, 2, 2, 1};
        ArrayList<Integer> A = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            A.add(nums[i]);
        }
        System.out.println(longestSubarraySumZero(A));
//        printAllSubarrays(nums);
    }
}

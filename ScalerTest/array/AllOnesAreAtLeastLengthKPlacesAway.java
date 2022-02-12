package array;

//      1437. Check If All 1's Are at Least Length K Places Away
//      https://leetcode.com/problems/check-if-all-1s-are-at-least-length-k-places-away/
    //Example 1:
    //
    //
    //        Input: nums = [1,0,0,0,1,0,0,1], k = 2
    //        Output: true
    //        Explanation: Each of the 1s are at least 2 places away from each other.
    //        Example 2:
    //
    //
    //        Input: nums = [1,0,0,1,0,1], k = 2
    //        Output: false
    //        Explanation: The second 1 and third 1 are only one apart from each other.
public class AllOnesAreAtLeastLengthKPlacesAway {

    public static boolean kLengthApart(int[] nums, int k) {
        boolean ans = true;

        int n = nums.length;
        int i=0;
        int prevIdx = i;
        while (i<n){
            int zeroCount =0;
            if(nums[i] == 1 && i ==0){
                prevIdx = i;
            }
            if(nums[i] == 1 && i != 0){
                int diff = Math.abs(i-prevIdx);
                if(diff >= k+1){
                    ans = true;
                }else {
                    ans = false;
                }
                prevIdx = i;
            }

            i++;
        }

        return ans;
    }
    public static void main(String[] args) {
       int[] nums = {1,0,0,1,0,1};
       int k = 2;
        System.out.println(kLengthApart(nums,k));
    }
}

package array;

/*https://leetcode.com/problems/monotonic-array/
    896. Monotonic Array
    * An array is monotonic if it is either monotone increasing or monotone decreasing.
    An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is monotone decreasing if for all i <= j, nums[i] >= nums[j].
    Given an integer array nums, return true if the given array is monotonic, or false otherwise.

    Example 1:

    Input: nums = [1,2,2,3]
    Output: true
    Example 2:

    Input: nums = [6,5,4,4]
    Output: true
    Example 3:

    Input: nums = [1,3,2]
    Output: false
* */
public class MonotonicArray {
    public static boolean decreasing(int[] A){
        for(int i=0; i<A.length-1; i++){
            if(A[i] < A[i+1])
                return false;
        }
        return true;
    }
    public static boolean increasing(int[] A){
        for(int i=0; i<A.length-1; i++){
            if(A[i] > A[i+1])
                return false;
        }
        return true;
    }
    public static boolean isMonotonic(int[] nums) {
        return increasing(nums) || decreasing(nums);
    }
    public static void main(String[] args) {
        int[] nums = {6,5,4,4};//{1,2,2,3};{1,3,2};
        System.out.println(isMonotonic(nums));
    }
}

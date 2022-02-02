package array;

public class BinarySearch {

    public static int search(int[] nums, int target) {
        int s = 0;
        int e = nums.length-1;

        while(s<=e){
            int mid = s + (e - s)/2;
            if(nums[mid] < target){
                s = mid + 1;
            }else if (nums[mid] > target){
                e = mid - 1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 3;
        int ans = search(arr, target);
        System.out.println(ans);
    }
}

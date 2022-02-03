package array;

public class NumberofGoodPairs {

    public static  int numIdenticalPairs(int[] nums) {
        int ans = 0;
        int n = nums.length;
        for(int i=0; i<n; i++){

            for(int j= i+1; j<n; j++){

                if(nums[i] == nums[j] && i < j){
                    ans = ans + 1;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
//        int[] arr= {1,2,3,1,1,3};
        int[] arr= {1,2,3};

        int ans =  numIdenticalPairs(arr);
        System.out.println(ans);
    }
}

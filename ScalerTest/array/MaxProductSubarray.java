package array;

public class MaxProductSubarray {

/*152. Maximum Product Subarray
    * Given an integer array nums, find a contiguous non-empty subarray within the array that has the largest product, and return the product.
    The test cases are generated so that the answer will fit in a 32-bit integer.
    A subarray is a contiguous subsequence of the array.

        Example 1:

            Input: nums = [2,3,-2,4]
            Output: 6
            Explanation: [2,3] has the largest product 6.
        Example 2:

            Input: nums = [-2,0,-1]
            Output: 0
            Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
* */

    //Brute force approach O(n)^2
    public static int maxProdSubarray(int[] a){
        int sum = a[0];
        for(int i=0; i<a.length; i++){
            int prod = 1;
            for(int j=i; j<a.length; j++){
                prod = prod * a[j];
                if(prod>sum){
                    sum = prod;
                }
            }
            System.out.println(prod);
        }
        return sum;
    }

    //optimize approach O(n)
    public static int maxProdSubArrayOptimize(int[] a){
        int ans = a[0];
        int ma = ans;// Integer.MIN_VALUE;
        int mi = ans; //Integer.MAX_VALUE;
        for(int i=1; i<a.length; i++){
            if(a[i] < 0){
                int temp = ma;
                ma = mi;
                mi = temp;
            }
            ma = Math.max(a[i], ma*a[i]);
            mi = Math.min(a[i], mi*a[i]);
            ans = Math.max(ans,ma);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,-2,4}; //{-2,0,-1};
//        System.out.println("prod "+maxProdSubarray(arr));
        System.out.println("prod "+maxProdSubArrayOptimize(arr));

    }
}

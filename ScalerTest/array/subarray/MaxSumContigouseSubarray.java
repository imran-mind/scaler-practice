package array.subarray;

public class MaxSumContigouseSubarray {
    public static long subArraySumOptimized(int[] a){
        int  ans = 0;
        int n = a.length;
        int max=a[0];
        for(int i=0; i<n; i++){
            int start = i+1;
            int end = n-i;

            int totalSubarray = start * end;
            int contribution = a[i] * totalSubarray;
            ans = ans + contribution;
            max = Math.max(max,ans);
        }
        System.out.println("max "+max);
        return ans;
    }


    static int maxSubArraySum(int a[])
    {
        int size = a.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

        for (int i = 0; i < size; i++)
        {
            max_ending_here = max_ending_here + a[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
            System.out.println(max_so_far);
            if(max_so_far == 12)
                break;
        }
        return max_so_far;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 4, 5};
//        System.out.println(subarraySum(arr));
//        System.out.println(subArraySumOptimized(arr));
        System.out.println(maxSubArraySum(arr));

    }
}

package array;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumsEqualsK {

    public static int subArraySumEqualK(int[] arr,int k){
        int ans = 0;
        int n =arr.length;

        for(int i=0; i<n; i++){
            int sum =0;
            for(int j=i; j<n; j++){
                sum = sum + arr[j];
                if(sum == k){
                    ans++;
                }
//                if(arr[i] + arr[j] == k) {
//                    System.out.println("arr[" + i + "] " + arr[i] + " : arr[" + j + "] " + arr[j]);
//                }
            }
        }
        return ans;
    }
    public static int subArraySumEqualKOptimized(int[] arr,int k){
        int count = 0;
        int n =arr.length;
        int sum = 0;
        Map<Integer,Integer> prevSum = new HashMap<>();

        for(int i=0; i<n; i++){
           sum = sum + arr[i];

           if(sum == k)
               count++;

           if(prevSum.get(sum - k) != null){
               count = count + prevSum.get(sum-k);
           }

           if(prevSum.get(sum) != null){
               prevSum.put(sum, prevSum.get(sum)+1);
           }else{
               prevSum.put(sum, 1);
           }
        }
        System.out.println(prevSum);
        // {3:1 , 7:1, 14:1}
        return count;
    }
    public static void main(String[] args) {
        int[] items = {3,4,7,2,-3,1,4,2};//{1,1,1};//{1,2,3,4,5};
        int k=7;
//        System.out.println(subArraySumEqualK(items,k));
        System.out.println(subArraySumEqualKOptimized(items,k));

    }
}

package Hashing;

import java.util.HashMap;
import java.util.HashSet;

public class SubarrayWith0sum {
    public static boolean subArrayExists(int arr[], int n) {
        //Your code here
        HashSet<Integer> set = new HashSet<>();
        int preSum = 0;
        for(int i=0; i<n; i++){
            preSum = preSum + arr[i];
            if(preSum == 0)
                return true;
            if(set.contains(preSum)){
                return true;
            }else{
                set.add(preSum);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {4,2,-3,1,6};
        System.out.println(subArrayExists(arr,arr.length));
    }
}

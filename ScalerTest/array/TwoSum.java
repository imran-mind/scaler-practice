package array;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static boolean twoSumApproach1(int[] a, int target){
        Arrays.sort(a);
        int n = a.length;
        int l = 0;
        int r = n-1;

        while (l<r){
            if(a[l] + a[r] == target) {
               return true;
            }
            else if(a[l]+a[r] > target)
                r--;
            else
                l++;
        }
        return false;
    }

    public static boolean twoSumApproach2(int[] a, int target){
        boolean ans = false;
        int n = a.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            map.put(a[i], i);
        }
        for(int j=0; j<n; j++){
            int val = target - a[j];
            Integer idx = map.get(val);
            if(idx != null && idx != j ){
                System.out.println(j+" "+idx);
                return true;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2,7,11,1,8,15};
        int target = 9;
        System.out.println(twoSumApproach1(arr,target));
//        System.out.println(twoSumApproach2(arr,target));

    }
}

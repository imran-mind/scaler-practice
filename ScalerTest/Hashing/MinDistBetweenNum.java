package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MinDistBetweenNum {

    public static int solve(ArrayList<Integer> A) {
        Map<Integer,Integer> map = new HashMap<>();
        int n = A.size();
        int min = Integer.MAX_VALUE;
        for(int i =0; i<n; i++){
            if (map.containsKey(A.get(i))) {
                int idx = map.get(A.get(i));
                int diff = Math.abs(i - idx);
//                    System.out.println(diff);
                min = Math.min(min, diff);
            } else {
                map.put(A.get(i), i);
            }
        }
        if(min == Integer.MAX_VALUE)
            return -1;
        return min;
    }
    public static void main(String[] args) {
        int[] arr1 = {7, 1, 3, 4, 1, 7};
        ArrayList<Integer> A = new ArrayList<>();
        for(int i=0; i<arr1.length; i++){
            A.add(arr1[i]);
        }
        System.out.println(solve(A));
    }
}

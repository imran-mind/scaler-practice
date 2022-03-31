package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//https://www.scaler.com/academy/mentee-dashboard/class/21193/homework/problems/855?navref=cl_tt_lst_sl
public class KOccurrences {

    public static int getSum(int A, int B, ArrayList<Integer> C) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<A; i++){
            map.put(C.get(i), map.getOrDefault(C.get(i), 0)+1 );
        }
        int sum = 0;
        boolean flag = false;
        for(Integer key: map.keySet()){
            int val = map.get(key);
            if(val==B){
                flag = true;
                sum = sum +key;
            }
        }

//        System.out.println(map);
        if(flag){
            return sum;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,2, 2, 3, 3};
        ArrayList<Integer> A = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            A.add(nums[i]);
        }
        int n=nums.length;
        int k=2;
        System.out.println(getSum(n,k,A));
    }
}

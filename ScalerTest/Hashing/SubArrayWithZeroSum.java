package Hashing;

import java.util.*;

public class SubArrayWithZeroSum {

    public static int solve1(ArrayList<Integer> A) {
        int n = A.size();
        int[] PS = new int[n];
        PS[0] = A.get(0);
        for(int i=1; i<n; i++){
            PS[i] = A.get(i) + PS[i-1];
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            if(PS[i] == 0)
                return 1;
            map.put(PS[i], map.getOrDefault(PS[i], 0)+1);
        }
//        System.out.println(Arrays.toString(PS));
        for(Integer key: map.keySet()){
            int val = map.get(key);
            if(val>1)
                return 1;
        }

//        System.out.println(map);
        return 0;
    }

    public static int solve(ArrayList<Integer> A){
        HashSet<Long> set = new HashSet<>();
        long preSum = 0;
        int n = A.size();
        for(int i=0; i<n; i++){
            preSum = preSum + A.get(i);
            if (A.get(i) == 0 || preSum == 0|| set.contains(preSum))
                return 1;

            // Add sum to hash set
            set.add(preSum);
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};//{10, 5, 3, 4, 3, 5, 6};//{1, 2, 2, 1};
        ArrayList<Integer> A = new ArrayList<>();
        for(int i=0; i<arr1.length; i++){
            A.add(arr1[i]);
        }
        System.out.println(solve(A));
    }
}

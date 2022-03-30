package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FirstRepeatingElement {

    public static int solve(ArrayList<Integer> A) {
        ArrayList<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map1 = new HashMap<>();
        int n = A.size();
        for(int i=0; i<n; i++){
            map1.put(A.get(i), map1.getOrDefault(A.get(i), 0)+1);
        }
        for(int i=0; i<n; i++){
            int val = map1.get(A.get(i));
            if(val>1)
                return A.get(i);
        }
        return -1;
    }
    public static void main(String[] args) {

        int[] arr1 = {6, 10, 5, 4, 9, 120};//{10, 5, 3, 4, 3, 5, 6};//{1, 2, 2, 1};
        ArrayList<Integer> A = new ArrayList<>();
        for(int i=0; i<arr1.length; i++){
            A.add(arr1[i]);
        }
        System.out.println(solve(A));
    }
}

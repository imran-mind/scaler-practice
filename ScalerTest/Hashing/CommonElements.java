package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CommonElements {
    public static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map1 = new HashMap<>();
        Map<Integer,Integer> map2 = new HashMap<>();
        int n = A.size();
        int m = B.size();
        for(int i=0; i<n; i++){
            map1.put(A.get(i), map1.getOrDefault(A.get(i), 0)+1);
        }
        for(int i=0; i<m; i++){
            map2.put(B.get(i), map2.getOrDefault(B.get(i), 0)+1);
        }
//        System.out.println(map1);
//        System.out.println(map2);

        for(Integer key : map1.keySet()){
            if(map1.get(key) != null && map2.get(key) != null ){
                int mapVal1 = map1.get(key);
                int mapVal2 = map2.get(key);
                int val = Math.min(mapVal1 , mapVal2);
//                System.out.println("key : "+key + " minval "+val);
                for(int j=0; j<val; j++){
                    list.add(key);
                }
            }
        }
        return list;

    }
    public static void main(String[] args) {

        int[] arr1 = {2, 1, 4, 10};//{1, 2, 2, 1};
        int[] arr2 = {3, 6, 2, 10, 10};//{2, 3, 1, 2};
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        for(int i=0; i<arr1.length; i++){
            A.add(arr1[i]);
        }
        for(int i=0; i<arr1.length; i++){
            B.add(arr2[i]);
        }
        System.out.println(solve(A,B));
    }
}

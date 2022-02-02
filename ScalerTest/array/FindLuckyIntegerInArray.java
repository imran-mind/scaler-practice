package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindLuckyIntegerInArray {

    public static int findLucky(int[] arr) {
        int luckyNum = -1;
        int[] luckies = new int[arr.length];

        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int val = arr[i];
            map.put(val, map.getOrDefault(val, 0)+1);
        }
//        System.out.println(map);
        Set keys = map.keySet();
        int p =0;
        for(Object key: keys){
            int k =  (int) key;
            int v =  map.get(key);
            if(k == v){
//                System.out.println("k : "+k +" v : "+v);
                luckies[p] = k;
            }
            p++;
//            System.out.println(key + ": " + key.equals(map.get(key)));
        }
//        int max= luckies[0];
        for(int i=0; i<luckies.length; i++){
            if(luckies[i] > luckyNum){
                luckyNum = luckies[i];
            }
        }
//        System.out.println(Arrays.toString(luckies));
        return luckyNum == 0 ? -1 : luckyNum;
    }
    public static void main(String[] args) {
        int[] arr = {2,2,2,3,3};//{1,2,2,3,3,3};//{2,2,3,4};
        System.out.println("Lucky int "+findLucky(arr));
    }
}

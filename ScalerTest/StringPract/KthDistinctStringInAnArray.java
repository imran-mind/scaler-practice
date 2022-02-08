package StringPract;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class KthDistinctStringInAnArray {

    /*
      String ans = "";
    * {"d":1, "b":2, "c":2, "a":1}
    * String key = map.getKey();
    * int val = map.getVal();
    * if(val == 1){
    *   ans = key;
    * }
    * */
    public static String kthDistinct(String[] arr, int k) {
        String ans = "";
        Map<String,Integer> map = new LinkedHashMap<>();
        for(int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }

//        System.out.println(map);

        Set keys = map.keySet();
//        System.out.println("All keys are: " + keys);
        // To get all key: value
        int count = k;
        int m = 0;
        for(Object key: keys){
            if(map.get(key) == 1 && count > 0) {
//                System.out.println("map.get(key) "+map.get(key));
                ans = (String) key;
                m++;
                count--;
            }
        }
//        System.out.println(m+" ** "+k);

        if(m == k){
            return ans;
        }else{
//            System.out.println("ans " + ans);
            return "";
        }
    }

    public static void main(String[] args) {
        String[] str = {"d","b","c","b","c","a"};
        int k = 2;
//        String[] str = {"aaa","aa","a"};
//        int k = 1;
//        String[] str = {"a","b","a"};
//        int k = 3;
        String res = kthDistinct(str,k);
        System.out.println("res "+res);
    }
}

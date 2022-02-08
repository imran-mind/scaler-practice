package StringPract;

import java.util.HashMap;
import java.util.Map;

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
        Map<String,Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
//            map1.put(word, map1.getOrDefault(word,0)+1);

            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
//        System.out.println(map);
        if(map.size() <= k){
            return ans;
        }
        int max = 0;
        int p = k;
        for(int i=0; i<arr.length; i++){
            if(map.get(arr[i]) == 1 && i >= max && p!=0){
//                System.out.println(p);
                ans = arr[i];
                max = i;
                p--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
//        String[] str = {"d","b","c","b","c","a"};
//        int k = 2;
//        String[] str = {"aaa","aa","a"};
//        int k = 1;
        String[] str = {"a","b","a"};
        int k = 3;
        String res = kthDistinct(str,k);
        System.out.println("res "+res);
    }
}

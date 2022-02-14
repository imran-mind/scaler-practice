package array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FirstRepeatingElement {

    public static int firstRepeatingElement(int[] a){
        Map<Integer,Integer> map = new HashMap();
        int ans = -1;
        for(int i=0; i<a.length; i++){
           map.put(a[i], map.getOrDefault(a[i],0)+1);
        }
        for(int i=0; i<a.length; i++){
            if(map.get(a[i])>1){
                    return i+1;
            }
        }
        System.out.println(map);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {5,8,6};//{7,4 ,0 ,9 ,4 ,8, 8, 2, 4, 5, 5, 1};// {1, 5, 3, 4, 3, 5, 6}; {1, 5, 3, 4, 3, 5, 6};
        System.out.println(firstRepeatingElement(arr));
    }
}

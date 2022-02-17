package array;

import java.util.Arrays;
import java.util.HashMap;

public class TwoNumSumInArr {

    public static int[] towSumInArr(int[] a,int t){

        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        for(int i=0; i<a.length; i++){
            map.put(a[i],i);
        }

        System.out.println(map);
        for(int i=0; i<a.length; i++){
            int diff = t-a[i];
            System.out.println(diff);
            if(map.get(diff) != null){
//                System.out.println(i+" "+map.get(diff));
                ans[0] = i;
                ans[1] = map.get(diff);
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(towSumInArr(numbers,target)));
    }
}

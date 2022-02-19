package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class TwoRepeatedElements {

    public static int[] twoRepeated(int arr[], int N) {
        int[] ans = new int[2];

        HashMap<Integer,Integer> map = new HashMap<>();

        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<N; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int k = 0;
        for(int i=0; i<N; i++){
            if(map.get(arr[i]) ==  2){
                set.add(arr[i]);
            }
        }
        for(Integer item : set){
            ans[k] = item;
            k++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1,3,4,3};
        System.out.println(Arrays.toString(twoRepeated(arr, arr.length)));
    }
}

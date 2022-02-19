package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class FindDuplicatesInArray {

    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0; i<n; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        HashSet<Integer> set = new HashSet<Integer>();

        // System.out.println(map);
        for(int i=0; i<n; i++){
            if(map.get(arr[i]) > 1){
                //  System.out.println(arr[i]);
                set.add(arr[i]);
            }
        }
        if(set.size() == 0){
            list.add(-1);

        }else{
            for(Integer item : set){
                list.add(item);
            }
        }

        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,1,2,3};
        System.out.println(duplicates(arr,arr.length));
    }
}

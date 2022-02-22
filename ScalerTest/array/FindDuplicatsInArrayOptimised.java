package array;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicatsInArrayOptimised {

    public static List<Integer> findDuplicates(int[] arr,int n){
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            int idx = Math.abs(arr[i]) - 1;
            int val = arr[idx];
            if(val < 0)
                list.add(idx+1);
            else
                arr[idx] = arr[idx] * -1;
        }
        return list;
    }
    public static void main(String[] args) {
        int[] a = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(a, a.length));
    }
}

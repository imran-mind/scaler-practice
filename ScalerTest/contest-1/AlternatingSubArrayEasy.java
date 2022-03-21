package contest;

import java.util.ArrayList;
import java.util.Arrays;

public class AlternatingSubArrayEasy {

    public static boolean isAlternating(int[] a, int s, int e){
        for(int i=s+1; i<=e; i++){
            if(a[i] == a[i-1])
                return false;
        }
        return true;
    }

    public static int[] alternatingSubarr(int[] a, int b){
        int k = 2*b+1;
        int s = 0;
        int e = k-1;
        int n = a.length;
        ArrayList<Integer> list = new ArrayList<>();
        while (e<n){
            if(isAlternating(a, s, e)){
                list.add(s+b);
            }
            s++;
            e++;
        }
        int[] ans = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr =  {1,0,1,0,1}; //{0, 0, 0, 1, 1, 0, 1};//{1, 1, 0, 1, 1, 0, 1};//{1,0,1,0,1}; //
//        int[] arr = {1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1 };
        int B = 1;
        System.out.println(Arrays.toString(alternatingSubarr(arr,B)));
    }
}

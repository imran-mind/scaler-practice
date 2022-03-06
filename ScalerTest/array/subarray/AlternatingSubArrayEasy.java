package array.subarray;

import java.util.ArrayList;

public class AlternatingSubArrayEasy {

    public static ArrayList<Integer> solve(int[] a,int b){
        ArrayList<Integer> list = new ArrayList<>();
        int n = a.length;

        for(int i=b; i<n; i++){
//            int BValue = 2*b+1;
            int k = 0;
            boolean flag = false;
            for(int j= i-1; j >= 0; j--){
                System.out.print(a[j]+"=>");
                if(a[i] != a[j] && k<b)
                    flag = true;
                k++;
            }
            k = 0;
            for(int j= i+1; j < n; j++){
                System.out.print(a[j]+"=>");
                if(a[i] != a[j] && k<b)
                    flag = true;
                else
                    flag = false;
                k++;
            }
            if(flag)
                list.add(i);
            System.out.println();
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {1,0,1,0,1};
        int B = 1;
        System.out.println(solve(arr,B));
    }
}

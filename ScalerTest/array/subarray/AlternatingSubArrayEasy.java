package array.subarray;

import java.util.ArrayList;
import java.util.Arrays;

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

    public static int[] solve1(int[] arr, int b){
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=b; i<n; i++){
            if(b>0){
                int k = b;
                boolean isValidLeft = false;
                boolean isValidRight = false;
                for(int j=i; j>0; j--){
                    if(k>0){
                        if(arr[j] != arr[j-1]){
                            isValidLeft = true;
                        }else {
                            isValidLeft = false;
                            break;
                        }
                    }
                    k--;
                }
                int p = b;
                for(int j=i; j<n-b; j++){
                    if(p>0){
                        if(arr[j] != arr[j+1]){
                            isValidRight = true;
                        }else {
                            isValidRight = false;
                            break;
                        }
                    }
                    p--;
                }
//                System.out.println("i => "+i +" isValidLeft "+isValidLeft);
                if(isValidLeft && isValidRight){
                    list.add(i);
                }
            }else{
                list.add(i);
            }
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
        System.out.println(Arrays.toString(solve1(arr,B)));
    }
}

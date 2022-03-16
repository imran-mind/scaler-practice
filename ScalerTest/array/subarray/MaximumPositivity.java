package array.subarray;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumPositivity {


    public static int[] solve(int[] A) {
        ArrayList<Integer> maxArray = new ArrayList<Integer>();
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        long maxSum = 0;
        long newSum = 0;
        int idx = Integer.MAX_VALUE;
        System.out.println("idx "+idx);
        int n = A.length;
        for(int i =0; i<n; i++){
            if(A[i] >= 0){
                newSum = newSum + A[i];
                newArray.add(i);
            }else{
                System.out.println("newArray.size()"+newArray.size()+" i "+i);

                int newIdx = i - newArray.size();
                if(newIdx<idx){
                    idx = newIdx;
                }
//                idx = Math.min(idx, i-newArray.size());
                System.out.println("idx else "+idx);

                newSum = 0;
                newArray = new ArrayList<Integer>();
            }
            if((maxSum < newSum) || ((maxSum == newSum) && (newArray.size()> maxArray.size()))){
                maxSum = newSum;
                maxArray = newArray;
            }
        }
        int[] ans = new int[maxArray.size()];
        // for(int i=0; i<maxArray.size(); i++){
        //     ans[i] = maxArray.get(i);
        // }
        int count = 0;
        for(int i=idx; i<A.length; i++){
            if(A[i]>=0)
                count++;
            else
                break;
        }
        int[] ans1 = new int[count];
        for(int i=idx; i<A.length; i++){
            if(A[i]>=0)
                ans1[i] = A[i];
            else
                break;
        }
        return ans1;
    }

    static ArrayList<Integer> longestSubarry(int arr[], int n)
    {
        // Initialize result
        int res = 0;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++)
        {
            int val = arr[i];
            ArrayList<Integer> l1 = new ArrayList<>();
            int curr_count = 0;
            System.out.println("start "+i);
            if(val >= 0)
                l1.add(i);
            while (i < n && arr[i] >= 0){
                curr_count++;
                i++;
            }
            System.out.println("end" +i);
            if(i == 0)
                continue;
//            int pre = ;
            if(arr[i-1] >= 0) {
                l1.add(i-1);
                list.add(l1);
            }
            // Update result if required.
            res = Math.max(res, curr_count);
        }
        int idx = -1;
        int m = -1;
        for(int i=0; i<list.size(); i++){
            int start = list.get(i).get(0);
            int end = list.get(i).get(1);
            int len = end - start + 1;
            if(len > m){
//                System.out.println("insidenif "+i+" len "+len+" m "+m);
                idx = i;
                m = len;
            }
        }
        ArrayList<Integer> ansPos =  list.get(idx);
        System.out.println("ansPos "+ansPos);
        ArrayList<Integer> ans = new ArrayList<>();
        int sPos =ansPos.get(0);
        int ePos = ansPos.get(1);
        System.out.println("sPos "+sPos+" ePos "+ePos);
        for(int i=sPos; i<=ePos; i++){
            ans.add(arr[i]);
        }
//        System.out.println("idx "+idx+" items "+list.get(idx));
        return ans;
    }
    public static void main(String[] args) { //{-2,5, 6, -1, 7, 8}; //
        int[] arr = {-3674875, 5305422, 7665178, 205505, -7168198, -1398091, 5392310, -1700856, 1259052, -3056006};//{8986143, -5026827, 5591744, 4058312, 2210051, 5680315, -5251946, -607433, 1633303, 2186575};//{8986143, -5026827, 5591744, 4058312, 2210051, 5680315, -5251946, -607433, 1633303, 2186575};// {8986143, -5026827, 5591744, 4058312, 2210051, 5680315, -5251946, -607433, 1633303, 2186575}; //{8986143, -5026827, 5591744, 4058312, 2210051, 5680315, -5251946, -607433, 1633303, 2186575};//{1, 2, 3, 4, 5, 6};//{
//        System.out.println(Arrays.toString(solve(arr)));
        System.out.println(longestSubarry(arr,arr.length));
    }
}

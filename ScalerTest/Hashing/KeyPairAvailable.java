package Hashing;

import java.util.HashMap;
import java.util.HashSet;

/*
    https://practice.geeksforgeeks.org/problems/key-pair5616/1
   * Given an array Arr of N positive integers and another number X. Determine whether or not there exist two elements in Arr whose sum is exactly X.
       Example 1:
           Input:
           N = 6, X = 16
           Arr[] = {1, 4, 45, 6, 10, 8}
           Output: Yes
           Explanation: Arr[3] + Arr[4] = 6 + 10 = 16
       Example 2:
           Input:
           N = 5, X = 10
           Arr[] = {1, 2, 4, 3, 6}
           Output: Yes
           Explanation: Arr[2] + Arr[4] = 4 + 6 = 10
   * */
public class KeyPairAvailable {

    public  static boolean hasArrayTwoCandidates(int arr[], int n, int x) {

        HashMap<Integer,Integer> map = new HashMap();
        for(int i=0; i<n; i++){

            if(map.containsKey(x-arr[i]))
                return true;
            map.put(arr[i],1);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr= {1, 4, 45, 6, 10,8}; //{1,4,45,10,5};
        int x = 16; //8
        int n = arr.length;
        System.out.println(hasArrayTwoCandidates(arr,n,x));
    }

}

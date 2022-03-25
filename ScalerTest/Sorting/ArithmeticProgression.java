package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArithmeticProgression {
    //https://www.scaler.com/academy/mentee-dashboard/class/21191/assignment/problems/10208/submissions
    public static int solve(ArrayList<Integer> A) {
        int n = A.size();
        Collections.sort(A);
        System.out.println(A);
        int d =  A.get(1) - A.get(0);;
        System.out.println("d " + Math.abs(d));
        for(int i=2; i<n; i++){
            int diff = Math.abs( A.get(i) - A.get(i-1));
            System.out.println("diff "+diff);
            if(diff != d)
                return 0;
        }
        return 1;
    }
    public static void main(String[] args) {

//        int[] arr = {-251, -305, -323, -53, -215, -143, -107, -161, -179, -431, -449, -17, -341, -413, -35, -125, -197, -377, -269, -71, -359, -89, -233, -287, -395 };
//        int[] arr ={1, 39, 324, 267, 96, 77, 248, 58, 229, -18, 191, 172, 134, 286, 305, 210, 115, 20, 153};
        int[] arr ={2,4,1};
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i =0; i<arr.length; i++){
            al.add(arr[i]);
        }
        System.out.println(solve(al));
    }
}

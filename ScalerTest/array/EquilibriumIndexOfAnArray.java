package array;

import java.util.ArrayList;
import java.util.Arrays;

public class EquilibriumIndexOfAnArray {

    public static int solve(int[] A) {
        int n = A.length;
//        int[] ans = new int[n];
        ArrayList<Integer> list = new ArrayList<>();
        int[] ps = new int[n];
        ps[0] = A[0];
        for(int i=1; i<n; i++){
            ps[i] = ps[i-1] + A[i];
        }
//        System.out.println(Arrays.toString(A));
//        System.out.println(Arrays.toString(ps));
        int k = 0;
        boolean flag=false;
        for(int i=0; i<n; i++){

            int left = (i == 0) ? 0 : ps[i-1];
            int right = ps[n-1] - ps[i];

            if(left == right) {
//                System.out.println(left+" "+right+" "+i);
                list.add(i);
                k++;
                flag = true;
            }
        }
        System.out.println(list);
        int min = Integer.MAX_VALUE;
        for(int i=0; i<list.size(); i++){
//            System.out.println("min "+min);
            if(list.get(i) < min )
                min = list.get(i);
        }
        if(flag == false)
            return -1;
        else
            return min;
    }
    public static void main(String[] args) {
        int[] arr = {0,0,0,0};//{-7, 1, 5, 2, -4, 3, 0}; //{ -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -11, -12, -13, -14, -15, -16, -17, -18, -19, -20, -21, -22, -23, -24, -25, -26, -27, -28, -29, -30, -31, -32, -33, -34, 69, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34};//
        System.out.println(solve(arr));
    }
}

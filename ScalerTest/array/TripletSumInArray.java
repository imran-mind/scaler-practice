package array;

import java.util.Arrays;

public class TripletSumInArray {

    public static boolean tripletSumInArr(int[] A, int X){
        int n = A.length;
        Arrays.sort(A);
//        System.out.println(Arrays.toString(A));
        for(int i=0; i<n; i++){
            int y = X-A[i];
            int low = i+1;
            int high = n-1;
            while (low<high){
                if(A[low]+A[high] == y)
                    return true;
                else if(A[low]+A[high] > y)
                    high--;
                else
                    low++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] ar = {1,4,45,6,10,8};
        int X = 13;
        System.out.println(tripletSumInArr(ar,X));
    }
}

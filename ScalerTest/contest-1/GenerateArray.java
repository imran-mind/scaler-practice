package contest;

import java.util.Arrays;

public class GenerateArray {

    public static int[] solve(int[] A) {
        int n = A.length;
        int[] B = new int[n];

        for(int i=0; i<n; i++){
            int min = Integer.MAX_VALUE;
            boolean isZero = false;
            int zeroC = 0;
            for(int j=1; j<=n-1; j++){
                int and = A[i] & j;
                if( and > 0){

                    if(and < min){
                        min = and;
                    }
                }else{
                    zeroC++;

                }
            }
            System.out.println("and "+zeroC+ " A[i] "+A[i]);
            if(zeroC == n-1){
                B[i]= A[i];
            }else{
                B[i]=min;
            }
        }
        return B;
    }

    public static void main(String[] args) {
        int[] a = {77,66,43,25,84,81,93,82,96,96,96};//{1,2,3};
        System.out.println(Arrays.toString(solve(a)));
    }
}

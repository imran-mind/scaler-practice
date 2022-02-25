package array;

import java.util.Arrays;

public class PrefixSumExcersize {

    public static int[] prefixSumForEvenIdx(int[] arr){
        int n = arr.length;
        int[] pseIddx = new int[n];
        pseIddx[0] = arr[0];
        for(int i=1; i<n; i++){
            if(i%2 == 0){
                pseIddx[i] = pseIddx[i-1] + arr[i];
            }else{
                pseIddx[i] = pseIddx[i-1] ;
            }
        }
        System.out.println("PSE "+ Arrays.toString(pseIddx));
        return pseIddx;
    }

    public static int[] prefixSumForOddIdx(int[] arr){
        int n = arr.length;
        int[] psoIddx = new int[n];

        for(int i=1; i<n; i++){
            if(i%2 == 1){
                psoIddx[i] = psoIddx[i-1] + arr[i];
            }else{
                psoIddx[i] = psoIddx[i-1] ;
            }
        }
        System.out.println("PSO "+ Arrays.toString(psoIddx));
        return psoIddx;
    }


    public static void main(String[] args) {
        int[] arr = {1,1,1};//{2, 1, 6, 4};//{1,2,3,4,5};
        int n = arr.length;
        int[] PSE =  prefixSumForEvenIdx(arr);
        int[] PSO =  prefixSumForOddIdx(arr);
        int count=0;
        for(int i=0; i< n; i++){
            int SE=0;
            int SO=0;
            if(i == 0){
                SE = PSO[n-1] - PSO[i];
                SO = PSE[n-1] - PSE[i];
            }else{
                SE = PSE[i-1] + PSO[n-1] - PSO[i];
                SO = PSO[i-1] + PSE[n-1] - PSE[i];
            }
            if(SE == SO)
                count++;
        }
        System.out.println(count);
    }
}

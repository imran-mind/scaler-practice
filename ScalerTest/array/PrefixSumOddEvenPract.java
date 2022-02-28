package array;

import java.util.Arrays;

public class PrefixSumOddEvenPract {

    public static int[] prefixSumEven(int[] a){
        int n= a.length;
        int[] PSE = new int[n];
        PSE[0] = a[0];
        for(int i=1; i<n; i++){
            if(i%2==0)
                PSE[i] = PSE[i-1] + a[i];
            else
                PSE[i] = PSE[i-1];
        }
        return PSE;
    }

    public static int[] prefixSumOdd(int[] a){
        int n=a.length;
        int[] PSO = new int[n];
        PSO[0] = a[0];
        for(int i=1; i<n; i++){
            if(i%2 == 0){
                PSO[i] = PSO[i-1];
            }else{
                PSO[i] = PSO[i-1] + a[i];
            }
        }
        return PSO;
    }

    public static void prefixSumEvenOdd(int[] arr){
        int n = arr.length;
        int[] PSE = prefixSumEven(arr);
        int[] PSO = prefixSumOdd(arr);
        System.out.println(Arrays.toString(PSO));
        int start = 3;
        int end = 6;
        String type="ODD";
        for(int i=start; i<=end; i++){
            if(i%2 != 0){
               int sum = PSO[end] - PSO[start-1];
                System.out.println(sum);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr ={2,3,1,-1,0,8,5,4};
        prefixSumEvenOdd(arr);
    }
}

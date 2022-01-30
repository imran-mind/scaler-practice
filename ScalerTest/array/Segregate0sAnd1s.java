package array;

import java.util.Arrays;

public class Segregate0sAnd1s {

    public static void segregateZerosAndOnes(int[] arr){
        int zeroCount=0;
        int n = arr.length;

        for(int i=0;i<n;i++){
            if(arr[i]==0)
                zeroCount++;
        }

        for(int i=0;i<n;i++)
        {
            if(i<zeroCount)
                arr[i]=0;
            else
                arr[i]=1;
        }
    }

    public static void moveZerosInLast(int[] arr){
        int n = arr.length;
        int nonZeroCount = 0;
        int[] nArr = new int[n];
        int k=0;
        for(int i=0; i<n; i++){
            if(arr[i] != 0){
                nArr[k] = arr[i];
                k++;
                nonZeroCount++;
            }
        }
        System.out.println(Arrays.toString(nArr));

        for(int i=0; i<n; i++){
            if(i<nonZeroCount)
                arr[i] = nArr[i];
            else
                arr[i] = 0;
        }
    }
    public static void main(String[] args) {
//        int[] a= {0,1,0,1,0,1,0,};//{1,0,0,1}; //  {0,0,0,1,1,0};
        int[] a = {73348,66106,-85359,53996,18849,-6590,-53381,-86613,-41065,83457,0};//{0,1,0,3,0,12,0,11,3,5,0,};
//        segregateZerosAndOnes(a);
        moveZerosInLast(a);
        System.out.println(Arrays.toString(a));
    }
}

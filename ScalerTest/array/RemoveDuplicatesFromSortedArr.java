package array;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArr {

    public static int remove_duplicate(int A[],int N){
        // code here
        int j = 0;
        // int i = 1;
        for(int i = 1; i < N; i++){
            if(A[i] == A[j]){
                continue;
            }else{
                j++;
                A[j] = A[i];
            }
        }
        return j+1;
    }
    //s3cret

    public static void main(String[] args) {
        int[] arr= {2,2,2,2,2};
        System.out.println(remove_duplicate(arr,arr.length));
    }
}

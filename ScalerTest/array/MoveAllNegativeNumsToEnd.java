package array;

import java.util.Arrays;

public class MoveAllNegativeNumsToEnd {

    public static void segregateElements(int arr[], int n)
    {
        int[] newArr =  new int[n];
        int j = 0;
        for(int i=0; i<n; i++){
            if(arr[i] > 0){
                newArr[j] = arr[i];
                j++;
            }
        }
        for(int i=0; i<n; i++){
            if(arr[i] < 0){
                newArr[j] = arr[i];
                j++;
            }
        }
        for(int i=0; i<n; i++){
            arr[i] = newArr[i];
        }
    }

    public static void main(String[] args) {
        int[] arr ={1, -1, 3, 2, -7, -5, 11, 6 };
        segregateElements(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}

package array;

import java.util.Arrays;

public class SmallerThanCurrentNumber {

    public static int[] smallerThanCurrentNumber(int[] a){
        int[] arr = new int[a.length];
        int k = 0;
        int n = a.length;
        for(int i=0; i < n; i++){
            int count = 0;

            for(int j = 0; j < n; j++){
                System.out.println("a[i] "+a[i] + " a[j] "+a[j]);
                if(a[j] < a[i]){
                    count++;
                }
//                System.out.println(count);
            }
            arr[k] = count;
            k++;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] nums = {7,7,7,7};//{6,5,4,8};//{8,1,2,2,3};

        System.out.println(Arrays.toString(smallerThanCurrentNumber(nums)));
    }
}

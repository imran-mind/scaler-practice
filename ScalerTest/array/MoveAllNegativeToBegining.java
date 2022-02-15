package array;

import java.util.Arrays;

public class MoveAllNegativeToBegining {

    public static void moveAllNegativeToBeg(int[] a){
        int i=0;
        int j=a.length-1;
        while (i<j){
            if(a[i]>0 && a[j]<0){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }else if(a[i]<0){
                i++;
            }else if(a[j]>0){
                j--;
            }
        }
    }
    static void rearrange(int arr[], int n)
    {
        int j = 0, temp;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }   
    }
    public static void main(String[] args) {
        int[] a ={-12, 11, -13, -5, 6, -7, 5, -3, -6};
        moveAllNegativeToBeg(a);
        System.out.println(Arrays.toString(a));
    }
}

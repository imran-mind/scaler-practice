package array;

import java.util.Arrays;

public class ReArrangeArrayNegAndPos {

    public static void rearrangeNegPos(int[] a){
        int n = a.length;
        int i = 0;
        int j = n-1;
        while (i<j){
            if(a[i] > 0)
                i++;

            if(a[j] < 0)
                j--;

            if(a[i] < 0 && a[j] > 0){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        System.out.println(i+" "+j);
        System.out.println(Arrays.toString(a));

        int k =0;
        while (k<i){
            if(a[k] > 0 && a[i] < 0){
                int temp = a[k];
                a[k] = a[i];
                a[i] = temp;
            }
            i++;
            k=k+2;
        }
        System.out.println(Arrays.toString(a));

    }
    public static void main(String[] args) {
        int[] a = {-5, 3, 4, 5, -6, -2, 8, 9, -1, -4};//{-2, 3, 1};//{2,3,-4,-1,6,-9};
        rearrangeNegPos(a);
//        System.out.println(Arrays.toString(a));
    }
}

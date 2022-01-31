package array;

import java.util.Arrays;
import java.util.Scanner;

public class InsertAtIndex {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n+1];

        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
//        System.out.println(Arrays.toString(a));
        int pos = sc.nextInt();
        int ele = sc.nextInt();

        for(int i=n-1; i>=pos-1; i--){
            a[i+1] = a[i];
        }
        a[pos-1] = ele;
//        System.out.println(Arrays.toString(a));

        for(int i=0; i<a.length; i++){
            System.out.print(i<n ? a[i]+" ": a[i]);
        }
    }
}

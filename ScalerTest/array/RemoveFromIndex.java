package array;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveFromIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];

        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
//        System.out.println(Arrays.toString(a));
        int pos = sc.nextInt();
//        int ele = sc.nextInt();

        for(int i=pos; i<n; i++){
            a[i-1] = a[i];
        }
//        a[pos-1] = ele;
        System.out.println(Arrays.toString(a));

        for(int i=0; i<a.length-1; i++){
            System.out.print(i<n ? a[i]+" ": a[i]);
        }
    }
}

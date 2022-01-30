package array;

import java.util.Scanner;

public class RemoveElementOfSpecificIndex {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int ab = sc.nextInt();
        // System.out.print("a "+ab );
        for(int i=0; i<n; i++){
            if(i == ab - 1){
                // continue;
            }else{
                System.out.print(i<n ? a[i]+" ": a[i]);
            }
        }
        // System.out.println(Arrays.toString(a));
        // give input below type
//        5
//2 3 1 4 2
//3
    }
}

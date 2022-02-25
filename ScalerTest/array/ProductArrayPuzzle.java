package array;

import java.util.Arrays;

/*
Q2. Product array puzzle

Given an array of integers A, find and return the product array of same size where i'th eement of the product array will be equal to the product of all the elements divided by the i'th element of the array.

Note: It is always possible to form the product array with integer (32 bit) values.

Input Format

The only argument given is the integer array A.
Output Format

Return the product array.
Constraints

1 <= length of the array <= 1000
1 <= A[i] <= 10
For Example

Input 1:
    A = [1, 2, 3, 4, 5]
Output 1:
    [120, 60, 40, 30, 24]

Input 2:
    A = [5, 1, 10, 1]
Output 2:
    [10, 50, 5, 50]
*
* */
public class ProductArrayPuzzle {

    public static int[] solve(int[] A) {
        int n = A.length;
        int[] ans = new int[n];
        int prod = 1;
        for(int i=0; i<n; i++){
            prod = prod * A[i];
        }
        for(int i=0; i<n; i++){
            ans[i] = prod/A[i];
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(solve(arr)));
    }
}

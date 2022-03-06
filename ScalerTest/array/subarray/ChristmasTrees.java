package array.subarray;

/*
* Problem Description
You are given an array A consisting of heights of Christmas trees and an array B of the same size consisting of the cost of each of the trees (Bi is the cost of tree Ai, where 1 ≤ i ≤ size(A)), and you are supposed to choose 3 trees (let's say, indices p, q, and r), such that Ap < Aq < Ar, where p < q < r.
The cost of these trees is Bp + Bq + Br.

You are to choose 3 trees such that their total cost is minimum. Return that cost.

If it is not possible to choose 3 such trees return -1.



Problem Constraints
1 <= A[i], B[i] <= 109
3 <= size(A) = size(B) <= 3000



Input Format
First argument is an integer array A.
Second argument is an integer array B.



Output Format
Return an integer denoting the minimum cost of choosing 3 trees whose heights are strictly in increasing order, if not possible, -1.



Example Input
Input 1:

 A = [1, 3, 5]
 B = [1, 2, 3]
Input 2:

 A = [1, 6, 4, 2, 6, 9]
 B = [2, 5, 7, 3, 2, 7]


Example Output
Output 1:

 6
Output 2:

 7


Example Explanation
Explanation 1:

 We can choose the trees with indices 1, 2 and 3, and the cost is 1 + 2 + 3 = 6. 
* */
public class ChristmasTrees {
    public static int solve(int[] A, int[] B) {
        int n=A.length;
        int minSum = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    int sum = B[i]+ B[j]+ B[k];
//                    System.out.println(A[i]+" "+A[j]+" "+A[k] +" => "+ sum);
                    minSum = Math.min(sum, minSum);
                }
            }
        }
        return minSum;
    }

    public static int solveOptimize(int[] A, int[] B){
        int n = A.length;
        int ans = 0;
        int minSum = Integer.MAX_VALUE;
//        if(n<=3 &&  false){
//            int sum = 0;
//            for(int i=0 ; i<n; i++){
//                sum = sum + B[i];
//            }
//            return sum;
//        }
        for(int i=1; i<n-1; i++){
            int sum = B[i];
//            System.out.println("For val A[i] "+A[i]);
            boolean isValid = false;
            int leftVal = Integer.MAX_VALUE; // 7
            // go left
            for(int j = i-1; j >= 0; j--){
                if(A[j] < A[i]){
//                    leftVal = B[j];
//                    System.out.print("left "+A[j]+"=> ");
//                    sum = sum + B[j];
//                    System.out.println("bVal "+bVal);
//                    sum = sum + bVal;
//                    break;
                    leftVal = Math.min(leftVal,B[j]);
                    isValid = true;
                }
            }
            if(isValid) {
                sum = sum + leftVal;
//                System.out.println("leftVal "+leftVal);
            }
            int rightVal = Integer.MAX_VALUE; // 7
            boolean flag = false;
            for(int k=i+1; k<n; k++){
                if(A[k] > A[i]){
//                    System.out.print("right "+A[k]+"=> sum := " );
//                    sum = sum + B[k];
//                    break;
                    rightVal = Math.min(rightVal, B[k]);
                    flag = true;
                }
            }
            if(flag) {
                sum = sum + rightVal;
//                System.out.println("rightVal "+rightVal);
            }
            if(isValid && flag) {
//                System.out.println("sum " + sum);
                minSum = Math.min(sum, minSum);
//                System.out.println("minSum " + minSum);
            }
        }
        if(minSum == Integer.MAX_VALUE)
            return -1;
        else
            return minSum;
    }
    public static void main(String[] args) {
        int[] A = {1,3,5}; //{100,101,100};//{1, 6, 4, 2, 6, 9};//{5, 9, 10, 4, 7, 8}; // // //{1,3,5};//
        int[] B = {1,2,3}; //{2,4,5};//{2, 5, 7, 3, 2, 7}; //{5, 6, 4, 7, 2, 5};// //{1,2,3};//
//        System.out.println(solve(A,B));
        System.out.println(solveOptimize(A,B));
    }
}

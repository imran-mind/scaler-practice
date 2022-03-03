package array.subarray;

public class MaximumSubarrayEasy {
    public static int maxSubarray(int A, int B, int[] C) {
        int ans = 0;
        int max = 0;
        for(int i=0; i<A; i++){

            int sum = 0;
            for(int j=i; j<A; j++){

                sum = sum + C[j];
                ans = ans + sum;
            }
            if(sum > max && sum <= B){
//                System.out.println(sum);
                return sum;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
//        int A = 5;
//        int B = 12;
//        int[] C = {2, 1, 3, 4, 5};
//        int A = 1;
//        int B = 75;
//        int[] C = { 4};
        int A = 3;
        int B = 1;
        int[] C = {2, 2, 2};
        System.out.println(maxSubarray(A,B,C));
    }
}

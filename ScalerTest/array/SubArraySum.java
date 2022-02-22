package array;

public class SubArraySum {

    // O(N^3) approach
    public static int subArraySum(int[] arr){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){

            for(int j=i; j<n; j++){
                int sum = 0;
                for(int k=i; k<=j; k++){
                    sum += arr[k];
                    if(sum > max){
                        max = sum;
                    }
                    if(sum<0){
                        sum = 0;
                    }
                    System.out.print(arr[k]+ " ");
                }
                System.out.println();
            }
        }
        System.out.println(max);
        return max;
    }

    // O(N^2) approach
    public static int subArraySum1(int[] arr){
        int n = arr.length;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i; j<n; j++){

                sum += arr[j];

                if(sum > max)
                    max = sum;
                if(sum < 0)
                    sum = 0;
            }
        }
        System.out.println(max);
        return max;
    }

    // O(N) Kadane's Algorithm
    public static int subArraySum2(int[] arr){
        int n = arr.length;
        int max = arr[0];//Integer.MIN_VALUE;
        int sum =0;
        for(int i=0; i<n; i++){
            sum+=arr[i];
            if(sum>max)
                max=sum;
            if(sum<0)
                sum = 0;
        }
        System.out.println(max);
        return max;
    }
    public static void main(String[] args) {
        int[] a = {-2,-1};//{2,-3,4,-1,-2,1,5,-3};
//        subArraySum(a);
//        subArraySum1(a);
        subArraySum2(a);

    } 
}

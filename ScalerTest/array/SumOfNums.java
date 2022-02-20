package array;

public class SumOfNums {

    public static int sum(int arr[], int n) {
        // code here
        int sum = 0 ;
        for(int i=0; i<n; i++){
            sum = sum + arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        System.out.println(sum(a, a.length));
    }
}

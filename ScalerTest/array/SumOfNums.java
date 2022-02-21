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

    public static void solve(int n){
        for(int i=0; i<(1<<n); i++){
            int j = i;
            while (j > 0){
                System.out.println("i "+i+" j "+j);

                j = j -1;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4};
//        System.out.println(sum(a, a.length));
        solve(2);
    }
}

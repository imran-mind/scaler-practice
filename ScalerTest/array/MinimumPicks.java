package array;

/*A = [5, 17, 100, 1] ==> output 99
A = [0, 2, 9]  ==> output -7

Example Explanation

    Explanation 1:

    Maximum of all even numbers = 2
    Minimum of all odd numbers = 9
    ans = 2 - 9 = -7
Explanation 2:

    Maximum of all even numbers = 100
    Minimum of all odd numbers = 1
    ans = 100 - 1 = 99
* */
public class MinimumPicks {
    public static int max(int[] arr){
        int m = Integer.MIN_VALUE;
        for(int i=0; i< arr.length; i++){
            if(arr[i] % 2 == 0 && arr[i] > m)
                m = arr[i];
        }
        return m;
    }
    public static int min(int[] arr){
        int m = Integer.MAX_VALUE;
        for(int i=0; i< arr.length; i++){
            if(arr[i] % 2 != 0 && arr[i] < m)
                m = arr[i];
        }
        return m;
    }
    public static int solve(int[] A) {
        return max(A) - min(A);
    }

    public static void main(String[] args) {
        int[] a = {5, 37, 4, 11, 81, 90, 37, -52, -30, 56};//{0, 2, 9};//{5, 17, 100, 1};
        System.out.println(solve(a));
    }
}

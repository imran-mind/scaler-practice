package recursion;

public class SumTheDigits {
    static int sum = 0;
    public static int sumOfDig(int n){
        if(n == 0)
            return sum;
        int k = n % 10;
        sum = sum + k;
        n = n/10;
        return sumOfDig(n);
    }
    // good approach
    public int solve(int A) {
        if(A<10)
            return A;
        return (A%10) + solve(A/10);
    }
    public static void main(String[] args) {
        int n = 1589;//123;
        int result = sumOfDig(n);
        System.out.println(result);
    }
}

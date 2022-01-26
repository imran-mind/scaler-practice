package recursion;

public class SumOfEvens {
    static int s = 0;
    public static int solve(int n){
        if(n == 1)
            return 1;
        if(n % 2 == 0)
            s = s + n;
        solve(n-1);
        return s;
    }
    public static void main(String[] args) {
        int n = 10;
        int b = solve(n);
        System.out.println(b);
    }
}

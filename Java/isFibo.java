import java.util.Scanner;

public class isFibo {
    static  boolean isPerfectSquare(int x){
        int s = (int) Math.sqrt(x);
        return (s*s == x);
    }

    // Returns true if n is a Fibonacci Number, else false
    static boolean isFibonacci(int n){
        // n is Fibonacci if one of 5*n*n + 4 or 5*n*n - 4 or both
        // is a perfect square
        return isPerfectSquare(5*n*n + 4) ||
                isPerfectSquare(5*n*n - 4);
    }
    public static boolean checkfibonacci(int n)
    {
        int a = 0;
        int b = 1;
        if (n==a || n==b) return true;
        int c = a+b;
        while(c<=n){
            if(c == n) return true;
            a = b;
            b = c;
            c = a + b;
        }
        return false;
    }
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=1; i<=10; i++){
//            int n = sc.nextInt();
            // String res = fibo(n);
            // System.out.println(n);
            System.out.println(checkfibonacci(i) ? "Yes" : "No");
        }
    }
}

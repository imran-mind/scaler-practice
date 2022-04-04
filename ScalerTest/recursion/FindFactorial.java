package recursion;

public class FindFactorial {

    public static int solve(int A) {
        if(A==0)
            return 1;
//        System.out.println(A);
        return solve(A-1)*A;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(solve(n));
    }
}

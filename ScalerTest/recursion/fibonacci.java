package recursion;

public class fibonacci {
    public static int findAthFibonacci(int A) {
        if(A==0 || A==1)
            return 1;

        return findAthFibonacci(A-1) + findAthFibonacci(A-2);
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(findAthFibonacci(n));
    }
}

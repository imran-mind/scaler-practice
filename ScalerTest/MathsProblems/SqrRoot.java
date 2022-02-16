package MathsProblems;

public class SqrRoot {
    public  static  int solve(int A) {
            long l = 1;
            long h = A;
            while(l<=h){
                long mid = (l+(h-l)/2);
                long sqr = mid * mid;
    //            System.out.println(sqr);
                if(sqr == A){
                    System.out.println(sqr);
                    return (int) mid;
                }else if( sqr > A)
                    h = mid - 1;
                else
                    l = mid + 1;
            }
            return -1;
    }
    public static void main(String[] args) {
        int n = 1065024;
        System.out.println(solve(n));
    }
}

package array;

import jdk.jshell.execution.Util;

//import static java.time.temporal.TemporalQueries.PRECISION;

public class Sqrt {
    private static final double PRECISION = 6;

    public static int sqrBinarySearch(int x){
            if(x ==0 )
                return 0;
            int start = 1;
            int end = x;
            int ans = 1;
            while(start<=end){
                int mid = start + (end - start) / 2;

                if(mid <= x/mid ){
                    start = mid + 1;
                    ans = mid;
                }else {
                    end = mid - 1;
                }
            }
            return ans;
    }

    public static int sqrtLinear(int N) {
        int ans = 0;
        for(int i=1; i<N; i++){
            long mult = i*i;

//            System.out.println("i "+i+" mult "+mult + " N "+N );
            if(mult == N){
                return i;
            }

            if(mult < N){
                ans = i;
            }

            if(((i+1)*(i+1)) > N){
                return ans;
            }
//            System.out.println("ans =>" +ans);
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 2147483646; // 930675566; //2147483646;
        System.out.println(sqrBinarySearch(n));
    }
}

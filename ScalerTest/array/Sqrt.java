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
        int i = 1;
        while(i*i < N){
            i++;
        }
        return i;
    }

    public static double sqRootPrecision(int x, int p){
        if(x == 0 )
            return 0;
        int start = 1;
        int end = x;
        double ans = 1;
        while(start<=end){
            int mid = start + (end - start) / 2;

            if(mid <= x/mid ){
                start = mid + 1;
                ans = mid;
            }else {
                end = mid - 1;
            }
        }

        double inc = 0.1;
        for(int place=0; place<=p; place++){
            while (ans * ans <= x){
                ans = ans + inc;
            }
            ans = ans - inc;
            inc = inc / 10;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 9;
//        int n = 2147483646; // 930675566; //2147483646;
        double sqroot= sqRootPrecision(10, 3);
        System.out.println("Value:  "+String.format("%.3f",sqroot));
//        System.out.println(sqrtLinear(n));
    }
}

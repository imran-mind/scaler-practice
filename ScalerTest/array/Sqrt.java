package array;

import jdk.jshell.execution.Util;

//import static java.time.temporal.TemporalQueries.PRECISION;

public class Sqrt {
    private static final double PRECISION = 6;

    public static int sqrt(int X, double low, double high) {

        int mid = (int) (low + high) / 2;
        int p = mid * mid;
        // uncomment below line to see how we reach the final answer
//         System.out.println(low + " " + high + " " + mid + " " + p);

        if (p == X || (Math.abs(X - p) <  PRECISION)) {
            return mid;
        }
        if (p < X) {
            return sqrt(X, mid, high);
        }
        return sqrt(X, low, mid);
    }
    public static int sqrt(int X) {
        if(X <= 0)
            return 0;
        int i = 1;
//        int v = i;
        for (; i < X; ++i) {
            int p = i * i;
            if (p == X) {
                // perfect square
                return i;
            }
            if (p > X) {
//                System.out.println(p + " "+ X);
                // found left part of decimal
                return sqrt(X, i - 1, i);
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(sqrt(930675566));
    }
}

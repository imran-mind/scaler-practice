package array;

import java.util.ArrayList;
import java.util.Arrays;

public class NewsPaper {
    public static int solve(int A, ArrayList<Integer> B) {
        int n = 0;
        while(A > 0) {
            for (int i = 0; i < B.size(); i++) {
                if (B.get(i) >= A) {
                     n = i + 1;
                     return n;
                } else {
                    A = A - B.get(i);
                }
            }
        }
        return n;
    }
    public static void main(String[] args) {
//        int a = 100;
//        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(15, 20, 20, 15, 10, 30, 45));
        int a = 1000;
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(100, 100, 100, 100, 100, 100, 100));
        System.out.println(solve(a,b));
    }
}

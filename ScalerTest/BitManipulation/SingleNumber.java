package BitManipulation;

import java.util.ArrayList;

public class SingleNumber {

    public static ArrayList solve(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        int ans = arr[0];
        for(int i=1; i< arr.length; i++){
            ans = ans ^ arr[i];
            System.out.println(ans);
        }
//        return n & (n - 1);
        return list;
    }
    public static void main(String[] args) {
        int[] n = {1,2,3, 1, 2, 4};
        System.out.println(solve(n));
    }
}

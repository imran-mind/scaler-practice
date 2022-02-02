package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddToArrayFormOfInteger {

    public static List<Integer> addToArrayForm(int[] num, int k) {
        String s = "";
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<num.length; i++){
            s = s.concat(num[i]+"");
        }
        long ans = Integer.parseInt(s);
        long res = ans + k;
        String str = res+"";
        while (res > 0){
            int rem = (int) res % 10;
            list.add(rem);
            res = res / 10;
        }
        Collections.reverse(list);
        return list;
    }
    public static void main(String[] args) {
        int[] num = {2,1,5};//{1,2,0,0};
        int k = 806;
        System.out.println(addToArrayForm(num,k));
    }
}

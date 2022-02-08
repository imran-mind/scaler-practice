package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddToArrayFormOfInteger {

    public static List<Integer> addToArrayForm(int[] num, int k) {

        List<Integer> list=new ArrayList<>();
        int i=num.length-1;
        while(i>=0 || k>0){
            if(i>=0)
                k=k+num[i];
            list.add(k%10);
            k/=10;
            i--;
        }
        Collections.reverse(list);
        return list;
    }
    public static void main(String[] args) {
//        int[] num = {2,1,5};//{1,2,0,0};
//        int k = 806;
        int[] num = {9,9,9,9,9,9,9,9,9,9};//{1,2,0,0};
        int k = 1;
        System.out.println(addToArrayForm(num,k));
    }
}

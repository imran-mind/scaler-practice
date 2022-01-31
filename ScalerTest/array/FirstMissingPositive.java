package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FirstMissingPositive {

    public static int firstMissingPositive(ArrayList<Integer> a){
        int mis = 1;
        for(int i=1; i<=a.size(); i++) {

            if (!a.contains(i)) {
                return i;
            }
        }
        return mis;
    }

    public static int firstMissingPosByHashset(ArrayList<Integer> a){
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<a.size(); i++){
            set.add(a.get(i));
        }
        int k = 1;
        while(set.contains(k)){
            k++;
        }
//        for(int i=1; i<=a.size()+1; i++){
//            if(set.contains(i)){
//                k++;
//            }else{
//                break;
//            }
//        }
        System.out.println(set);
        return k;
    }
    public static void main(String[] args) {
//        int[] a = {1, 2, 0};
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(-8, -7, -6));
//        int[] a = {3, 4, -1, 1};
//        int[] a = {-8, -7, -6};
//        System.out.println(firstMissingPositive(al));
        System.out.println(firstMissingPosByHashset(al));
    }
}

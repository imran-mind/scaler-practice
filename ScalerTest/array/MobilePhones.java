package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MobilePhones {

    public static int binarySearch(ArrayList list, int val){
        int start = 0;
        int end = list.size() - 1;
        int index = 0 ;
       while(start <= end){
           int mid = (int) Math.floor((start + end)/2);
           int midVal = (int) list.get(mid);

           if(midVal <= val)
                index = mid+1;

           if(val > midVal){
               start = mid + 1;
           }else{
               end = mid - 1;
           }
       }
       return index;
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {

        ArrayList<Integer> newList = new ArrayList();
        int sum = 0;
        for(int i=0; i<A.size(); i++){
            int v = A.get(i);
            sum = sum + v;
//            System.out.println(sum);
            newList.add(sum);
        }
        ArrayList<Integer> res = new ArrayList();
        for(int i=0; i<B.size(); i++){
           int idx = binarySearch(newList, B.get(i));
           res.add(idx);
        }
        return res;
    }
    public static void main(String[] args) {
        ArrayList a= new ArrayList(Arrays.asList(3, 4, 4, 6));
        ArrayList b=  new ArrayList(Arrays.asList(20, 4, 10, 2));
        List list = solve(a,b);
        System.out.println(list);
    }
}

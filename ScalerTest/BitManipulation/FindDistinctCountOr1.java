package BitManipulation;

import java.util.ArrayList;
import java.util.HashSet;

public class FindDistinctCountOr1 {

    static int solve(int A, ArrayList<Integer> B){
        int c = 0;
        int n = A;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int or = 0;
                for(int k=i; k<=j; k++){
                    or = or |  B.get(k);
                }
                if(or == 1)
                    c++;
            }
        }
        return c;
    }

    static int solve1(int A,ArrayList<Integer> B){
        int s = A * (A+1);
        int p = s/2;
        System.out.println("p "+p);
        for(int i=0; i<A; i++){
            if(B.get(i) == 0)
                p = p-1;
        }
        return p;
    }

        static long subarray( ArrayList<Integer> list){
            long n = list.size();
            long s = (n * (n+1))/2;
            long c = 0;
            ArrayList<Long> sList = new ArrayList<>();
            int i=0;
            while (i<list.size()){
                if(list.get(i) == 0){
                    c++;
                    if(i== list.size()-1){
                        sList.add(c);
                    }
                }else{
                    if(c>0) {
                        sList.add(c);
                    }
                    c=0;
                }
                i++;
            }
    //        System.out.println(sList);
            for(int j=0; j<sList.size(); j++){
                long k = sList.get(j);
                long p = (k * (k+1))/2;
    //            System.out.println("p "+p);
                s = s - p;
            }
    //        System.out.println(s);
            return s;
        }
    // Driver code
    public static void main (String[] args) {
        int n = 2;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
//        list.add(1);
//        list.add(0);
////
//        list.add(1);
//        list.add(0);
//        list.add(0);
//        list.add(1);
        int[] arr = {1,0,1};
//        list.add(1);
//        System.out.println(solve(8, list));
//        System.out.println(solve1(n,list));
        System.out.println(subarray(list));
        long np = 100000;
        long s = ( np * (np+1))/2;
        System.out.println("ans "+(s));
    }
}

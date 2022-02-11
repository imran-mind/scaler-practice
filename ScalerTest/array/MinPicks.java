package array;

import java.util.ArrayList;

public class MinPicks {
    public boolean isEven(int a){
        if(a%2 ==0)
            return true;

        return false;
    }
    public int solve(ArrayList<Integer> A) {
        ArrayList<Integer> evens = new ArrayList<Integer>();
        ArrayList<Integer> odds = new ArrayList<Integer>();
        int diff = 0;
        for(int i=0; i<A.size(); i++){
            int num = A.get(i);
            boolean isEve = isEven(num);
            if(isEve){
                evens.add(num);
            }else{
                odds.add(num);
            }
        }


        int max = evens.get(0);

        for(int i=0; i<evens.size(); i++){
            if(evens.get(i) > max) {
                max = evens.get(i);
            }
        }

        int min = odds.get(0);

        for(int i=0; i<odds.size(); i++){
            if(odds.get(i) < min) {
                min = odds.get(i);
            }
        }


        return max - min;
    }

    public static void main(String[] args) {
        
    }
}

package array;

import java.util.ArrayList;
import java.util.Collections;

public class LittlePonnyAndMaximumElement {

    public static int solve(ArrayList<Integer> A, int B) {
        boolean found = false;
        for(int i=0; i<A.size(); i++){
            if(A.get(i) == B)
                found = true;
        }
        if(found == false)
            return -1;

        Collections.sort(A);

        int count = 0;
        for(int i=0; i<A.size(); i++){
            if(A.get(i) > B)
                count++;
        }

        return count;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();//[2,4,3,1,5]
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(1);
        list.add(5);
        System.out.println(solve(list, 6));
    }
}

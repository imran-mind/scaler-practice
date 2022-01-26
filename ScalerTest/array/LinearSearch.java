package array;

import java.util.ArrayList;
import java.util.Arrays;

public class LinearSearch {
    public static int linearSearch(ArrayList<Integer> a, int b){

        for(int i=0; i<a.size(); i++){
            if(a.get(i) == b){
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        int searchVal = 5;
        System.out.println(linearSearch(arr,searchVal));
    }
}

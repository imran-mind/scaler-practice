package Hashing;

import java.util.ArrayList;
import java.util.HashMap;

//https://www.interviewbit.com/problems/pairs-with-given-xor/
public class PairsWithGivenXor {

    public static int solve(ArrayList<Integer> A, int B) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for( int i = 0 ; i < A.size() ; i++ ){
            map.put( A.get(i), 1);
        }

        int count = 0;
        for( int i = 0 ; i < A.size() ; i++ ){
            int val = B^A.get(i);
            if( map.containsKey(val) ){
                count++;
            }
        }
        return count/2;
    }
    public static void main(String[] args) {
        int arr1[] = {17, 18, 8, 13, 15, 7, 11, 5, 4, 9, 12, 6, 10, 14, 16, 3};//{3, 6, 8, 10, 15, 50};//{5, 4, 10, 15, 7, 6};
        int n = arr1.length;
        ArrayList<Integer> A = new ArrayList<>();
        for(int i=0; i<arr1.length; i++){
            A.add(arr1[i]);
        }
        int b = 9;
        System.out.println(solve(A, b));
    }
}

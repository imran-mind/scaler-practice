package BitManipulation;

import java.util.ArrayList;

/*
Problem Description
Given an array B of length A with elements 1 or 0. Find the number of subarrays with bitwise OR 1.


Problem Constraints
1 <= A <= 105


Input Format
The first argument is a single integer A.
The second argument is an integer array B.


Output Format
Return the number of subarrays with bitwise array 1.


Example Input
Input 1:
 A = 3
B = [1, 0, 1]
Input 2:
 A = 2
B = [1, 0]


Example Output
Output 1:
5
Output2:
2


Example Explanation
Explanation 1:
The subarrays are :- [1], [0], [1], [1, 0], [0, 1], [1, 0, 1]
Except the subarray [0] all the other subarrays has a Bitwise OR = 1
Explanation 2:
The subarrays are :- [1], [0], [1, 0]
Except the subarray [0] all the other subarrays has a Bitwise OR = 1
* */
public class SubarrayWithBitwiseOr1 {

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
    public static void main (String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(0);
        list.add(0);
        list.add(0);

        list.add(1);
        list.add(0);
        list.add(0);
        list.add(1);
        System.out.println(subarray(list));
    }
}

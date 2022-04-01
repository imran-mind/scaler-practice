package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {

    //https://www.scaler.com/academy/mentee-dashboard/class/21194/assignment/problems/157/submissions
    public static ArrayList<Integer> twoSum(final List<Integer> A, int B) {
        ArrayList<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        int n = A.size();
        for(int i=0; i<n; i++){
            int d = B - A.get(i);
            if(map.containsKey(d)){
                int preIdx = map.get(d)+1;
                int currIdx = i+1;
//                System.out.println("preIdx => "+preIdx+" currIdx "+currIdx);
                list.add(preIdx);
                list.add(currIdx);
                break;
            }else {

                if(!map.containsKey(A.get(i))) {
//                    System.out.println(A.get(i));
                    map.put(A.get(i), i);
                }
            }
        }
//        System.out.println(map);
        return list;
    }
    public static void main(String[] args) {
        int[] arr1 ={2, 7, 11, 15}; //{4, 7, -4, 2, 2, 2, 3, -5, -3, 9, -4, 9, -7, 7, -1, 9, 9, 4, 1, -4, -2, 3, -3, -5, 4, -7, 7, 9, -4, 4, -8 };////{10, 5, 3, 4, 3, 5, 6};//{1, 2, 2, 1};
        int target = 9;//-3;
        ArrayList<Integer> A = new ArrayList<>();
        for(int i=0; i<arr1.length; i++){
            A.add(arr1[i]);
        }
        System.out.println(twoSum(A, target));
    }
}

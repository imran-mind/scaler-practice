package array;

import java.util.*;

public class KthSamllestElement {


    static int Kth_smallest(TreeMap<Integer, Integer> m,
                            int k)
    {
        int freq = 0;
        for (Map.Entry it : m.entrySet())
        {

            // adding the frequencies of each element
            freq = freq + (int)it.getValue();

            // if at any point frequency becomes
            // greater than or equal to k then
            // return that element
            if (freq >= k) {
                return (int)it.getKey();
            }
        }

        return -1; // returning -1 if k>size of the array
        // which is an impossible scenario
    }

    // Driver code
    public static void main(String[] args)
    {
        int n = 5;
        int k = 2;
        int[] arr = { 12, 3, 5, 7, 19 };
//        TreeMap<Integer, Integer> m = new TreeMap<>();
//        for (int i = 0; i < n; i++) {
            // mapping every element with
            // it's
            // frequency
//            m.put(arr[i], m.getOrDefault(arr[i], 0) + 1);
//        }
//        System.out.println(m);
//        int ans = Kth_smallest(m, k);
        int ans = 0;
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(2,1,4,3,2));

        int ar[] = new int[al.size()];
        for(int i=0; i<ar.length; i++){
            ar[i] = al.get(i);
        }
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
        System.out.println(
                "The " + k + "rd smallest element is " + ar[3-1]);
    }
}

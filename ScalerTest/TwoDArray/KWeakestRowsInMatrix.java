package TwoDArray;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class KWeakestRowsInMatrix {

    public static HashMap<Integer, Integer> sortByValue(HashMap<Integer, Integer> hm)
    {
        HashMap<Integer, Integer> temp
                = hm.entrySet()
                .stream()
                .sorted((i1, i2)
                        -> i1.getValue().compareTo(
                        i2.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));

        return temp;
    }
    public static int[] kWeakestRows(int[][] mat, int k) {

        int[] ans = new int[k];
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = mat.length;
        for(int i=0; i< n; i++){
            int sum = 0;
            int col = mat[i].length;
            for(int j=0; j<col; j++){

                sum = sum + mat[i][j];

            }
            map.put(i,sum);
        }
//        System.out.println(map);

        Map<Integer,Integer> map1 = sortByValue(map);
//        System.out.println(map1);
        int i = 0;
        for(Map.Entry<Integer,Integer> entry: map1.entrySet()){
            int key = entry.getKey();
            int val = entry.getValue();
//            System.out.println("key : "+key+" val: "+val);

            if(i<k){
                ans[i] = key;
            }
            i++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] mat = {{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}};

        int[] res = kWeakestRows(mat,3);
        System.out.println("Result : "+ Arrays.toString(res));
    }
}

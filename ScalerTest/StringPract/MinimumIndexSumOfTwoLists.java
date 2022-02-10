package StringPract;

import java.util.*;

public class MinimumIndexSumOfTwoLists {

    public static String[] findRestaurant(String[] list1, String[] list2) {
        Map<String,Integer> map = new HashMap<>();
        Map<String,Integer> ansMap = new HashMap<>();

        for(int i=0; i<list1.length; i++){
            map.put(list1[i], i);
        }
        for(int i=0; i< list2.length; i++){
            String word = list2[i];
            if(map.get(word) != null){
                ansMap.put(word, map.get(word) + i );
            }
        }
        int min = Integer.MAX_VALUE;
        int max = 0;
        String found = "";
        for (String key : ansMap.keySet()){
            if(ansMap.get(key) < min){
                min = ansMap.get(key);
                found = key;
            }
        }
//        System.out.println(found+ " "+min);
//        System.out.println(ansMap);
        return new String[]{found};
    }

    public static String[] findRestaurant1(String[] list1, String[] list2) {
        HashMap < Integer, List < String >> map = new HashMap <> ();
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])) {
                    if (!map.containsKey(i + j))
                        map.put(i + j, new ArrayList< String >());
                    map.get(i + j).add(list1[i]);
                }
            }
        }
        int min_index_sum = Integer.MAX_VALUE;
        for (int key: map.keySet())
            min_index_sum = Math.min(min_index_sum, key);
        String[] res = new String[map.get(min_index_sum).size()];
        return map.get(min_index_sum).toArray(res);
    }

    public static void main(String[] args) {
//       String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
//       String[] list2 = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
//        String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
//        String[] list2 = {"KFC","Shogun","Burger King"};

        String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
        String[] list2 = {"KFC","Burger King","Tapioca Express","Shogun"};

        System.out.println(Arrays.toString(findRestaurant1(list1,list2)));
    }
}

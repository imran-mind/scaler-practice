package StringPract;

import java.util.HashMap;

public class WinnerOfAnElection {

    public static String[] winner(String arr[], int n) {
        String[] ans = new String[2];
        HashMap<String,Integer> map = new HashMap();
        String name = "";
        int vote = 0;
        for(int i =0; i< n; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
//        System.out.println(map);
        for(int i=0; i<n; i++){
            String key = arr[i];
            Integer val = map.get(key);
            if(val > vote){
                vote= map.get(key);
                name = key;
            }else if(val == vote){
                if(name.compareTo(key)>0){
                    name = key;
                }
            }
        }
        System.out.println("Name "+name+ " vote  "+vote);
        return new String[]{name,vote+""};
    }
    public static void main(String[] args) {
        String[] arr = {"john","johnny","jackie","johnny","john",
                "jackie","jamie","jamie","john","johnny","jamie",
                "johnny","john"};
//        String[] arr= {"andy","blake","clark"};
        System.out.println(winner(arr, arr.length));
    }
}

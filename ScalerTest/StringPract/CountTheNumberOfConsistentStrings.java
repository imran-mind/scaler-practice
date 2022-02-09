package StringPract;

import java.util.HashSet;
import java.util.Set;

public class CountTheNumberOfConsistentStrings {
    public static int countConsistentStrings(String allowed, String[] words) {
        int ans = 0;
//        Set<String> set = new HashSet<String>();
//        for(int i=0; i<allowed.length(); i++){
//
//        }

        for(int i=0; i<words.length; i++){
            String w = words[i];
            boolean flag = true;

            for(int j=0; j<w.length(); j++){
                if(!allowed.contains(w.charAt(j)+"")){
                    System.out.print(w);
                    flag= false;
                    break;
                }
            }
            if(flag){
                ans++;
            }
            System.out.println("-");
        }
        return ans;
    }
    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};
//        String allowed = "abc";
//        String[] words = {"a","b","c","ab","ac","bc","abc"};
//        String allowed = "cad";
//        String[] words = {"cc","acd","b","ba","bac","bad","ac","d"};

        System.out.println(countConsistentStrings(allowed, words));
    }
}

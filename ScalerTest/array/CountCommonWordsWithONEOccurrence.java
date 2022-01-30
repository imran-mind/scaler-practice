package array;

import java.util.HashMap;
import java.util.Map;

public class CountCommonWordsWithONEOccurrence {

    public static int countCommon1(String[] word1, String[] word2){
        int mainCount = 0;
        for(int i=0; i<word1.length; i++){
            String n1 = word1[i];
            int innerCount = 0;
            for(int j=0; j<word2.length; j++){
                String n2 = word2[j];

                if(n1.equals(n2)){
                    innerCount++;
                }
            }
            if(innerCount == 1){
                mainCount++;
            }
        }
        int nextCount = 0;
        for(int i=0; i<word2.length; i++){
            String n1 = word2[i];
            int innerCount = 0;
            for(int j=0; j<word1.length; j++){
                String n2 = word1[j];

                if(n1.equals(n2)){
                    innerCount++;
                }
            }
            if(innerCount == 1){
                nextCount++;
            }
        }
        return Math.min(mainCount,nextCount);
    }

    public static int secondApproach(String[] words1,String[] words2){
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        for(String word : words1){
            map1.put(word, map1.getOrDefault(word,0)+1);
        }
        for(String word : words2){
            map2.put(word, map2.getOrDefault(word,0)+1);
        }

        int count = 0;
        for(String word : words1){
            if(map1.get(word) == 1 && map2.getOrDefault(word,0) == 1){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
       String[] words1 ={"leetcode","is","amazing","as","is"};  //{"a","ab"}; //{"b","bb","bbb"};//
       String[] words2 = {"amazing","leetcode","is"};//{"a","aa","aaa"}; //{"a","a","a","ab"};
        System.out.println(secondApproach(words1, words2));
    }
}

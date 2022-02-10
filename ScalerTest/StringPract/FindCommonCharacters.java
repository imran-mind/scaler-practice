package StringPract;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindCommonCharacters {

    public static List<String> commonChars(String[] words) {
        List<String> list = new ArrayList<>();
        Map<Character,Integer> finalCount = new HashMap<>();

        for(char i='a'; i<='z'; i++){
            finalCount.put(i,100);
        }
//        System.out.println(finalCount);

        Map<Character,Integer> count = new HashMap<>();

        for(String word:words){
            count.clear();
            for(char c : word.toCharArray()){
                count.put(c,count.getOrDefault(c,0)+1);
            }
            for(char ch='a'; ch<='z'; ch++){
                finalCount.put(ch, Math.min(finalCount.get(ch), count.getOrDefault(ch,0)));
            }
        }

        int times;
        for(char c = 'a'; c<='z'; c++){
            times = finalCount.get(c);
            while (times>0){
                list.add(Character.toString(c));
                times--;
            }
        }
        return list;
    }

    public static void main(String[] args) {
//        String[] words = {"bella","label","roller"};
        String[] words = {"cool","lock","cook"};

        System.out.println(commonChars(words));
    }
}

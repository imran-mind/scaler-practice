package StringPract;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueMorseCodeWords {

    public static int uniqueMorseRepresentations(String[] words) {
        int ans = 0;
        Map<String,String> map = new HashMap<>();
        String[] codes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        int i=0;
        for(char c='a'; c<='z'; c++){
            map.put(Character.toString(c),codes[i]);
            i++;
        }
        Set set = new HashSet();

//        System.out.println(set.size());
        for(String word: words){
            StringBuilder codeWord= new StringBuilder();

            for(char c: word.toCharArray()){
                codeWord.append(map.get(Character.toString(c)));
//                codeWord = codeWord + map.get(Character.toString(c));
            }
            set.add(codeWord.toString());
        }
//        System.out.println(set);
        return set.size();
    }

    public static void main(String[] args) {
        String[] words = {"gin","zen","gig","msg"}; //{"a"};
        System.out.println(uniqueMorseRepresentations(words));

    }
}

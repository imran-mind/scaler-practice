package StringPract;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/*
    * Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below.

    In the American keyboard:

    the first row consists of the characters "qwertyuiop",
    the second row consists of the characters "asdfghjkl", and
    the third row consists of the characters "zxcvbnm".
    *
    *
    * Example 1:
        Input: words = ["Hello","Alaska","Dad","Peace"]
        Output: ["Alaska","Dad"]

    * Example 2:

        Input: words = ["omk"]
        Output: []
     Example 3:

        Input: words = ["adsdf","sfd"]
        Output: ["adsdf","sfd"]

* */
public class KeyboardRow {
    public static String[] findWords(String[] words) {
        List<String> list = new ArrayList<>();

        String l1 = "qwertyuiop";
        String l2 = "asdfghjkl";
        String l3 = "zxcvbnm";

        for(int i=0; i< words.length; i++){
            String word = words[i].toLowerCase();
            boolean flag1 = true;
            boolean flag2 = true;
            boolean flag3 = true;
            for(char ch: word.toCharArray()){
                if(!l2.contains(Character.toString(ch))){
                    flag2 = false;
                    break;
                }
            }
            for(char ch: word.toCharArray()){
                if(!l1.contains(Character.toString(ch))){
                    flag1 = false;
                    break;
                }
            }
            for(char ch: word.toCharArray()){
                if(!l3.contains(Character.toString(ch))){
                    flag3 = false;
                    break;
                }
            }
            if(flag1){
                list.add(words[i]);

            }
            if(flag3){
                list.add(words[i]);

            }
            if(flag2){
                list.add(words[i]);
            }
        }
        String[] ans = new String[list.size()];
        for(int i=0; i<list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] words ={"adsdf","sfd"};// {"omk"};//{"Hello","Alaska","Dad","Peace"};
        System.out.println(Arrays.toString(findWords(words)));
    }
}

package StringPract;

import java.util.ArrayList;
import java.util.List;

public class PalindromePairsHARD {
    public static boolean strPalindrome(String s){
        int start = 0;
        int end = s.length()-1;
        boolean ans = false;
        while(start<=end){
            if(s.charAt(start) == s.charAt(end)){
                start++;
                end--;
                ans = true;
            }else{
                ans = false;
                break;
            }
        }
        return ans;
    }
    public static List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> list = new ArrayList<>(new ArrayList<>());
        ArrayList<Integer> pair=null;
        // first scan left to right
        for(int i=0; i< words.length; i++){
            String w = "";

            for(int j=i+1; j< words.length; j++){
                w = words[i] + words[j];
                boolean isPalindrome = strPalindrome(w);
                if(isPalindrome){
                    pair = new ArrayList<>();
                    pair.add(i);
                    pair.add(j);

                    list.add(pair);
                }
            }
        }
//
        ArrayList<Integer> pair2=null;
        //scan right to left
        for(int i=words.length-1; i>0 ; i--){
            String w = "";

            for(int j=i-1; j>=0; j--){
                w = words[i] + words[j];
                boolean isPalindrome = strPalindrome(w);
                if(isPalindrome){
                    pair2 = new ArrayList<>();
                    pair2.add(i);
                    pair2.add(j);

                    list.add(pair2);
                }
            }
        }

//

        return list;
    }

    public static void main(String[] args) {
        String[] words = {"a","abc","aba",""};//{"abcd","dcba","lls","s","sssll"};
        System.out.println("Result-> "+palindromePairs(words));
    }
}

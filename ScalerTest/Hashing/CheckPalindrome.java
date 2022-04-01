package Hashing;

import java.util.HashMap;
import java.util.Map;

public class CheckPalindrome {
    //https://www.interviewbit.com/problems/check-palindrome/
    public static int solve(String A) {
        Map<Character,Integer> map = new HashMap<>();
        int n = A.length();
        for(int i=0; i<n; i++){
            map.put(A.charAt(i), map.getOrDefault(A.charAt(i),0)+1);
        }
        int c = 0;
        for(Character key: map.keySet()){
            int val = map.get(key);
            if(n%2 == 0){
                if(val%2 == 1){
                    return 0;
                }
            }else{
                if(val%2 == 1){
                    c++;
                }
            }
        }
        if(n%2 == 1){
            if(c>1){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {//"
        String s = "dcnzutptzzilbtihpgtyegycjysfxlasllvjqatoznaxftxrxjlyoxqnkcalaunxuyokvnkcnouhhxrabcxdaezxakxhjoyco";//"mnxljrajwhxiaquajokwvoqqphylxpbanmmhfxsmssxzsdnprtgibuhaxnwxzfozexiascybplaaqjcthuydnoowmkzyamodzknkqmwdglqqnhflfslqyowcangsddhcjjuiyfbdkevlghbictrvnmnathotrekyrggwcmbzorqtyeowksywlbetsyhjvczcnvusfdrxythrhhoxtuuprqftgwohcgpngktkharijsovuknae";//"uucgncntt";//"abbaee"; // "naman"; //"abcde";
        System.out.println(solve(s));
    }
}

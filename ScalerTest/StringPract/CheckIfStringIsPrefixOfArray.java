package StringPract;

public class CheckIfStringIsPrefixOfArray {
/*
* Given a string s and an array of strings words, determine whether s is a prefix string of words.

A string s is a prefix string of words if s can be made by concatenating the first k strings in words for some positive k no larger than words.length.

Return true if s is a prefix string of words, or false otherwise.
*
    * Example-1
    * Input: s = "iloveleetcode", words = ["i","love","leetcode","apples"]
    Output: true
    Explanation:
    s can be made by concatenating "i", "love", and "leetcode" together.
    *
    * Example-2
    * Input: s = "iloveleetcode", words = ["apples","i","love","leetcode"]
    Output: false
    Explanation:
    It is impossible to make s using a prefix of arr.
    *
* */
    public static boolean isPrefixString(String s, String[] words) {
        String str = "";
        for(int i=0; i<words.length; i++){
            str = str + words[i];
            if(s.equals(str)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
       String s = "iloveleetcode";
       String[] words = {"i","love","leetcode","apples"};
//        String s = "iloveleetcode";
//        String[] words = {"apples","i","love","leetcode"};
       System.out.println(isPrefixString(s,words));
    }
}

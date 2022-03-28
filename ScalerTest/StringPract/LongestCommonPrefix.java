package StringPract;

import java.util.ArrayList;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] S) {
        if (S.length == 0) return "";
        String prefix = S[0];
        for (int i = 1; i < S.length; i++)
            while (S[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }

    public static String longestCommonPrefix(ArrayList<String> A) {
        String prefix= A.get(0);
        int n = A.size();
        for(int i=1; i<n; i++){
            while (A.get(i).indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("abab");
        list.add("ab");
        list.add("abcd");

        System.out.println(longestCommonPrefix(list));

        // Your code goes here
//        String s[] = {"flower", "flow", "flight"};
//        System.out.println(longestCommonPrefix(s));
    }
}

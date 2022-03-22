package StringPract;

import java.util.Arrays;

public class StringIsoMorphic {

    public static boolean isoMorphic(String s1,String s2){

        int n = s1.length();
        int m = s2.length();
        if(n != m)
            return false;

        int ALL_CHARS = 26;
        int[] chars1 = new int[ALL_CHARS];
        int[] chars2 = new int[ALL_CHARS];

        for(int i=0; i<n; i++){
            chars1[s1.charAt(i) - 'a']++;
            chars2[s2.charAt(i) - 'a']++;
        }

        for(int i=0; i<n; i++){
            int k = chars1[s1.charAt(i) - 'a'];
            int j = chars2[s2.charAt(i) - 'a'];
            if(k != j)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "aab";
        String s2 = "xxy";
        System.out.println(isoMorphic(s1,s2));
    }
}

package array;

import java.util.Arrays;
import java.util.Locale;

public class CapitalizeTheTitle {

    public static StringBuffer StringOneCharCapital(String s){
        StringBuffer sb = new StringBuffer();
        String s1 = s.charAt(0)+"";
        String su = s1.toUpperCase();
        sb.append(su);
        for(int i=1; i<s.length(); i++){
            sb.append(s.charAt(i));
        }
        return sb;
    }
    public static String capitalizeTitle(String title) {
        String tits = title.toLowerCase(Locale.ROOT);

        StringBuffer sb = new StringBuffer();

        String[] strs = tits.split(" ");

        int n = strs.length;

        for(int i=0; i < n; i++){
            String s = strs[i];
            if(s.length() > 2){
                sb.append(StringOneCharCapital(strs[i]));
            }else{
                sb.append(s);
            }
            if(i < n - 1){
                sb.append(" ");
            }
        }
        return new String(sb);
    }
    public static void main(String[] args) {
        String title = "i lOve leetcode";// "First leTTeR of EACH Word";//"capiTalIze tHe titLe";
        System.out.println(capitalizeTitle(title));
    }
}

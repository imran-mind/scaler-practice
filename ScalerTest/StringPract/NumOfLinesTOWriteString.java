package StringPract;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NumOfLinesTOWriteString {


    public static int[] numberOfLines(int[] widths, String s) {
        int line = 1;
        int count = 0;
        for(char ch: s.toCharArray()){
            int w = widths[ch-'a'];;
            count = count + w;
            if(count > 100){
                line++;
                count = w;
            }
        }
        return new int[]{line,count};
    }
    public static void main(String[] args) {
       int[] widths = {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String s = "bbbcccdddaaa";

//       int[] widths = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
//        String s = "abcdefghijklmnopqrstuvwxyz";

        System.out.println(Arrays.toString(numberOfLines(widths,s)));
//        System.out.println(widths.length);
    }
}

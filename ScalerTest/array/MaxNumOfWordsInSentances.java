package array;

import java.util.Arrays;

public class MaxNumOfWordsInSentances {

    public static int mostWordsFound(String[] sentences) {
        int max = sentences[0].split(" ").length;
        for(int i=0; i<sentences.length; i++){
            String[] s = sentences[i].split(" ");
            System.out.println(Arrays.toString(s)+ " = "+ s.length);
            int sentenceLength = sentences[i].split(" ").length;
            if(sentenceLength > max){
                max = sentenceLength;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        String[] strs = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(strs));
    }
}

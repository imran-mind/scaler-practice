package array;

public class FirstPalindromStrInArr {
    public static String reverseStr(String s){
        String st = "";
        for(int i=s.length()-1; i>=0; i--){
            st = st + s.charAt(i);
        }
        return st;
    }
    public static String firstPalindrome(String[] words) {
        int n = words.length;
        String s = words[0];
        for(int i=0; i<n; i++){
            String sen = words[i];
            String revStr = reverseStr(sen);
            if(revStr.equals(sen)){
                s = sen;
                return s;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        String[] s = {"abc","car","ada","racecar","cool"};
        System.out.println(firstPalindrome(s));
    }
}

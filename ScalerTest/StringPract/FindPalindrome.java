package StringPract;

public class FindPalindrome {

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
    public static void main(String[] args) {
        String s = "mom";
        boolean res = strPalindrome(s);
        System.out.println("ans "+res);
    }
}

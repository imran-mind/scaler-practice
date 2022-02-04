package StringPract;

import java.util.Arrays;

public class ChangesInReverse {

    public static boolean isPalindrome(String s){
        int start = 0;
        int end = s.length()-1;
        boolean ans = false;
        while(start<=end){
//            System.out.println(start+ " "+end);
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
    public static int countRev(String A) {
        int  c = 0;
        boolean res = isPalindrome(A);
//        System.out.println(res);
        if(res){
            return c;
        }else{
//            System.out.println("---string---"+A);

            char[] charArr= A.toCharArray();
            StringBuilder sb = new StringBuilder(A);
            String strRev = new String(sb.reverse());
            char[] charArrRev = strRev.toCharArray();
//            System.out.println(Arrays.toString(charArr));
//            System.out.println(Arrays.toString(charArrRev));
            for(int i=0; i<charArr.length; i++){

                if(charArr[i] != charArrRev[i]){
                    c++;
                }
            }
        }
        return c;
    }

    public static void main(String[] args) {
//        String s="scaler";
        String s="kayak";
        System.out.println(countRev(s));

    }
}

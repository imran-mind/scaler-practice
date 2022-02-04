package StringPract;

import java.util.Scanner;

public class StringPract {
    public static boolean strPalindrome(String s){
        int start = 0;
        int end = s.length()-1;
        boolean ans = false;
        while(start<=end){
//            System.out.println(start+ " "+end);
            System.out.println("start "+start+" end "+end+" =>"+s.charAt(start)+" "+s.charAt(end));
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
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        boolean res = strPalindrome(s);
        System.out.println("ans "+res);
    }
}

package recursion;

import java.util.Scanner;

public class ReverseStr {

    public static String reverse(String s, int len, StringBuilder sb){

        if(len == 0)
            return sb.append(s.charAt(0)).toString();
//        System.out.println(s.charAt(len));
        sb.append(s.charAt(len));
        return reverse(s, len-1,sb);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        System.out.println(reverse(s, s.length()-1,sb));
    }
}

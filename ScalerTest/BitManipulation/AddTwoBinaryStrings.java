package BitManipulation;

import java.util.ArrayList;
import java.util.Collections;

public class AddTwoBinaryStrings {

    public static long binaryToDecimal(String s){
        long dec = 0;
        int p = 0;
        for(int i=s.length()-1; i>=0; i--){
            int d = Character.getNumericValue(s.charAt(i));
            long power = (int) Math.pow(2,p);
            dec = dec + power *  d;
//            System.out.println("power "+power+" d "+d);
            p++;
        }
        return dec;
    }

    public static String decimalToBinary(long a){
        String ans = "";
        ArrayList<Long> list = new ArrayList<>();
        while (a>0){
            long rem = a&1;
            list.add(rem);
            a =  a / 2;
        }
        Collections.reverse(list);
        for(int i=0; i<list.size(); i++){
            ans = ans + list.get(i);
        }
        return ans;
    }
    public static String addBinary(String a, String b) {
            // Initialize result
            StringBuilder result = new StringBuilder("");

            // Initialize digit sum
            int s = 0;

            // Traverse both strings starting
            // from last characters
            int i = a.length() - 1, j = b.length() - 1;
            while (i >= 0 || j >= 0 || s == 1)
            {

                // Comput sum of last
                // digits and carry
                s += ((i >= 0)? a.charAt(i) - '0': 0);
                s += ((j >= 0)? b.charAt(j) - '0': 0);

                // If current digit sum is
                // 1 or 3, add 1 to result
                result.append((char)(s % 2 + '0'));

                // Compute carry
                s /= 2;

                // Move to next digits
                i--; j--;
            }

            // Remove leading zeros, if any
            int start = result.length()-1;

            while(start >=0 && result.charAt(start) == '0') {
                start--;
            }

            if(start != result.length()-1) {
                result.delete(start+1,result.length());
            }

            return result.reverse().toString();
    }
    public static void main(String[] args) {
        String a = "10001100010111000101100010100110001001101010000010011010";
        String b = "101111000100100100111110010010101110101001100100101001111010011000000110";
        System.out.println(addBinary(a,b));
        System.out.println((char)(2 % 2 + '0'));
    }
}

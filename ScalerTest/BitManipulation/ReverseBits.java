package BitManipulation;

import java.util.ArrayList;
import java.util.Collections;

//https://practice.geeksforgeeks.org/problems/reverse-bits3556/1
public class ReverseBits {
    public static long reverseBits(long n)
    {
        long res = 0;

        // traversing bits of 'n'
        // from the right
        int i=0;
        while (n > 0){
            long rem = n%2;
            long power = (long) Math.pow(2,31-i);
            res = res + rem * power;
            i++;
            n= n / 2;
        }
        // required number
        return res;
    }
    public static void main(String[] args) {
        long a =3;
        System.out.println(reverseBits(a));
    }
}

package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class PlusOneToDigitsArray {

    public static void checkArrRef(int[] a){

        int n = a.length;

        int[] newArr = new int[n+1];
        newArr[0] = 1;
        System.out.println(Arrays.toString(newArr));
    }

    public static int[] plusOn(int[] digits) {

        int n = digits.length;

        for(int i=n-1; i>=0; i--){
            if(digits[i] < 9){
                digits[i]++;    // if a digit is less than 9, just add 1 and return the new digit array
                return digits;
            }else{
                digits[i] = 0; // if digit is 9, make it zero and in the next iteration the next value will get increment
            }
        }

        // if we are here means, every digit in array was 9. So create a new array with +1 size and make first digit Zero.
        // exp:  99 => create new array of size 3 => make its first digit 0 => return new array => 100;

        int[] newDigit = new int[n+1];
        newDigit[0] = 1;

        return newDigit;

    }
    public static void main(String[] args) {
        int[] a= {9,9,9};
//        int[] a= {4,3,2,1};
//        int[] a= {2,1,0};
//            int[] a = {9,9};
//        int[] a = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
//        int[] a= {9,8,7,6,5,4,3,2,1,0};
//        System.out.println(9876543210L+1);
//        System.out.println(Arrays.toString(plusOne(a)));
//        System.out.println(Arrays.toString(plusOn(a)));
        checkArrRef(a);
    }
}

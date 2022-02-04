package StringPract;

import java.util.Scanner;

public class CountVowelsAndConsonants {

    public static int isvowel(char c){
        char[] vowels = {'a','e','i','o','u'};
        int isVow = 0;
        for(int i=0; i<vowels.length; i++){
            if(vowels[i] == c){
                isVow = 1;
            }
        }
        return isVow;
    }

    public static void countVowelAndCons(String str){

        char[] arr = str.toCharArray();
        int vowel=0;
        int cons =0;
        for(int i=0; i< arr.length; i++){
            int ans = isvowel(arr[i]);
            if(ans == 1){
                vowel++;
            }else{
                cons++;
            }
        }
        System.out.println(vowel+" "+cons);
    }

    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
//        String sp = "*abc*";
//        System.out.println(sp.trim());
        Scanner sc = new Scanner(System.in);
        int T= sc.nextInt();
        for(int i=0; i<=T; i++){
            String str = sc.nextLine();
            if(str.length()>0){
               countVowelAndCons(str);
            }
        }
    }
}

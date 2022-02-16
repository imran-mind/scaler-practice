package MathsProblems;

import java.util.Scanner;

public class PrimeGeneratorUsingMethod {

    public static boolean checkPrime(int i){
        for(int j=2; j*j<i; j++){
            if(i%j==0){
                return false;
            }
        }
        return true;
    }

    public static void printPrime(int A, int B){
        for(int i=A; i< B; i++){
            if(checkPrime(i)){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        printPrime(A,B);
    }
}

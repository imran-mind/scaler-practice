import java.util.Arrays;

public class CountPrimes {
//    https://leetcode.com/problems/count-primes/discuss/1707897/Java-Solution(Accepted)-with-detailed-optimization-instructions
    public static int countPrimes(int n){
        int count = 0;
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime,true);

        for(int i=2; i<n; i++){
            if(isPrime[i]){
                //multiplies of i can't be prime
                for(int j=2*i; j<n; j=j+i){
                    isPrime[j] = false;
                }
            }
        }
        for(int i=2; i<n; i++){
            if(isPrime[i])
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int n =10;
        System.out.println(countPrimes(n));
    }
}


package recursion;

public class SumTheDigits {
    static int sum = 0;
    public static int sumOfDig(int n){
        if(n == 0)
            return sum;
        int k = n % 10;
        sum = sum + k;
        n = n/10;
        return sumOfDig(n);
    }
    public static void main(String[] args) {
        int n = 1589;//123;
        int result = sumOfDig(n);
        System.out.println(result);
    }
}

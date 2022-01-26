public class DecimalToBinary {

    static long decimalToBinary(int n){
//        int p = 1;
        long ans = 0;
//        while (n > 0){
//            int rem = n % 2;
//            ans = ans + rem * p;
//            p = p * 10;
//            n = n / 2;
//        }
//        return ans;
        int p = 5;
        while (n > 0){
            int rem = n % 2;
            ans = ans + rem * p;
            p = p * 5;
            n = n / 2;
        }
        return ans;
    }
    public static void main(String[] args) {
        int a = 6;
        System.out.println(decimalToBinary(a));
    }
    /* rem = 0 + 0 * 5;
      ans =0;

    *
    * */
}

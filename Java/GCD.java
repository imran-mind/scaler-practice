public class GCD {
    public static int gcd(int A, int B) {
        int n = Math.min(A,B);
//        System.out.println("n-> "+n);
//        System.out.println("pre "+ (1<=n));
        int gcd = 1;

        for(int i=1; i<=n; i++){
//            System.out.println("A%i == 0 && B%i == 0-> "+(A%i == 0 && B%i == 0));
            if(A%i == 0 && B%i == 0){
                gcd = Math.max(i,gcd);
//                System.out.println("gcd-> "+gcd);
            }
        }
        return gcd;
    }

    public  static int gcdImproved(int a,int b){
        return b == 0 ?  a : gcdImproved(b, a%b);
    }
    public static void main(String[] args) {
        int a = 3;
        int b = 9;
//        int res = gcd(a,b);
        int res = gcdImproved(a,b);
        System.out.println(res);
    }
}

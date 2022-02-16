package MathsProblems;

public class LCM {

    public  static int gcdImproved(int a,int b){
        return b == 0 ?  a : gcdImproved(b, a%b);
    }

    public static int lcm(int a, int b){
        int l = a*b/gcdImproved(a,b);
        return l;
    }

    public static void main(String[] args) {
        int a = 12;
        int b = 9;
//        int res = gcd(a,b);
        int res = lcm(a,b);
        System.out.println(res);
    }
}

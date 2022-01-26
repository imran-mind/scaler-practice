package recursion;

public class EasyPower {
    static int res = 1;
    public static int pow(int a, int b){
        if(b == 0)
            return 1;
        pow(a, b-1);
        return res = res * a;
    }
    public static void main(String[] args) {
        int r = pow(2,4);
        System.out.println(r);
    }
}

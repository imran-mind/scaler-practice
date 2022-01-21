package recursion;

public class IncDec {

    public static void dec(int n){
        if(n == 0)
            return;
        System.out.println(n);
        dec(n-1);
    }
    public static void inc(int n){
        if(n == 0)
            return;
        inc(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        dec(5);
        inc(5);
    }
}

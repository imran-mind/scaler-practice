package BitManipulation;

public class NoOfSetBitsAreThereInN {

    public static int set(int n){
        int cnt =0;
        while (n>0){
            if((n & 1) == 1)
                cnt++;
            n = n>>1;
        }
        return cnt;
    }
    public static void main(String[] args) {
        int n = 8;
        System.out.println(set(n));
    }
}

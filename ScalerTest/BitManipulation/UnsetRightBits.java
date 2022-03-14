package BitManipulation;

public class UnsetRightBits {

    public static boolean checkBit(int N, int i){
        return ((N >> i) & 1) == 1;
    }

    public static int unset(int n, int b){
        for(int i=0; i<b; i++){
            if(checkBit(n,i)){
                n = n - (1<<i);
            }
        }
        return n;
    }
    public static void main(String[] args) {
        int n = 53;
        int b = 5;
        System.out.println(unset(n,b));
    }
}

package contest;

public class MinimunPicks {

    //https://www.scaler.com/test/b7237e3e67/?signature=BAhpA6CFCg%3D%3D--cb6e2785fd156d5da23e8fbe46c2b62f9b1460bf#/problem_1
    // odd min
    public static int minVal(int[] A){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<A.length; i++){
            int n = A[i];
            if((n&1) != 0) {
                if (n < min) {
                    min = n;
                }
            }
        }
        return min;
    }

    //even max
    public static int maxVal(int[] A){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<A.length; i++){
            int n = A[i];
            if((n&1) == 0) {
                if (n > max) {
                    max = n;
                }
            }
        }
        return max;
    }
    public static int solve(int[] A) {
        int maxEven = maxVal(A);
        int minOdd = minVal(A);
        return maxEven - minOdd;
    }
    public static void main(String[] args) {
        String st = "()}";//"{()"; //"({}{[{}]})";   //
//        System.out.println(isValid(st));
        int[] a = {-98,54,-52,15,23,-97,12,-64,52,85};
        System.out.println(solve(a));


    }
}

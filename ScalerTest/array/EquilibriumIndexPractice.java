package array;

public class EquilibriumIndexPractice {

    // o(n)
    public static int[] prefixSumArray(int[] arr){
        int n = arr.length;
        int[] ps = new int[n];
        ps[0] = arr[0];
        for(int i=1; i<n; i++){
            ps[i] = ps[i-1] + arr[i];
        }
        return ps;
    }
    public static boolean isEquilibriumIndex(int[] arr){
        int[] ps = prefixSumArray(arr);
        int n = arr.length;
        // O(n)
        for(int i=1; i<n; i++){
            int sl = ps[i-1];
            int sr = ps[n-1] - ps[i];
            if(sl == sr)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,8,10};
        // TC =>  O(n) + O(n) = O(n)
        // SC => O(1);
        System.out.println(isEquilibriumIndex(arr));
    }
}

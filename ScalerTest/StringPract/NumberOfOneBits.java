package StringPract;

public class NumberOfOneBits {


    public static int hammingWeight(int n) {
        int ans = 0;
        System.out.println(n);
        String s = String.valueOf(n);
        System.out.println(s);
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '1'){
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 00000000000000000000000010000000;//00000000000000000000000000001011;
        System.out.println(hammingWeight(n));
    }
}

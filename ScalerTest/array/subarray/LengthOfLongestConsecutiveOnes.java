package array.subarray;

public class LengthOfLongestConsecutiveOnes {

    public static int solve(String A) {
        int oneCount = 0;
        for(int i=0; i<A.length();i++){
//            System.out.println(A.charAt(i));
            if(A.charAt(i) == '1')
                oneCount++;
        }

        int ans = 0;
        for(int i=0; i<A.length(); i++){
            int len =0;
            if(A.charAt(i) == '0'){
                int l = 0;
                for(int j=i-1; j>=0; j--){
//                    System.out.println(A.charAt(j));
                    if(A.charAt(j) == '1') {
                        l++;

                    }
                    else
                        break;;
                }

                int r = 0;
                for(int j=i+1; j<A.length(); j++){
                    if(A.charAt(j) == '1')
                        r++;
                    else
                        break;
                }

                if(l+r < oneCount )
                    len = l+r+1;
                else
                    len = l+r;
//                System.out.println(l+" "+r);
                ans = Math.max(len,ans);
            }
        }

        return ans == 0 ? A.length() : ans;
    }
    public static void main(String[] args) {
        String A = "1111";
        System.out.println(solve(A));
    }
}

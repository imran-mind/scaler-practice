package StringPract;

public class AmazingSubarrays {

//https://www.scaler.com/academy/mentee-dashboard/class/21192/homework/problems/1054/?navref=cl_pb_nv_tb
    public static int solve(String A) {
        int c = 0;
        String vowels = "aeiouAEIOU";
        int n = A.length();
        for(int i=0; i<n; i++){
//            StringBuilder sb = new StringBuilder();
            if(vowels.contains(A.charAt(i)+"")) {
                for (int j = i; j < n; j++) {
//                    sb.append(A.charAt(j));
//                    System.out.println(sb.toString());
                    c++;
                }
            }
        }
        return c;
    }
    public static void main(String[] args) {
        String s = "amin";//"Aab";//"ABEC";
        System.out.println(solve(s));
    }
}

package StringPract;

public class CountOccurrences {

    //https://www.scaler.com/academy/mentee-dashboard/class/21192/homework/problems/10748?navref=cl_tt_lst_nm
    public static int solve(String A) {
        int n = A.length();
        int c = 0;
        for(int i=0; i<n-2; i++){
            StringBuilder sb= new StringBuilder();
            for(int j=i; j<3+i; j++){
                sb.append(A.charAt(j));
            }
            if(sb.toString().equals("bob")){
                c++;
            }
//            System.out.println(sb.toString());
        }
        return c;
    }
    public static void main(String[] args) {
        String s = "abobc";
        System.out.println(solve(s));
    }
}

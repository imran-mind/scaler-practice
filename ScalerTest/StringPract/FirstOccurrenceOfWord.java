package StringPract;

public class FirstOccurrenceOfWord {


    public static int firstOcc(String A, String B){
        int idx = A.indexOf(B);
        if(idx != -1){
            return idx+1;
        }
        return idx;
    }

    public static void main(String[] args) {
        String A = "aabababaa";
        String B = "bac";
//        System.out.println(A.indexOf("ba"));
        int ans = firstOcc(A,B);
        System.out.println(ans);
    }
}

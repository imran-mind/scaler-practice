package StringPract;

public class ReverseTheString {
    public static String solve(String A) {
        StringBuilder sb = new  StringBuilder();
        String[] stArr = A.split(" ");
        int n = stArr.length-1;
        for(int i=n; i>=0; i--){
            String str = i > 0 ? stArr[i]+" ": stArr[i];
            sb.append(str);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "this is the sky";
        System.out.println(solve(s));
        System.out.println("aboba".contains("bob"));

    }
}

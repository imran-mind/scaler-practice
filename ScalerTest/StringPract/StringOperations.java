package StringPract;

public class StringOperations {

    // concatenate string with itself
    // delete all uppercase letter
    // replace vowels with #;
    public static String solve(String A) {
        String concatedStr = A+A;
        StringBuilder sb = new StringBuilder();
        String vowels = "aeiou";
        int n = concatedStr.length();
        for(int i=0; i<n; i++){
            char ch = concatedStr.charAt(i);
            if(ch>='a' && ch<='z'){
                sb.append(ch);
            }
        }
        StringBuilder sb1 = new StringBuilder();
        String newStr = sb.toString();
        for(int i=0; i<newStr.length(); i++){
            char ch = newStr.charAt(i);
            if(vowels.contains(ch+"")){
                sb1.append("#");
            }else {
                sb1.append(ch);
            }
        }
//        System.out.println(sb1.toString());
        return  sb1.toString();
    }
    public static void main(String[] args) {
        String s = "AbcaZeoB";
        System.out.println(solve(s));
    }
}

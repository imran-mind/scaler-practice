package StringPract;

/*  Example 1:
    * Input: s = "Hello how are you Contestant", k = 4
    Output: "Hello how are you"
    Explanation:
    The words in s are ["Hello", "how" "are", "you", "Contestant"].
    The first 4 words are ["Hello", "how", "are", "you"].
    Hence, you should return "Hello how are you".
*
*   => Example 2:
    * Input: s = "What is the solution to this problem", k = 4
    Output: "What is the solution"
    Explanation:
    The words in s are ["What", "is" "the", "solution", "to", "this", "problem"].
    The first 4 words are ["What", "is", "the", "solution"].
    Hence, you should return "What is the solution".
    *
* */
public class TruncateSentence {
    public static String truncateSentence(String s, int k) {
        String[] strs = s.split(" ");
        String ans = "";

        for(int i=0; i<strs.length; i++){
            if(k > 0){
//                ans = ans + (k-1 < k ? strs[i] +" " : strs[i] );
                ans = ans + strs[i]+" ";
            }
            k--;
        }

        return ans.trim();
    }
    public static void main(String[] args) {
//        String s = "Hello how are you Contestant";
//        int  k = 4;
        String s = "What is the solution to this problem";
        int k = 4;
        System.out.println(truncateSentence(s,k));
    }
}

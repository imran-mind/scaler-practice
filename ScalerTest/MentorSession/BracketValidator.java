package StringPract;

import java.util.HashMap;
import java.util.Stack;

public class BracketValidator {

    // write your code here...
// (), [], {}, [()], {[]}, {[()]}
// ()], {], [)(], }{

// ( { [ {
// ({}{[{}]})
// {}

// {()
// ()}


//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

//An input string is valid if:

//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.

    public static boolean isValid(String str) {
        HashMap<Character,Character> map = new HashMap<>();
        map.put('}','{');
        map.put(']','[');
        map.put(')','(');
        // stack =>
        Stack<Character> st = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c == '{' || c == '[' || c=='(' ){
                st.push(c);
            }else if(c == '}' || c == ']' || c == ')'){
                char openingBracket = map.get(c);
                if(st.size()==0)
                    return false;
                if(st.peek() != openingBracket)
                    return false;
                else{
                    st.pop();
                }
            }
        }
        if(st.size() > 0)
            return false;
        else
            return true;
    }

    // odd min
//    public static int minVal(int[] A){
//        int min = Integer.MAX_VALUE;
//        for(int i=0; i<A.length; i++){
//            int n = A[i];
//            if((n&1) != 0) {
//                if (n < min) {
//                    min = n;
//                }
//            }
//        }
//        return min;
//    }
//
//    //even max
//    public static int maxVal(int[] A){
//        int max = Integer.MIN_VALUE;
//        for(int i=0; i<A.length; i++){
//            int n = A[i];
//            if((n&1) == 0) {
//                if (n > max) {
//                    max = n;
//                }
//            }
//        }
//        return max;
//    }
//    public static int solve(int[] A) {
//        int maxEven = maxVal(A);
//        int minOdd = minVal(A);
//        return maxEven - minOdd;
//    }
    public static void main(String[] args) {
        String st = "()}";//"{()"; //"({}{[{}]})";   //
      System.out.println(isValid(st));
//        int[] a = {-98,54,-52,15,23,-97,12,-64,52,85};
//        System.out.println(solve(a));


    }
}


// isomorphic string
// Input: s = "egg", t = "add"
// Output: true
// s = "foo", t ="bar"

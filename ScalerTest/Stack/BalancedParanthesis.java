package Stack;

import java.util.Stack;

public class BalancedParanthesis {
    public static char getParanthesis(char c){
        if(c == ']'){
            return '[';
        }else if(c == ')'){
            return '(';
        }else
            return '{';
    }
    public static int solve(String A) {
        Stack st= new Stack();
        String openingBrac = "{([";
        int n = A.length();
        if(A.charAt(0) == ')' ||A.charAt(0) == '}' || A.charAt(0) == ']')
            return 0;
        for(int i=0; i<n; i++){
            if(openingBrac.contains(A.charAt(i)+"")){
                st.push(A.charAt(i));
//                System.out.println("if "+st);
            }else{

                char ch = getParanthesis(A.charAt(i));
                if(ch == (char) st.peek()){
                    st.pop();
                }
//                System.out.println("else "+st);
            }
        }
        if(st.size() == 0)
            return 1;
        return 0;
    }
    public static void main(String[] args) {
        String s = "))))))))";//"()[]";//"(){";//"{([])}";
        System.out.println(solve(s));
    }
}

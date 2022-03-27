package StringPract;

import java.util.ArrayList;

public class Isalnum {

    public static int solve(ArrayList<Character> A) {
        int n = A.size();
        for(int i=0; i<n; i++){
            if(A.get(i)>='A' && A.get(i)<='Z'){

            }else if(A.get(i)>='a' && A.get(i)<='z'){

            }else if(A.get(i)>='0' && A.get(i) <='9'){

            }else{
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        char[] ch = {'S', '#', 'A', 'l', 'e', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y'};
        ArrayList<Character> charArr = new ArrayList<Character>();

        for(int i =0; i<ch.length; i++){
            charArr.add(ch[i]);
        }
        System.out.println(solve(charArr));
    }
}

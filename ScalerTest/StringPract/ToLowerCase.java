package StringPract;

import java.util.ArrayList;

public class ToLowerCase {

    public static ArrayList<Character> toLower(ArrayList<Character> A){
        ArrayList<Character> charArr = new ArrayList<Character>();

        int n = A.size();
        for(int i=0; i<n; i++){
            if(A.get(i)>='A' && A.get(i)<='Z'){
                Character ch = A.get(i);
                Character c = (char) (ch+32);
                charArr.add(c);
            }else{
                charArr.add(A.get(i));
            }
        }
        return charArr;
    }
    public static void main(String[] args) {
        char[] ch = {'S', 'c', 'A', 'l', 'e', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y'};
        ArrayList<Character> charArr = new ArrayList<Character>();

        for(int i =0; i<ch.length; i++){
            charArr.add(ch[i]);
        }
        System.out.println(toLower(charArr));
    }
}

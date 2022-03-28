package StringPract;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ChangeCharacter {

    //create array for a - z alphabets
    //put occrences of char and add into index of specific char a->0 , b->1 position respectivly
    //find char which has occrences of >= B
    // replace this char to occ < B
    public static int solve(String A, int B) {
        int c = 0;
        int n = A.length();
        int[] arr = new int[26];
        String b = "";
        for(int i=0; i<n; i++){
            int pos = A.charAt(i) - 'a';
            arr[pos]++;
        }

        for(int i=0; i<n; i++){
            int pos = A.charAt(i) - 'a';
            int freq = arr[pos];
            if(freq>=B){
                b = A.charAt(i)+"";
                c++;
            }
        }
        StringBuilder sb = new StringBuilder();
        Set<String> set = new HashSet<>();
        for(int i=0; i<n; i++) {
//            int pos = A.charAt(i);
            if(arr[i] < B){
                char cb =(char) ('a'+i);
//                System.out.println(cb);
                sb.append(b);
                set.add(b);
            }else{
                sb.append(A.charAt(i));
                set.add(A.charAt(i)+"");
            }

        }

//        System.out.println(sb.toString());
//        System.out.println(Arrays.toString(arr));
//        System.out.println("b => "+b);
//        System.out.println("set "+set);

        return set.size();
    }
    public static void main(String[] args) {
        String s ="abcabbccd";
        System.out.println(solve(s,3));
    }
}

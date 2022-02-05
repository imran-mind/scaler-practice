package StringPract;

public class ShuffleString {

    public static String restoreString(String s, int[] indices) {
        char[] arr= new char[indices.length];
        for(int i=0; i<s.length();i++){
            int idx = indices[i];
            arr[idx] = s.charAt(i);
        }
        return new String(arr);
    }
    public static void main(String[] args) {
//        String s= "codeleet";
//        int[] indices = {4,5,6,7,0,2,1,3};
        String s= "abc";
        int[] indices = {0,1,2};
        System.out.println(restoreString(s,indices));
    }
}

package array;

public class TwoStringArraysAreEquivalent {

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 = "";
        String str2 = "";

        for(int i=0; i<word1.length; i++){
            str1 = str1 + word1[i];
        }
        for(int i=0; i<word2.length; i++){
            str2 = str2 + word2[i];
        }
        System.out.println(str1+" "+str2);

        if(str1.equals(str2)){
            return true;
        }else{
            return false;
        }

    }
    public static void main(String[] args) {
        String[] word1 = {"ac", "b"}, word2 = {"ab", "c"};
        boolean isMatch = arrayStringsAreEqual(word1,word2);
        if(isMatch){
            System.out.println("words match");
        }else {
            System.out.println("words does not match");
        }
    }
}

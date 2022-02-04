package StringPract;

public class VowelOrConsonant {

    public static boolean isVowel(char c){
        char[] vowels = {'a','e','i','o','u'};
        boolean isVow = false;
        for(int i=0; i<vowels.length; i++){
            if(vowels[i] == c){
                isVow = true;
            }
        }
        return isVow;
    }
    public static void main(String[] args) {
        char c = 'b';
        boolean ans = isVowel(c);
        System.out.println(ans);
    }
}

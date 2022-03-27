package StringPract;

public class PrintAllSubsrting {
    public static boolean isPalindrom(String s){
        int start =0 ;
        int end = s.length()-1;
        while (start<end){
            if(s.charAt(start) != s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
    public static void printAllSubstring(String s){

        for(int i=0; i<s.length(); i++){
            for(int j=0; j<=i; j++){
                String subStr = "";
                for(int k=j; k<=i; k++){
                    subStr+=s.charAt(k);
                }
                if(subStr.length()>1) {
                    boolean isPalind = isPalindrom(subStr);
                    if(isPalind){
                        System.out.println(subStr);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        String s = "abbaeae";
        printAllSubstring(s);
        System.out.println(isPalindrom("abcba"));
        System.out.println(1<<30);
    }


}

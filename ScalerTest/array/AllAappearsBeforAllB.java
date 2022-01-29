package array;

public class AllAappearsBeforAllB {

    public static boolean checkString(String s) {
        int aCount = 0;
        int bCount = 0;
        boolean flag = true;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'a'){
                aCount++;
            }
        }
        bCount = s.length()- aCount;
        if(aCount == 0)
            return flag;

        for(int j=0; j<s.length(); j++){
            if(s.charAt(j) != 'a' && j < aCount){
                flag = false;
                return flag;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        String s = "aaaaab";//"bbb";//"aaabbb";
        System.out.println(checkString(s));
    }
}

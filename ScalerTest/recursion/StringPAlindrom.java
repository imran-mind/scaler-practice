package recursion;

public class StringPAlindrom {

    public static int isPal(String A, int s, int e){
        if(s == e)
            return 1;

        if(A.charAt(s) != A.charAt(e))
            return 0;

        if(s<e+1){
            return isPal(A, s+1, e-1);
        }
        return 1;
    }
    public static int isPalindrome(String A){
        int n = A.length();

        if(n==0)
            return 1;

        return isPal(A, 0, n-1);
    }

    public static void main(String[] args) {
        String str = "abc";

        if (isPalindrome(str)==1)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}


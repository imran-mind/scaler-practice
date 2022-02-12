package StringPract;

public class SumOfDigitsOfStringAfterConvert {
    public static  int getLucky(String s, int k) {
        int ans = 0;
        String str = "";
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            str = str + (ch - 96);
        }

        while (k>0){
            int sum =0;
            for(int i=0; i<str.length(); i++){
                int num = Integer.parseInt(str.charAt(i)+"");
                sum = sum + num;
            }
            str = sum+"";
            ans = sum;
//            System.out.println(sum);
            k--;
        }
//        System.out.println(str);
        return ans;
    }
    public static void main(String[] args) {
        String s = "leetcode";//"iiii";//"zbax";
        int k = 2;
        System.out.println(getLucky(s,k));
//        int  a =  'a'; //97
//        int z = 'z'; //122
//        System.out.println('z'-96);
    }
}

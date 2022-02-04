package StringPract;

public class TrimFromStartEnd {

    public static String trimStartAndEnd(String str){

        char[] charArr= str.toCharArray();
        int startStarCount = 0;
        int endStartCount = 0;
        for(int i=0; i<charArr.length;i++){
            if(charArr[i] == '*'){
                startStarCount++;
            }else{
                break;
            }
        }
        if(startStarCount == str.length()){
            return "";
        }
        for(int i=charArr.length-1; i>=0;i--){
            if(charArr[i] == '*'){
                endStartCount++;
            }else{
                break;
            }
        }
        System.out.println(startStarCount+" "+endStartCount);
        String ans = str.substring(startStarCount,str.length()-endStartCount);

        System.out.println(ans);
        return  str;
    }

    public static void main(String[] args) {
        String s = "**hel*l*o***";//"*****";
        trimStartAndEnd(s);
    }
}

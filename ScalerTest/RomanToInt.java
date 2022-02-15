import java.util.HashMap;

/*
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
* */
public class RomanToInt {
    public static int romanToInt(String s) {
        int ans = 0;
        HashMap<String ,Integer> map = new HashMap<>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);

        for(int i=0; i<s.length(); i++){
            String key = Character.toString(s.charAt(i));
            int v = map.get(key);
            System.out.println(key + " = "+ v);
            ans = ans + v;
        }
        return ans;
    }
    public static void main(String[] args) {
        String s="MCMXCIV";
        System.out.println(romanToInt(s));
    }
}

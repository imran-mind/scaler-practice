package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//https://www.scaler.com/academy/mentee-dashboard/class/21193/homework/problems/275?navref=cl_tt_lst_sl
//https://www.interviewbit.com/problems/colorful-number/
public class ColorfulNumber {

    public static int colorful(int A) {
       String num = A+"";
        Map<Long,Boolean> map =new HashMap<>();
       int n = num.length();
       for(int i=0; i<n; i++){
           long mul = 1;
           for(int j=i; j<n; j++){
               int d = num.charAt(j)-'0';
               mul = mul * d;
               if(map.containsKey(mul)){
                   return 0;
               }else{
                   map.put(mul, true);
               }
           }
//           System.out.println(map);
       }
       return 1;
    }
    public static void main(String[] args) {
        int n = 236;
        System.out.println("ans "+colorful(n));
    }
}

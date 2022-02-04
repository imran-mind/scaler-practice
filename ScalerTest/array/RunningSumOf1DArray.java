package array;

import java.util.Arrays;
import java.util.Locale;

public class RunningSumOf1DArray  {

    public static int[] runningSum(int[] nums) {
        int[] arr = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            int sum = 0;
            for(int j=0; j <= i; j++){
                System.out.print("nums["+i+"] "+nums[j]);
                sum = sum + nums[j];
            }
            System.out.println();
            arr[i] = sum;
        }

        return arr;
    }

    public static void findOcc(String para, String f){
        para = para.toLowerCase();
        f = f.toLowerCase();

        int idx=para.indexOf(f);
        while (idx != -1){
            System.out.println(idx);
            idx = para.indexOf(f, idx+ 1);
        }
//        int c = 0;
//        for(int i=0; i<st.length; i++){
////            System.out.println(st[i].indexOf(f));
//            if(st[i].indexOf(f) != -1){
//                c++;
//            }
//        }
//        System.out.println(c);
        String sp = "java prog";
        char[] arr = sp.toCharArray();
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr= {1,2,3,4};
//        int[] arr= {8000,9000,2000,3000,6000,1000};

//        int[] ans =  runningSum(arr);
//        System.out.println(Arrays.toString(ans));
        String s = "Java programming java lang, java is good JavA Lang";
        System.out.println();
        String f = "java";
        findOcc(s,f);
    }
}

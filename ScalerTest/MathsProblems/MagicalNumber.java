package MathsProblems;

public class MagicalNumber {
    //https://www.scaler.com/academy/mentee-dashboard/class/19186/assignment/problems/4105/?navref=cl_pb_nv_tb
    public static int magicanNum(int n){
        int sum = 0;
        int pow = 1;
        while (n>0){
            int rem = n%2;
            sum = sum + (rem * (int) Math.pow(5,pow));
            n = n / 2;
            pow++;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n = 13;
        System.out.println(magicanNum(n));
    }
}

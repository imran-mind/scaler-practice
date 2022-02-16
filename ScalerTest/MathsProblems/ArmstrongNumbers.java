package MathsProblems;

public class ArmstrongNumbers {
    public static int getCube(int n){
        return n*n*n;
    }

    public static int getArmstrong(int  m){
        int sum = 0;
        while (m>0){
            int rem = m % 10;
            int num = getCube(rem);
            sum = sum + num;
            m= m/10;
        }
        return sum;
    }
    public static int armstrong(int n){
        for(int i=1; i<=n; i++){
            int ans = getArmstrong(i);
            if(i == ans){
                System.out.println("arm "+i);
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        int n = 200;
        System.out.println("reslult "+armstrong(n));
//        getArmstrong(5);
    }
}

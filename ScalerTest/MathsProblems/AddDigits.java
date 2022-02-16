package MathsProblems;

public class AddDigits {

    public static int addDigits(int num) {
        if(num <= 9 ){
            return num;
        }
        int a = num/10;
        int b = num%10;
        int sum = a+b;
        return addDigits(sum);
    }
    public static void main(String[] args) {
        int a = 100;// 38
        System.out.println(addDigits(a));
    }
}

package MathsProblems;

public class SumOfDigit {

    public static void main(String[] args) {
        int n = 1234;
        int sum =0;
        while (n>0){
            int rem = n % 10;
            sum = sum + rem;
            n = n/10;
        }
        System.out.println(sum);
    }
}

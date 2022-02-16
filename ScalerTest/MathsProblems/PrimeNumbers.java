package MathsProblems;

public class PrimeNumbers {

    public static void main(String[] args) {
        int A = 10;
        int B = 25;

        for(int i=A; i< B; i++){
            boolean flag = true;
            for(int j=2; j*j<i; j++){
                if(i%j==0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println(i);
            }
        }
    }
}

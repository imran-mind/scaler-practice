public class NumOfFactors {

    public static int numOfFactors(int n){
        int i=1;
        int count=0;
        while (i<=n){
            if(n%i == 0){
                System.out.println("fact "+i);
                count++;
            }

            i++;
        }
        return count;
    }
    public static int numOfFatctorsOpt(int n){
        int c =0;
        for(int i=1; i*i<=n; i++){
            if(n%i == 0){
                if(i*i == n)
                    c = c + 1;
                else
                    c = c + 2;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        int n = 16;
//        System.out.println(numOfFactors(n));
        System.out.println(numOfFatctorsOpt(n));
    }
}

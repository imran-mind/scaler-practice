public class IsPerfectSquare {

    public static int perfectNumSum(int n){
        int sum = 0;
        for(int i=1; i<n; i++){
           if(n % i == 0){
//               System.out.println(i);
               sum = sum + i;
           }
        }
//        System.out.println(sum);
        return sum;
    }
    public static void main(String[] args) {
        int n = 6;
        int res = perfectNumSum(n);
        if(res == n)
            System.out.println("YES");
        else
            System.out.println("NO");
//        System.out.println(isPerfectSquare(n));
    }
}

package array.subarray;

public class StarPattern {
    public static void star(int n){
        for(int i=0; i<n; i++){

            for(int j=0; j<n-i; j++){
//                System.out.print("* ");
                System.out.print("*");
            }
            for(int k=0; k<i; k++){
//                System.out.print("    ");
                System.out.print("  ");

            }
            for(int j=0; j<n-i; j++){
                String star = j < n-(i+1) ? "*" : "*";
                System.out.print(star);
            }
            System.out.println();

        }
        for(int i=0; i<=n-1; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            int s = (n-i)-1;
            for(int k=0; k<s; k++){
//                System.out.print("    ");
                System.out.print("  ");

            }
            for(int j=0; j<=i; j++){
                String star = j < i ? "*" : "*";
                System.out.print(star);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 4;
        star(n);

    }
}

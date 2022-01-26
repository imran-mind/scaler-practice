package array;

public class PrintNegative {
    public static void main(String[] args) {
        int[] a = {1,-5, 2, -8, -4};
        for(int i=0; i<a.length; i++){
            int val = a[i];
            if(val < 0){
                System.out.print(val+" ");
            }
        }
    }
}

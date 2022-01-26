package array;

public class ReverseArray {
    public static void reverseArr(int[] a,int n){
        for(int i=n-1; i>=0; i--){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] a = {2,3,4,5,6};
        reverseArr(a,a.length);
    }
}

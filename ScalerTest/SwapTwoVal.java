import java.lang.reflect.Array;
import java.util.Arrays;

public class SwapTwoVal {

    public static void swap(int[] a,int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
//        return a;
    }
    public static void main(String[] args) {
        int[] p = {1,3,5,7,2,9,10};
        swap(p,3,5);
        System.out.println(Arrays.toString(p));
    }
}

package array;

public class CountOfSmallerElements {

    public static long countOfElements(long a[], long n, long x){
        long count =0;
        for(int i=0; i<n; i++){
            if(a[i] <= x)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int N = 6;
        long[] A = {1, 2, 4, 5, 8, 10};
        int X = 9;
        System.out.println(countOfElements(A,N,X));
    }
}

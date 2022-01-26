package array;

public class LinearSearch {
    public static int linearSearch(int[] a, int b){

        for(int i=0; i<a.length; i++){
            if(a[i] == b){
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2,8};
        int searchVal = 5;
        System.out.println(linearSearch(arr,searchVal));
    }
}

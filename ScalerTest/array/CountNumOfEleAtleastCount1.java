package array;

public class CountNumOfEleAtleastCount1 {

    public static int getCount(int[]  arr){
        int n = arr.length;
        int max = arr[0];
        int count = 0;
        for(int i=1; i<n; i++){
            if(arr[i] > max)
                max = arr[i];
        }
        for(int i=0;i<n; i++){
            if(arr[i] == max)
                count++;
        }
        return n-count;
    }

    public static boolean sumOfPair(int[] arr, int k){
        int n = arr.length-1;
        for(int i=n; i>=0; i--){

            for(int j=0; j<i; j++){
                System.out.println(i+" "+j);
            }
            System.out.println();
        }
        return false;
    }
    public static void main(String[] args) {
        int[] a= {2,3,10,7,3,2,10,8};
        int[] b= {2,3,4,5,6};
//        System.out.println(getCount(a));
        sumOfPair(b, 6);
    }
}

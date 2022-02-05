package array;

public class ThreeConsecutiveOdds {

    public static boolean threeConsecutiveOdds(int[] arr) {
        int c=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 != 0){
                //odd
                c++;
                if(c == 3){
                    return true;
                }
            }else{
                //even
                c=0;
            }
        }
        return false;
    }
    public static void main(String[] args) {
//        int[] arr = {1,2,34,3,4,5,7,23,12};
        int[] arr ={2,6,4,1,3,5,9};
        System.out.println(threeConsecutiveOdds(arr));
    }
}

package array;

public class CarryForwardPractice {


    //right to left carry forward
    public static int findPairCount(char[] arr){
        int count = 0;
        int ans = 0;
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i] == 'g')
                count++;
            else if(arr[i] =='a')
                ans= ans + count;
        }
        return ans;
    }

    //left to right carry forward
    public static int findPairCount2(char[] arr){
        int count = 0;
        int ans = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 'a')
                count++;
            else if(arr[i] =='g')
                ans= ans + count;
        }
        return ans;
    }
    // TC  O(n)
    // SC  O(1)
    public static void main(String[] args) {
        char[] a = {'a','c', 'g','d','g', 'a','g'};
        System.out.println(findPairCount2(a));
    }
}

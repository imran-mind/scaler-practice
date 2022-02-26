package array;

public class LeaderOfTheArray {

    // TC O(n)
    // SC O(1)
    public static int getLeadersCount(int[] arr){
        int n = arr.length;
        int max = arr[n-1];
        int count = 1;
        for(int i=n-2; i>=0; i--){
            if(arr[i] > max) {
                max = arr[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {8,-2,4,7,6,5,1};//{10,7,9,3,2,4};
        int ans = getLeadersCount(arr);
        System.out.println(ans);
    }
}
